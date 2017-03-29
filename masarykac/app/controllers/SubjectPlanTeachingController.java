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
        return ok(views.html.registerSubjectPlanTeaching.render(subjectsForm,coursesForm,scheduleForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class).bindFromRequest();
        Form<Courses> coursesForm = formFactory.form(Courses.class).bindFromRequest();
        Form<Schedule> scheduleForm = formFactory.form(Schedule.class).bindFromRequest();
        if (subjectsForm.hasErrors()) {
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm,coursesForm,scheduleForm));
        }
        Map<String, String[]> formData = request().body().asFormUrlEncoded();
        Subjects subjects = subjectsForm.get();
        try {

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm,coursesForm,scheduleForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects=new Subjects(subjectForm.ident, subjectForm.identOld,subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC,subjectForm.hoursSemester,subjectForm.credits,subjectForm.credit,subjectForm.exam,subjectForm.classifiedCredit,
                subjectForm.department,subjectForm.formPresentation,subjectForm.formCombined);
        subjects.save();

    }

}
