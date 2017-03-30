package controllers;

import models.Courses;
import models.Employees;
import models.ScheduleInWeeks;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Map;

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
        Courses courses = coursesForm.get();
        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.formCourse.render(coursesForm,scheduleInWeeksForm,ScheduleInWeeks.search()));
        }
    }



}
