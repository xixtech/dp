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
public class FinalWorksController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<FinalWorks> finalWorksForm = formFactory.form(FinalWorks.class);
        Form<FinalWorksToEmployees> finalWorksToEmployeesForm = formFactory.form(FinalWorksToEmployees.class);
        return ok(views.html.registerFinalWorks.render(finalWorksForm,finalWorksToEmployeesForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<FinalWorks> finalWorksForm = formFactory.form(FinalWorks.class).bindFromRequest();
        Form<FinalWorksToEmployees> finalWorksToEmployeesForm = formFactory.form(FinalWorksToEmployees.class).bindFromRequest();
        if (finalWorksForm.hasErrors()) {
            return badRequest(views.html.registerFinalWorks.render(finalWorksForm,finalWorksToEmployeesForm));
        }

        try {

            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerFinalWorks.render(finalWorksForm,finalWorksToEmployeesForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects=new Subjects(subjectForm.ident, subjectForm.identOld,subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC,subjectForm.hoursSemester,subjectForm.credits,subjectForm.credit,subjectForm.exam,subjectForm.classifiedCredit,
                subjectForm.department,subjectForm.formPresentation,subjectForm.formCombined);
        subjects.save();

    }

}
