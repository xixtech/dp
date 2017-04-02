package controllers;

import models.*;
import models.Days;
import org.joda.time.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class CourseController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Courses> coursesForm = formFactory.form(Courses.class);
        Form<ScheduleInWeeks> scheduleInWeeksForm = formFactory.form(ScheduleInWeeks.class);
        return ok(views.html.formCourse.render(coursesForm, scheduleInWeeksForm, ScheduleInWeeks.search()));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<Courses> coursesForm = formFactory.form(Courses.class).bindFromRequest();
        Form<ScheduleInWeeks> scheduleInWeeksForm = formFactory.form(ScheduleInWeeks.class).bindFromRequest();
        if (coursesForm.hasErrors()) {
            return badRequest(views.html.formCourse.render(coursesForm, scheduleInWeeksForm, ScheduleInWeeks.search()));
        }

        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveCourse(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.formCourse.render(coursesForm, scheduleInWeeksForm, ScheduleInWeeks.search()));
        }
    }

    private void saveCourse(Map<String, String[]> formData) throws Exception {

        List<Integer> scheduleWeek = new ArrayList<>();

        for (String insId : formData.get("scheduleWeek")) {
            scheduleWeek.add(Integer.parseInt(insId));
        }

        List<Integer> scheduleYear = new ArrayList<>();

        for (String insId : formData.get("scheduleYear")) {
            scheduleYear.add(Integer.parseInt(insId));
        }

        List<String> semesters = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semesters.add(insId);
        }

        List<String> course = new ArrayList<>();

        for (String insId : formData.get("course")) {
            course.add(insId);
        }

        List<Integer> numberOfStudents = new ArrayList<>();

        for (String insId : formData.get("numberOfStudents")) {
            numberOfStudents.add(Integer.parseInt(insId));
        }

        List<String> days = new ArrayList<>();

        for (String insId : formData.get("days.id")) {
            days.add(insId);
        }


        List<String> scheduleFrom = new ArrayList<>();

        for (String insId : formData.get("scheduleFrom")) {
            scheduleFrom.add(insId);
        }

        List<String> scheduleTo = new ArrayList<>();

        for (String insId : formData.get("scheduleTo")) {
            scheduleTo.add(insId);
        }

        List<String> classRoom = new ArrayList<>();

        for (String insId : formData.get("classRoom")) {
            classRoom.add(insId);
        }

        List<String> teachers = new ArrayList<>();

        for (String insId : formData.get("teachers.id")) {
            teachers.add(insId);
        }

        List<Integer> teachersScale = new ArrayList<>();

        for (String insId : formData.get("teachers.scale")) {
            teachersScale.add(Integer.parseInt(insId));
        }

        long courseID = 0;
        Courses c = null;
        for (int i = 0; i < course.size(); i++) {
            c = new Courses(course.get(i), numberOfStudents.get(i), Semesters.findById(Long.parseLong(semesters.get(i))));
            c.save();
            courseID = c.getId();
            for (int j = 0; j < teachers.size(); j++) {
                Teachers t = new Teachers(c, Employees.findById(Long.parseLong(teachers.get(j))), teachersScale.get(j));
                t.save();
            }
        }

        for (int i = 0; i < scheduleWeek.size(); i++) {
            ScheduleInWeeks sw = new ScheduleInWeeks(Semesters.findById(Long.parseLong(semesters.get(0))), c, Days.findById(Long.parseLong(days.get(0))), scheduleFrom.get(0), scheduleTo.get(0), classRoom.get(0),
                    scheduleWeek.get(i), scheduleYear.get(i));

            sw.save();


        }


    }

}
