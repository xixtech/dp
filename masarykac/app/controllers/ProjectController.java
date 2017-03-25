package controllers;

import models.Projects;
import models.ProjectsParticipants;
import models.Subjects;
import models.Visits;
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
public class ProjectController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Projects> projectsForm = formFactory.form(Projects.class);
        Form<ProjectsParticipants> projectsParticipantsForm = formFactory.form(ProjectsParticipants.class);
        return ok(views.html.registerProjects.render(projectsForm,projectsParticipantsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Projects> projectsForm = formFactory.form(Projects.class).bindFromRequest();
        Form<ProjectsParticipants> projectsParticipantsForm = formFactory.form(ProjectsParticipants.class).bindFromRequest();
        if (projectsForm.hasErrors()) {
            return badRequest(views.html.registerProjects.render(projectsForm,projectsParticipantsForm));
        }

        try {

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerProjects.render(projectsForm,projectsParticipantsForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects=new Subjects(subjectForm.ident, subjectForm.identOld,subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC,subjectForm.hoursSemester,subjectForm.credits,subjectForm.credit,subjectForm.exam,subjectForm.classifiedCredit,
                subjectForm.department,subjectForm.formPresentation,subjectForm.formCombined);
        subjects.save();

    }

}
