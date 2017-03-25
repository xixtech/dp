package controllers;

import models.*;
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
public class PublicationsController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Publications> publicationsForm = formFactory.form(Publications.class);
        Form<PublicationsParticipants> publicationsParticipantsForm = formFactory.form(PublicationsParticipants.class);
        return ok(views.html.registerPublications.render(publicationsForm,publicationsParticipantsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Publications> publicationsForm = formFactory.form(Publications.class).bindFromRequest();
        Form<PublicationsParticipants> publicationsParticipantsForm = formFactory.form(PublicationsParticipants.class).bindFromRequest();
        if (publicationsForm.hasErrors()) {
            return badRequest(views.html.registerPublications.render(publicationsForm,publicationsParticipantsForm));
        }

        try {

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerPublications.render(publicationsForm,publicationsParticipantsForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects=new Subjects(subjectForm.ident, subjectForm.identOld,subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC,subjectForm.hoursSemester,subjectForm.credits,subjectForm.credit,subjectForm.exam,subjectForm.classifiedCredit,
                subjectForm.department,subjectForm.formPresentation,subjectForm.formCombined);
        subjects.save();

    }

}
