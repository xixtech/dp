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

        List<Boolean> credit = new ArrayList<>();
        if (formData.containsKey("credit")) {
            for (String insId : formData.get("credit")) {
                if (insId != null) {
                    credit.add(Boolean.parseBoolean(insId));
                } else {
                    credit.add(false);
                }
            }
        } else {
            credit.add(false);
        }

        List<Boolean> formPresentation = new ArrayList<>();
        if (formData.containsKey("formPresentation")) {
            for (String insId : formData.get("formPresentation")) {
                if (insId != null) {
                    formPresentation.add(Boolean.parseBoolean(insId));
                } else {
                    formPresentation.add(false);
                }
            }
        } else {
            formPresentation.add(false);
        }

        List<String> identOld = new ArrayList<>();

        for (String insId : formData.get("identOld")) {
            identOld.add(insId);
        }

        List<String> hoursC = new ArrayList<>();

        for (String insId : formData.get("hoursC")) {
            hoursC.add(insId);
        }

        List<Boolean> exam = new ArrayList<>();
        if (formData.containsKey("exam")) {
            for (String insId : formData.get("exam")) {
                if (insId != null) {
                    exam.add(Boolean.parseBoolean(insId));
                } else {
                    exam.add(false);
                }
            }
        } else {
            exam.add(false);
        }

        List<Boolean> formCombined = new ArrayList<>();
        if (formData.containsKey("formCombined")) {
            for (String insId : formData.get("formCombined")) {
                if (insId != null) {
                    formCombined.add(Boolean.parseBoolean(insId));
                } else {
                    formCombined.add(false);
                }
            }
        } else {
            formCombined.add(false);
        }

        List<String> titleC = new ArrayList<>();

        for (String insId : formData.get("titleC")) {
            titleC.add(insId);
        }

        List<String> credits = new ArrayList<>();

        for (String insId : formData.get("credits")) {
            credits.add(insId);
        }

        List<Boolean> classifiedCredit = new ArrayList<>();
        if (formData.containsKey("classifiedCredit")) {
            for (String insId : formData.get("classifiedCredit")) {
                if (insId != null) {

                    classifiedCredit.add(Boolean.parseBoolean(insId));
                } else {
                    classifiedCredit.add(false);
                }
            }
        } else {
            classifiedCredit.add(false);
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


        List<Integer> scheduleWeek = new ArrayList<>();

        for (String insId : formData.get("scheduleWeek")) {
            scheduleWeek.add(Integer.parseInt(insId));
        }

        List<Integer> scheduleYear = new ArrayList<>();

        for (String insId : formData.get("scheduleYear")) {
            scheduleYear.add(Integer.parseInt(insId));
        }

        long courseID = 0;
        Courses c = null;
        for (int i = 0; i < course.size(); i++) {
            c = new Courses(course.get(i), numberOfStudents.get(i), Semesters.findById(Long.parseLong(semesters.get(i))));
            c.save();
            courseID = c.getId();
            for (int j = 0; j < teachers.size(); j++) {
                Teachers t=new Teachers(c,Employees.findById(Long.parseLong(teachers.get(j))),teachersScale.get(j));
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
