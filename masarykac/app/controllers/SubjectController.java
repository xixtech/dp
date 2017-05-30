package controllers;

import models.Employees;
import models.Subjects;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class SubjectController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class);
        return ok(views.html.registerSubject.render(subjectsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class).bindFromRequest();
        if (subjectsForm.hasErrors()) {
            return badRequest(views.html.registerSubject.render(subjectsForm));
        }
        Subjects subjects = subjectsForm.get();

        List<Subjects> ou = Subjects.findIdent(subjects.getIdent());
        if(ou.size()>0){
            return badRequest(views.html.registerSubject.render(subjectsForm));
        }
        try {
            saveSubject(subjects);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerSubject.render(subjectsForm));
        }
    }

    private void saveSubject(Subjects subjectForm) throws Exception {
        Subjects subjects=new Subjects(subjectForm.ident, subjectForm.identOld,subjectForm.titleC, subjectForm.titleA,
                subjectForm.hoursP, subjectForm.hoursC,subjectForm.hoursSemester,subjectForm.credits,subjectForm.credit,subjectForm.exam,subjectForm.classifiedCredit,
                subjectForm.department,subjectForm.formPresentation,subjectForm.formCombined);
        subjects.save();

    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
