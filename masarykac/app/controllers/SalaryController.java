package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

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
        Member member = Member.find.byId(id);
        Form<PersonSalary> personSalaryForm = formFactory.form(PersonSalary.class);
        return ok(views.html.lectorCalculation.render(member, personSalaryForm, CriteriaLector.search(), ItemsKPI.search()));
    }


    public Result saveLector() {
        Form<PersonSalary> personSalaryForm = formFactory.form(PersonSalary.class).bindFromRequest();

        PersonSalary registerLector = personSalaryForm.get();

        PersonSalary ps = new PersonSalary(registerLector.obligation, registerLector.basicSalary, registerLector.personalEvaluation, registerLector.personalEvaluationPct, registerLector.evaluationParticipation);
        ps.save();


        StringBuffer sb = new StringBuffer();
        String delim = "";
        for (String i : registerLector.valuesKPIPrevious) {
            sb.append(delim).append(i);
            delim = ",";
        }
        ps.setValuePrevious(sb.toString());

        sb = new StringBuffer();
        delim = "";
        for (String i : registerLector.valuesKPICurrent) {
            sb.append(delim).append(i);
            delim = ",";
        }
        ps.setValueCurrent(sb.toString());
        ps.update();

        return redirect(routes.Application.index());

    }

}
