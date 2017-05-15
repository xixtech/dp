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
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.workers.render(Member.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listStudyPlans() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableStudyPlans.render(StudyPlans.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listScheduleInWeeks() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableScheduleInWeeks.render(ScheduleInWeeks.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listSchedule() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableSchedule.render(Schedule.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listEmployees() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableEmployees.render(Employees.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listOJ() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableOJ.render(OrganizationalUnits.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listTeachers() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableTeachers.render(Teachers.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listStudyGroups() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableStudyGroups.render(StudyGroups.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listSemesters() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableSemesters.render(Semesters.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listSubjects() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableSubjects.render(Subjects.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listFieldsOfStudy() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableFieldsOfStudy.render(FieldsOfStudy.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listCourses() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableCourses.render(Courses.search(), Teachers.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listCurrentSemesters() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableCurrentSemesters.render(CurrentSemesters.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listCurrentSemestersUntilTheEndOfStudy() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableCurrentSemestersUntilTheEndOfStudy.render(CurrentSemestersUntilTheEndOfStudy.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listDays() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableDays.render(Days.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listTeachersRole() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableTeachersRole.render(TeachersRole.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listAccessRole() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableAccessRole.render(AccessRole.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listClassrooms() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            return ok(views.html.tables.tableClassroom.render(Classroom.search()));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listCommittees() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            List<Committee> com = Committee.search();
            List<CommitteeParticipants> compart = CommitteeParticipants.search();
            List<Semesters> s = Semesters.search();
            return ok(views.html.tables.tableCommittees.render(com, compart, s));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listPublications() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            List<Publications> pub = Publications.search();
            List<PublicationsParticipants> pubpart = PublicationsParticipants.search();
            List<Semesters> s = Semesters.search();
            return ok(views.html.tables.tablePublications.render(pub, pubpart, s));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public Result listTeachersInWeeks() {
        if (Check.isDirector(Member.findByUID(request().username()))) {
            List<TeachersInWeeks> tiw = TeachersInWeeks.search();
            List<ScheduleInWeeks> siw = ScheduleInWeeks.search();
            List<Semesters> s = Semesters.search();
            List<Courses> c = Courses.search();
            List<Teachers> t = Teachers.search();
            return ok(views.html.tables.tableTeachersInWeeks.render(s, tiw, siw, c, t));
        }
        notAccess();
        return redirect(routes.Application.index());
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
