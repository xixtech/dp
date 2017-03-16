package controllers;

import models.Employees;
import models.StudyGroups;
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
public class StudyGroupsController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<StudyGroups> studyGroupsForm = formFactory.form(StudyGroups.class);
        return ok(views.html.registerStudyGroups.render(studyGroupsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<StudyGroups> studyGroupsForm = formFactory.form(StudyGroups.class).bindFromRequest();
        if (studyGroupsForm.hasErrors()) {
            return badRequest(views.html.registerStudyGroups.render(studyGroupsForm));
        }
        StudyGroups studyGroups = studyGroupsForm.get();
        try {
            saveStudyGroups(studyGroups);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerStudyGroups.render(studyGroupsForm));
        }
    }

    private void saveStudyGroups (StudyGroups studyGroups) throws Exception {

    }

}
