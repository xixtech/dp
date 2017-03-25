package controllers;

import models.OrganizationalUnits;
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
public class OrganizationalUnitsController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<OrganizationalUnits> organizationalUnitsForm = formFactory.form(OrganizationalUnits.class);
        return ok(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<OrganizationalUnits> organizationalUnitsForm = formFactory.form(OrganizationalUnits.class).bindFromRequest();
        if (organizationalUnitsForm.hasErrors()) {
            return badRequest(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
        }

        try {

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects = new Subjects(subjectForm.ident, subjectForm.identOld, subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC, subjectForm.hoursSemester, subjectForm.credits, subjectForm.credit, subjectForm.exam, subjectForm.classifiedCredit,
                subjectForm.department, subjectForm.formPresentation, subjectForm.formCombined);
        subjects.save();

    }

}
