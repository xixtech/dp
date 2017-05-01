package controllers;

import models.*;
import models.utils.Check;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.*;

/**
 * Created by Martin on 03.02.2017.
 */
@Security.Authenticated(Secured.class)
public class TableController extends Controller {


    public Result listPerson() {
        return ok(views.html.tables.workers.render(Member.search()));
    }

    public Result listStudyPlans() {
        return ok(views.html.tables.tableStudyPlans.render(StudyPlans.search()));
    }

    public Result listScheduleInWeeks() {
        return ok(views.html.tables.tableScheduleInWeeks.render(ScheduleInWeeks.search()));
    }

    public Result listSchedule() {
        return ok(views.html.tables.tableSchedule.render(Schedule.search()));
    }

    public Result listEmployees() {
        return ok(views.html.tables.tableEmployees.render(Employees.search()));
    }

    public Result listTeachers() {
        return ok(views.html.tables.tableTeachers.render(Teachers.search()));
    }

    public Result listStudyGroups() {
        return ok(views.html.tables.tableStudyGroups.render(StudyGroups.search()));
    }

    public Result listSemesters() {
        return ok(views.html.tables.tableSemesters.render(Semesters.search()));
    }

    public Result listSubjects() {
        return ok(views.html.tables.tableSubjects.render(Subjects.search()));
    }

    public Result listFieldsOfStudy() {
        return ok(views.html.tables.tableFieldsOfStudy.render(FieldsOfStudy.search()));
    }

    public Result listCourses() {
        return ok(views.html.tables.tableCourses.render(Courses.search()));
    }

    public Result listCurrentSemesters() {
        return ok(views.html.tables.tableCurrentSemesters.render(CurrentSemesters.search()));
    }

    public Result listCurrentSemestersUntilTheEndOfStudy() {
        return ok(views.html.tables.tableCurrentSemestersUntilTheEndOfStudy.render(CurrentSemestersUntilTheEndOfStudy.search()));
    }

    public Result listDays() {
        if (Check.isDirector(Member.findByEmail(request().username()))) {
            return ok(views.html.tables.tableDays.render(Days.search()));
        }
        notAccess();
        return redirect(routes.Application.index());

    }

    public Result listTeachersRole() {
        if (Check.isDirector(Member.findByEmail(request().username()))) {
            return ok(views.html.tables.tableTeachersRole.render(TeachersRole.search()));
        }
        notAccess();
        return redirect(routes.Application.index());

    }

    public Result listClassrooms() {
        if (Check.isDirector(Member.findByEmail(request().username()))) {
            return ok(views.html.tables.tableClassroom.render(Classroom.search()));
        }
        notAccess();
        return redirect(routes.Application.index());

    }

    public Result listCommittees() {
        List<Committee> com = Committee.search();
        List<CommitteeParticipants> compart = CommitteeParticipants.search();
        List<Semesters> s = Semesters.search();
        return ok(views.html.tables.tableCommittees.render(com, compart, s));
    }

    public Result listPublications() {
        List<Publications> pub = Publications.search();
        List<PublicationsParticipants> pubpart = PublicationsParticipants.search();
        List<Semesters> s = Semesters.search();
        return ok(views.html.tables.tablePublications.render(pub, pubpart, s));
    }

    public Result listTeachersInWeeks() {
        List<TeachersInWeeks> tiw = TeachersInWeeks.search();
        List<ScheduleInWeeks> siw = ScheduleInWeeks.search();
        List<Semesters> s = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> t = Teachers.search();
        return ok(views.html.tables.tableTeachersInWeeks.render(s, tiw, siw, c, t));
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
