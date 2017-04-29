package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class PersonalStatisticController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        List<Employees> e = Employees.search();
        List<Teachers> t = Teachers.search();
        List<OrganizationalUnitsParticipants> oj = OrganizationalUnitsParticipants.search();
        List<Courses> c = Courses.search();
        List<Subjects> s = Subjects.searchAAA();
        List<Courses> caaa = Courses.searchAAA();
        List<Courses> caab = Courses.searchAAB();
        List<Courses> cb = Courses.searchCB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingDepartmentEmployee.render(oj, e, c, s, t, caaa, caab, cb, sem,schedules,scheduleInWeekses));
    }

    public Result teachingAAA() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caaa = Courses.searchAAA();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingAAA.render(c, t, caaa, sem,schedules,scheduleInWeekses));
    }
    public Result teachingAAB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caab = Courses.searchAAB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingAAB.render(c, t, caab, sem,schedules,scheduleInWeekses));
    }
    public Result teachingCB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> cb = Courses.searchCB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingCB.render(c, t, cb, sem,schedules,scheduleInWeekses));
    }

    public Result listTableTeachingAccordingToPersons() {
        List<Employees> empl = Employees.find.all();
        List<Teachers> teachers = Teachers.find.all();
        List<Courses> c = Courses.find.all();
        List<Semesters> s = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingAccordingToPersons.render(empl, c, teachers, s,schedules,scheduleInWeekses));
    }

    public Result listTableTeachingAccordingToId(String email) {
        Member m = Member.findByEmail(email);
        List<Employees> empl = new ArrayList<>();
        empl.add(Employees.findById(m.getEmployees().getId()));
        List<Teachers> teachers = Teachers.find.all();
        List<Courses> c = Courses.find.all();
        List<Semesters> s = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.tables.tableTeachingAccordingToPersons.render(empl, c, teachers, s,schedules,scheduleInWeekses));
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
