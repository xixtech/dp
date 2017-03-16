package controllers;

import models.Employees;
import models.StudyGroups;
import models.StudyGroups1;
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
        StudyGroups sg=new StudyGroups(studyGroups.studyGroup,studyGroups.studyGroupP,studyGroups.studyGroupV,studyGroups.studyGroupsNote);
        sg.save();

        StudyGroups1 sg1=new StudyGroups1(studyGroups.studyGroup,studyGroups.studyGroupP,studyGroups.studyGroupV,studyGroups.studyGroupsNote);
        sg1.save();
    }

}
