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
        List<CriteriaLector> cl=CriteriaLector.search();
        List<ItemsKPI> ik=ItemsKPI.search();
        List<Double> clDouble=new ArrayList<Double>();
        List<Double> ikDouble=new ArrayList<Double>();

        for (CriteriaLector i : cl) {
           clDouble.add(Double.parseDouble(i.getValueLektor()));
        }
        for (ItemsKPI i : ik) {
            if (i.getWeight()==null||i.getWeight().isEmpty()){
             ikDouble.add(0.0);
            }
            else {
                ikDouble.add(Double.parseDouble(i.getWeight()));
            }
        }

        double zh=0;
        double v1=((Double.parseDouble(registerLector.valuesKPIPrevious.get(2)) * ikDouble.get(2)+
                Double.parseDouble(registerLector.valuesKPIPrevious.get(3)) * ikDouble.get(3)+
                Double.parseDouble(registerLector.valuesKPIPrevious.get(4)) * ikDouble.get(4)+
                (0.3)*0)/(2*clDouble.get(0)))+
                ((Double.parseDouble(registerLector.valuesKPICurrent.get(2)) * ikDouble.get(2)+
                Double.parseDouble(registerLector.valuesKPICurrent.get(3)) * ikDouble.get(3)+
                Double.parseDouble(registerLector.valuesKPICurrent.get(4)) * ikDouble.get(4)+
                (0.3)*0)/(2*clDouble.get(0)));
        if(v1>1){
            v1=1.0;
        }else{
            v1=Math.round(v1*100);
            v1=v1/100;
        }



        PersonSalary ps = new PersonSalary(registerLector.obligation, registerLector.basicSalary, registerLector.personalEvaluation, registerLector.personalEvaluationPct, v1);
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
