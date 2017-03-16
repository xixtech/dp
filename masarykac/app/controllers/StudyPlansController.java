package controllers;

import models.Semesters;
import models.StudyPlans;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class StudyPlansController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<StudyPlans> studyPlansForm = formFactory.form(StudyPlans.class);
        return ok(views.html.registerStudyPlans.render(studyPlansForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Semesters> semestersForm = formFactory.form(Semesters.class).bindFromRequest();
        if (semestersForm.hasErrors()) {
            return badRequest(views.html.registerSemester.render(semestersForm));
        }
        Semesters semesters = semestersForm.get();
        try {
            saveSemester(semesters);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerSemester.render(semestersForm));
        }
    }

    private void saveSemester (Semesters semesters) throws Exception {

    }

}