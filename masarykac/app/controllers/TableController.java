package controllers;

import models.*;
import models.utils.Check;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

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


    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
