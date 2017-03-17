package controllers;

import models.*;
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

    public Result listEmployees() {
        return ok(views.html.tables.tableEmployees.render(Employees.search()));
    }

    public Result listTeachers() {
        return ok(views.html.tables.tableTeachers.render(Teachers.search()));
    }
}
