package controllers;

import models.CriteriaKPI;
import models.Member;
import models.Methodics;
import models.PersonSalary;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import javax.inject.Inject;
/**
 * Created by Martin on 05.03.2017.
 */
@Security.Authenticated(Secured.class)
public class SalaryController extends Controller {
    @Inject
    private FormFactory formFactory;
    public Result printLector(Long id) {
        return redirect(routes.SalaryController.detailsListLector(id));

    }

    /**
     * vypsání údajů konrétní osoby
     *
     * @param id
     * @return
     */
    public Result detailsListLector(long id) {
        Member member=Member.find.byId(id);
        Form<PersonSalary> personSalaryForm = formFactory.form(PersonSalary.class);
        return ok(views.html.lectorCalculation.render(member,personSalaryForm, CriteriaKPI.search()));
    }


    public Result saveLector() {
        Form<PersonSalary> personSalaryForm = formFactory.form(PersonSalary.class).bindFromRequest();

        PersonSalary registerLector = personSalaryForm.get();

        PersonSalary ps=new PersonSalary(registerLector.obligation,registerLector.basicSalary,registerLector.personalEvaluation,registerLector.personalEvaluationPct,registerLector.evaluationParticipation);
        ps.save();

        return redirect(routes.Application.index());

    }

}
