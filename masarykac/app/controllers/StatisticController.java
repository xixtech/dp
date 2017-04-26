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
        return ok(views.html.tables.tableDCPS.render(sp, f, s));
    }

    public Result listEmployeesActvitiy() {
        List<Employees> empl = Employees.find.all();
        List<Teachers> teachers = Teachers.find.all();
        List<PublicationsParticipants> publ = PublicationsParticipants.find.all();
        List<FinalWorksParticipants> finalWoks = FinalWorksParticipants.find.all();

        HashMap<Long,  HashMap<Long, Integer>> numOfTeachedSubj = new HashMap<Long,  HashMap<Long, Integer>>();
        HashMap<Long, Integer> numOfPublications = new HashMap<>();
        HashMap<Long, Integer> numOfFinalWoks = new HashMap<>();
        int numberOfFinalWorks = 0;
        int numberOfCommittees = 0;
        int numberOfPublications = 0;
        int numberOfTeachedSubjects = 0;


        for (int i = 0; i < empl.size(); i++) {
            Employees e = empl.get(i);
            HashMap<Long, Integer> teachedSem = new HashMap<>();
            for (int j = 0; j < teachers.size(); j++) {
                if (e.getId().equals(teachers.get(j).getEmployees().getId())) {
                    numberOfTeachedSubjects = 0;
                    if(teachedSem.containsKey(teachers.get(j).getCourses().getSemester().getId())){
                        numberOfTeachedSubjects=teachedSem.get(teachers.get(j).getCourses().getSemester().getId());
                        numberOfTeachedSubjects=numberOfTeachedSubjects+1;
                        teachedSem.put(teachers.get(j).getCourses().getSemester().getId(),numberOfTeachedSubjects);
                    }else{
                        numberOfTeachedSubjects++;
                        teachedSem.put(teachers.get(j).getCourses().getSemester().getId(),numberOfTeachedSubjects);
                    }

                }
            }

            numOfTeachedSubj.put(e.getId(), teachedSem);

            for (int j = 0; j < publ.size(); j++) {
                if (e.getId().equals(publ.get(j).getEmployees().getId())) {
                    numberOfPublications++;
                }
            }
            numOfPublications.put(e.getId(), numberOfPublications);
            numberOfPublications = 0;

            for (int j = 0; j < finalWoks.size(); j++) {
                if (e.getId().equals(finalWoks.get(j).getEmployees().getId())) {
                    numberOfFinalWorks++;
                }
            }
            numOfFinalWoks.put(e.getId(), numberOfFinalWorks);
            numberOfFinalWorks = 0;
        }
        List<TeachersInWeeks> tiw = TeachersInWeeks.search();
        List<ScheduleInWeeks> siw = ScheduleInWeeks.search();
        List<Semesters> s = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> t = Teachers.search();
        return ok(views.html.tables.tableEmployeesActvitiy.render(empl, numOfTeachedSubj, numOfPublications, numOfFinalWoks,s));
    }

    public Result listEmployeerActvitiy(String email) {
        Member m = Member.findByEmail(email);
        List<Employees> empl = new ArrayList<>();
        empl.add(Employees.findById(m.getEmployees().getId()));
        List<Teachers> teachers = Teachers.find.all();
        List<PublicationsParticipants> publ = PublicationsParticipants.find.all();
        List<FinalWorksParticipants> finalWoks = FinalWorksParticipants.find.all();

        HashMap<Long,  HashMap<Long, Integer>> numOfTeachedSubj = new HashMap<Long,  HashMap<Long, Integer>>();
        HashMap<Long, Integer> numOfPublications = new HashMap<>();
        HashMap<Long, Integer> numOfFinalWoks = new HashMap<>();
        int numberOfFinalWorks = 0;
        int numberOfCommittees = 0;
        int numberOfPublications = 0;
        int numberOfTeachedSubjects = 0;


        for (int i = 0; i < empl.size(); i++) {
            Employees e = empl.get(i);
            HashMap<Long, Integer> teachedSem = new HashMap<>();
            for (int j = 0; j < teachers.size(); j++) {
                if (e.getId().equals(teachers.get(j).getEmployees().getId())) {
                    numberOfTeachedSubjects = 0;
                    if(teachedSem.containsKey(teachers.get(j).getCourses().getSemester().getId())){
                        numberOfTeachedSubjects=teachedSem.get(teachers.get(j).getCourses().getSemester().getId());
                        numberOfTeachedSubjects=numberOfTeachedSubjects+1;
                        teachedSem.put(teachers.get(j).getCourses().getSemester().getId(),numberOfTeachedSubjects);
                    }else{
                        numberOfTeachedSubjects++;
                        teachedSem.put(teachers.get(j).getCourses().getSemester().getId(),numberOfTeachedSubjects);
                    }

                }
            }

            numOfTeachedSubj.put(e.getId(), teachedSem);

            for (int j = 0; j < publ.size(); j++) {
                if (e.getId().equals(publ.get(j).getEmployees().getId())) {
                    numberOfPublications++;
                }
            }
            numOfPublications.put(e.getId(), numberOfPublications);
            numberOfPublications = 0;

            for (int j = 0; j < finalWoks.size(); j++) {
                if (e.getId().equals(finalWoks.get(j).getEmployees().getId())) {
                    numberOfFinalWorks++;
                }
            }
            numOfFinalWoks.put(e.getId(), numberOfFinalWorks);
            numberOfFinalWorks = 0;
        }
        List<TeachersInWeeks> tiw = TeachersInWeeks.search();
        List<ScheduleInWeeks> siw = ScheduleInWeeks.search();
        List<Semesters> s = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> t = Teachers.search();
        return ok(views.html.tables.tableEmployeerActvitiy.render(empl, numOfTeachedSubj, numOfPublications, numOfFinalWoks,s));
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
