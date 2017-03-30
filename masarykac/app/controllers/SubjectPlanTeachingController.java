package controllers;

import models.Courses;
import models.Schedule;
import models.Subjects;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class SubjectPlanTeachingController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class);
        Form<Courses> coursesForm = formFactory.form(Courses.class);
        Form<Schedule> scheduleForm = formFactory.form(Schedule.class);
        return ok(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class).bindFromRequest();
        Form<Courses> coursesForm = formFactory.form(Courses.class).bindFromRequest();
        Form<Schedule> scheduleForm = formFactory.form(Schedule.class).bindFromRequest();
        if (subjectsForm.hasErrors()) {
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm));
        }
        Map<String, String[]> formData = request().body().asFormUrlEncoded();

        try {
            saveCourse(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm));
        }
    }

    private void saveCourse(Map<String, String[]> formData) throws Exception {
        List<String> ident = new ArrayList<>();

        for (String insId : formData.get("ident")) {
            ident.add(insId);
        }

        List<String> hoursP = new ArrayList<>();

        for (String insId : formData.get("hoursP")) {
            hoursP.add(insId);
        }

        List<String> credit = new ArrayList<>();

        for (String insId : formData.get("credit")) {
            credit.add(insId);
        }

        List<String> formPresentation = new ArrayList<>();

        for (String insId : formData.get("formPresentation")) {
            formPresentation.add(insId);
        }

        List<String> identOld = new ArrayList<>();

        for (String insId : formData.get("identOld")) {
            identOld.add(insId);
        }

        List<String> hoursC = new ArrayList<>();

        for (String insId : formData.get("hoursC")) {
            hoursC.add(insId);
        }

        List<String> exam = new ArrayList<>();

        for (String insId : formData.get("exam")) {
            exam.add(insId);
        }

        List<String> formCombined = new ArrayList<>();

        for (String insId : formData.get("formCombined")) {
            formCombined.add(insId);
        }

        List<String> titleC = new ArrayList<>();

        for (String insId : formData.get("titleC")) {
            titleC.add(insId);
        }

        List<String> credits = new ArrayList<>();

        for (String insId : formData.get("credits")) {
            credits.add(insId);
        }

        List<String> classifiedCredit = new ArrayList<>();

        for (String insId : formData.get("classifiedCredit")) {
            classifiedCredit.add(insId);
        }

        List<String> titleA = new ArrayList<>();

        for (String insId : formData.get("titleA")) {
            titleA.add(insId);
        }

        List<String> hoursSemester = new ArrayList<>();

        for (String insId : formData.get("hoursSemester")) {
            hoursSemester.add(insId);
        }

        List<String> department = new ArrayList<>();

        for (String insId : formData.get("department")) {
            department.add(insId);
        }

        List<String> semesters = new ArrayList<>();

        for (String insId : formData.get("semester")) {
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
