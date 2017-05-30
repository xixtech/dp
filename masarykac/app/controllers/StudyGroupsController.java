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

    public Result edit(long id) {
        StudyGroups studyGroups = StudyGroups.findById(id);
        Form<StudyGroups> studyGroupsForm = formFactory.form(StudyGroups.class).fill(studyGroups);
        return ok(views.html.editStudyGroups.render(id,studyGroupsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
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

    public Result update(long id) {
        Form<StudyGroups> studyGroupsForm = formFactory.form(StudyGroups.class).bindFromRequest();
        if (studyGroupsForm.hasErrors()) {
            return badRequest(views.html.registerStudyGroups.render(studyGroupsForm));
        }
        StudyGroups studyGroups = studyGroupsForm.get();
        try {
            updateStudyGroups(studyGroups,id);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerStudyGroups.render(studyGroupsForm));
        }
    }

    private void updateStudyGroups(StudyGroups studyGroups, long id) throws Exception {
        StudyGroups sg = StudyGroups.findById(id);
        sg.setStudyGroup(studyGroups.studyGroup);
        sg.setStudyGroupP(studyGroups.studyGroupP);
        sg.setStudyGroupV(studyGroups.studyGroupV);
        sg.setStudyGroupsNote(studyGroups.studyGroupsNote);
        sg.update();

        StudyGroups1 sg1 = StudyGroups1.findById(id);
        sg1.setStudyGroup(studyGroups.studyGroup);
        sg1.setStudyGroupP(studyGroups.studyGroupP);
        sg1.setStudyGroupV(studyGroups.studyGroupV);
        sg1.setStudyGroupsNote(studyGroups.studyGroupsNote);
        sg1.update();
    }

    private void saveStudyGroups(StudyGroups studyGroups) throws Exception {
        StudyGroups sg = new StudyGroups(studyGroups.studyGroup, studyGroups.studyGroupP, studyGroups.studyGroupV, studyGroups.studyGroupsNote);
        sg.save();

        StudyGroups1 sg1 = new StudyGroups1(studyGroups.studyGroup, studyGroups.studyGroupP, studyGroups.studyGroupV, studyGroups.studyGroupsNote);
        sg1.save();
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
