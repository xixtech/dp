package controllers;

import models.*;
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
        return ok(views.html.formCourse.render(coursesForm,scheduleInWeeksForm,ScheduleInWeeks.search()));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Courses> coursesForm = formFactory.form(Courses.class).bindFromRequest();
        Form<ScheduleInWeeks> scheduleInWeeksForm = formFactory.form(ScheduleInWeeks.class).bindFromRequest();
        if (coursesForm.hasErrors()) {
            return badRequest(views.html.formCourse.render(coursesForm,scheduleInWeeksForm,ScheduleInWeeks.search()));
        }

        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveCourse(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.formCourse.render(coursesForm,scheduleInWeeksForm,ScheduleInWeeks.search()));
        }
    }

    private void saveCourse(Map<String, String[]> formData) throws Exception {
        List<String> semesters = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semesters.add(insId);
        }

        List<String> course = new ArrayList<>();

        for (String insId : formData.get("course")) {
            course.add(insId);
        }

        List<String> numberOfStudents = new ArrayList<>();

        for (String insId : formData.get("numberOfStudents")) {
            numberOfStudents.add(insId);
        }

        List<String> scheduleDay = new ArrayList<>();

        for (String insId : formData.get("scheduleDay")) {
            scheduleDay.add(insId);
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

        List<String> teachersScale = new ArrayList<>();

        for (String insId : formData.get("teachers.scale")) {
            teachersScale.add(insId);
        }

        long courseID = 0;

        for (int i = 0; i < course.size(); i++) {


        }

        for (int i = 0; i < teachers.size(); i++) {

        }

        for (int i = 0; i < teachers.size(); i++) {

        }

    }

}
