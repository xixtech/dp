package controllers;

import models.*;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class StatisticController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.search();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> teachers = Teachers.find.all();
        return ok(views.html.tables.tableDCPS.render(sp, f, s,sem,c,teachers));
    }

    public Result studyPlansTable() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.search();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> teachers = Teachers.find.all();
        return ok(views.html.tables.tableSP.render(sp, f, s,sem,c,teachers));
    }
    public Result studyPlansTablePrint() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.search();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> teachers = Teachers.find.all();
        return ok(views.html.tables.tableSPPrint.render(sp, f, s,sem,c,teachers));
    }

    public Result listEmployeesActvitiy() {
        List<Employees> empl = Employees.find.all();
        List<Teachers> teachers = Teachers.find.all();
        List<PublicationsParticipants> publ = PublicationsParticipants.find.all();
        List<FinalWorksParticipants> finalWoks = FinalWorksParticipants.find.all();

        HashMap<Long, HashMap<Long, Integer>> numOfTeachedSubj = new HashMap<Long, HashMap<Long, Integer>>();
        HashMap<Long, HashMap<Long, Integer>> numOfPublications = new HashMap<Long, HashMap<Long, Integer>>();
        HashMap<Long, HashMap<Long, Integer>> numOfFinalWoks = new HashMap<Long, HashMap<Long, Integer>>();


        for (int i = 0; i < empl.size(); i++) {
            Employees e = empl.get(i);
            HashMap<Long, Integer> teachedSem = getNumberOfTeachedSubjectsInSemester(e, teachers);
            numOfTeachedSubj.put(e.getId(), teachedSem);

            HashMap<Long, Integer> publSem = getNumberOfPublicationsInSemester(e, publ);
            numOfPublications.put(e.getId(), publSem);

            HashMap<Long, Integer> finalWSem = getNumberOfFinalWorksInSemester(e, finalWoks);
            numOfFinalWoks.put(e.getId(), finalWSem);
        }

        List<Semesters> s = Semesters.search();
        return ok(views.html.tables.tableEmployeesActvitiy.render(empl, numOfTeachedSubj, numOfPublications, numOfFinalWoks, s));
    }

    public static HashMap<Long, Integer> getNumberOfTeachedSubjectsInSemester(Employees e, List<Teachers> teachers) {
        HashMap<Long, Integer> teachedSem = new HashMap<>();
        int numberOfTeachedSubjects = 0;
        for (int j = 0; j < teachers.size(); j++) {
            if (e.getId().equals(teachers.get(j).getEmployees().getId())) {
                numberOfTeachedSubjects = 0;
                if (teachedSem.containsKey(teachers.get(j).getCourses().getSemester().getId())) {
                    numberOfTeachedSubjects = teachedSem.get(teachers.get(j).getCourses().getSemester().getId());
                    numberOfTeachedSubjects = numberOfTeachedSubjects + 1;
                    teachedSem.put(teachers.get(j).getCourses().getSemester().getId(), numberOfTeachedSubjects);
                } else {
                    numberOfTeachedSubjects++;
                    teachedSem.put(teachers.get(j).getCourses().getSemester().getId(), numberOfTeachedSubjects);
                }
            }
        }
        return teachedSem;
    }

    public static HashMap<Long, Integer> getNumberOfPublicationsInSemester(Employees e, List<PublicationsParticipants> publ) {
        HashMap<Long, Integer> publSem = new HashMap<>();
        int numberOfPublications = 0;
        for (int j = 0; j < publ.size(); j++) {
            if (e.getId().equals(publ.get(j).getEmployees().getId())) {
                numberOfPublications = 0;
                if (publSem.containsKey(publ.get(j).getPublications().getSemester().getId())) {
                    numberOfPublications = publSem.get(publ.get(j).getPublications().getSemester().getId());
                    numberOfPublications = numberOfPublications + 1;
                    publSem.put(publ.get(j).getPublications().getSemester().getId(), numberOfPublications);
                } else {
                    numberOfPublications++;
                    publSem.put(publ.get(j).getPublications().getSemester().getId(), numberOfPublications);
                }
                numberOfPublications++;
            }
        }
        return publSem;
    }

    public static HashMap<Long, Integer> getNumberOfFinalWorksInSemester(Employees e, List<FinalWorksParticipants> finalWoks) {
        int numberOfFinalWorks = 0;
        HashMap<Long, Integer> finalWSem = new HashMap<>();
        for (int j = 0; j < finalWoks.size(); j++) {
            if (e.getId().equals(finalWoks.get(j).getEmployees().getId())) {
                numberOfFinalWorks = 0;
                if (finalWSem.containsKey(finalWoks.get(j).getFinalWorks().getSemester().getId())) {
                    numberOfFinalWorks = finalWSem.get(finalWoks.get(j).getFinalWorks().getSemester().getId());
                    numberOfFinalWorks = numberOfFinalWorks + 1;
                    finalWSem.put(finalWoks.get(j).getFinalWorks().getSemester().getId(), numberOfFinalWorks);
                } else {
                    numberOfFinalWorks++;
                    finalWSem.put(finalWoks.get(j).getFinalWorks().getSemester().getId(), numberOfFinalWorks);
                }
                numberOfFinalWorks++;
            }
        }
        return finalWSem;
    }

    public Result listEmployeerActvitiy(String email) {
        Member m = Member.findByEmail(email);
        List<Employees> empl = new ArrayList<>();
        empl.add(Employees.findById(m.getEmployees().getId()));
        List<Teachers> teachers = Teachers.find.all();
        List<PublicationsParticipants> publ = PublicationsParticipants.find.all();
        List<FinalWorksParticipants> finalWoks = FinalWorksParticipants.find.all();

        HashMap<Long, HashMap<Long, Integer>> numOfTeachedSubj = new HashMap<Long, HashMap<Long, Integer>>();
        HashMap<Long, HashMap<Long, Integer>> numOfPublications = new HashMap<Long, HashMap<Long, Integer>>();
        HashMap<Long, HashMap<Long, Integer>> numOfFinalWoks = new HashMap<Long, HashMap<Long, Integer>>();

        for (int i = 0; i < empl.size(); i++) {
            Employees e = empl.get(i);
            HashMap<Long, Integer> teachedSem = getNumberOfTeachedSubjectsInSemester(e, teachers);
            numOfTeachedSubj.put(e.getId(), teachedSem);

            HashMap<Long, Integer> publSem = getNumberOfPublicationsInSemester(e, publ);
            numOfPublications.put(e.getId(), publSem);

            HashMap<Long, Integer> finalWSem = getNumberOfFinalWorksInSemester(e, finalWoks);
            numOfFinalWoks.put(e.getId(), finalWSem);
        }

        List<Semesters> s = Semesters.search();
        return ok(views.html.tables.tableEmployeerActvitiy.render(empl, numOfTeachedSubj, numOfPublications, numOfFinalWoks, s));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {

        return redirect(routes.Application.index());

    }
}
