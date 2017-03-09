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
        List<CriteriaLector> cl = CriteriaLector.search();
        List<ItemsKPI> ik = ItemsKPI.search();
        List<Double> clDouble = new ArrayList<Double>();
        List<Double> ikDouble = new ArrayList<Double>();

        for (CriteriaLector i : cl) {
            clDouble.add(Double.parseDouble(i.getValueLektor()));
        }
        for (ItemsKPI i : ik) {
            if (i.getWeight() == null || i.getWeight().isEmpty()) {
                ikDouble.add(0.0);
            } else {
                ikDouble.add(Double.parseDouble(i.getWeight()));
            }
        }

        /*ZH AAA,AAB,AB,CB*/
        double v1 = ((Double.parseDouble(registerLector.valuesKPIPrevious.get(2)) * ikDouble.get(2) +
                Double.parseDouble(registerLector.valuesKPIPrevious.get(3)) * ikDouble.get(3) +
                Double.parseDouble(registerLector.valuesKPIPrevious.get(4)) * ikDouble.get(4) +
                (0.3) * 0) / (2 * clDouble.get(0))) +
                ((Double.parseDouble(registerLector.valuesKPICurrent.get(2)) * ikDouble.get(2) +
                        Double.parseDouble(registerLector.valuesKPICurrent.get(3)) * ikDouble.get(3) +
                        Double.parseDouble(registerLector.valuesKPICurrent.get(4)) * ikDouble.get(4) +
                        (0.3) * 0) / (2 * clDouble.get(0)));
        if (v1 > 1) {
            v1 = 1.0;
        } else {
            v1 = Math.round(v1 * 100);
            v1 = v1 / 100;
        }

        /*DH AAA,AAB,AB,CB*/
        double v2 = ((Double.parseDouble(registerLector.valuesKPIPrevious.get(2)) * ikDouble.get(2) +
                Double.parseDouble(registerLector.valuesKPIPrevious.get(3)) * ikDouble.get(3) +
                Double.parseDouble(registerLector.valuesKPIPrevious.get(4)) * ikDouble.get(4) +
                (0.3) * 0 - v1 * clDouble.get(0)) / (2 * clDouble.get(2))) + ((Double.parseDouble(registerLector.valuesKPICurrent.get(2)) * ikDouble.get(2) +
                Double.parseDouble(registerLector.valuesKPICurrent.get(3)) * ikDouble.get(3) +
                Double.parseDouble(registerLector.valuesKPICurrent.get(4)) * ikDouble.get(4) +
                (0.3) * 0) / (2 * 2 * clDouble.get(0)));

        /*DH AC*/
        double v3 = (Double.parseDouble(registerLector.valuesKPIPrevious.get(5)) / clDouble.get(3)) + ((Double.parseDouble(registerLector.valuesKPICurrent.get(5)) / clDouble.get(3)));

        /*DH AE*/
        double v4 = (Double.parseDouble(registerLector.valuesKPIPrevious.get(7)) / clDouble.get(4)) + ((Double.parseDouble(registerLector.valuesKPICurrent.get(7)) / clDouble.get(4)));

         /*DH BAM CCA*/
        double v5 = (
                ((ikDouble.get(10) * Double.parseDouble(registerLector.valuesKPIPrevious.get(10)) +
                        ikDouble.get(11) * Double.parseDouble(registerLector.valuesKPIPrevious.get(11)) +
                        ikDouble.get(12) * Double.parseDouble(registerLector.valuesKPIPrevious.get(12)) +
                        ikDouble.get(13) * Double.parseDouble(registerLector.valuesKPIPrevious.get(13)) +
                        ikDouble.get(14) * Double.parseDouble(registerLector.valuesKPIPrevious.get(14)) +
                        ikDouble.get(15) * Double.parseDouble(registerLector.valuesKPIPrevious.get(15)) +
                        ikDouble.get(16) * Double.parseDouble(registerLector.valuesKPIPrevious.get(16)) +
                        ikDouble.get(17) * Double.parseDouble(registerLector.valuesKPIPrevious.get(17)) +
                        ikDouble.get(18) * Double.parseDouble(registerLector.valuesKPIPrevious.get(18)) +
                        ikDouble.get(19) * Double.parseDouble(registerLector.valuesKPIPrevious.get(19)) +
                        ikDouble.get(20) * Double.parseDouble(registerLector.valuesKPIPrevious.get(20)) +
                        ikDouble.get(21) * Double.parseDouble(registerLector.valuesKPIPrevious.get(21)) +
                        ikDouble.get(22) * Double.parseDouble(registerLector.valuesKPIPrevious.get(22)) +
                        ikDouble.get(27) * Double.parseDouble(registerLector.valuesKPIPrevious.get(27))
                ) / clDouble.get(5)) +
                        ((ikDouble.get(10) * Double.parseDouble(registerLector.valuesKPICurrent.get(10)) +
                                ikDouble.get(11) * Double.parseDouble(registerLector.valuesKPICurrent.get(11)) +
                                ikDouble.get(12) * Double.parseDouble(registerLector.valuesKPICurrent.get(12)) +
                                ikDouble.get(13) * Double.parseDouble(registerLector.valuesKPICurrent.get(13)) +
                                ikDouble.get(14) * Double.parseDouble(registerLector.valuesKPICurrent.get(14)) +
                                ikDouble.get(15) * Double.parseDouble(registerLector.valuesKPICurrent.get(15)) +
                                ikDouble.get(16) * Double.parseDouble(registerLector.valuesKPICurrent.get(16)) +
                                ikDouble.get(17) * Double.parseDouble(registerLector.valuesKPICurrent.get(17)) +
                                ikDouble.get(18) * Double.parseDouble(registerLector.valuesKPICurrent.get(18)) +
                                ikDouble.get(19) * Double.parseDouble(registerLector.valuesKPICurrent.get(20)) +
                                ikDouble.get(20) * Double.parseDouble(registerLector.valuesKPICurrent.get(21)) +
                                ikDouble.get(21) * Double.parseDouble(registerLector.valuesKPICurrent.get(22)) +
                                ikDouble.get(22) * Double.parseDouble(registerLector.valuesKPICurrent.get(23))) / clDouble.get(5))
        );

         /*DH AD,BB,CCB,CD*/
        double v6 = (
                (ikDouble.get(6) * Double.parseDouble(registerLector.valuesKPIPrevious.get(6)) +
                        ikDouble.get(23) * Double.parseDouble(registerLector.valuesKPIPrevious.get(23)) +
                        ikDouble.get(28) * Double.parseDouble(registerLector.valuesKPIPrevious.get(28)) +
                        ikDouble.get(29) * Double.parseDouble(registerLector.valuesKPIPrevious.get(29))) / clDouble.get(6)) +
                ((ikDouble.get(6) * Double.parseDouble(registerLector.valuesKPICurrent.get(6)) +
                        ikDouble.get(23) * Double.parseDouble(registerLector.valuesKPICurrent.get(23)) +
                        ikDouble.get(28) * Double.parseDouble(registerLector.valuesKPICurrent.get(28)) +
                        ikDouble.get(29) * Double.parseDouble(registerLector.valuesKPICurrent.get(29))) / clDouble.get(6)
                );

        double v7pom = Double.parseDouble(registerLector.valuesKPIPrevious.get(30)) + Double.parseDouble(registerLector.valuesKPICurrent.get(30));
        if (v7pom > 1) {
            v7pom = 1.0;
        }
        /*DH CA,D*/
        double v7 = (Double.parseDouble(registerLector.valuesKPIPrevious.get(25)) / clDouble.get(7)) +
                (Double.parseDouble(registerLector.valuesKPICurrent.get(25)) / clDouble.get(7)) + v7pom;

        /*ZH základní hodnotící jednotky*/
        double v8=0.0;
        if(v1==1){
            v8=1.0;
        }

        /*DH OO nad 100%*/
        double v9=0.0;
        double v9pom=v2+v3+v4+v5+v6+v7;
        if(v8==1 && v9pom>1){
            v9=v9pom-1;
        }else{
            v9=0.0;
        }

        /*DH OO nad 33%*/
        double v10=0.0;
        double v10pom=v2+v3+v4+v5+v6+v7;
        if(v8==1 && v9pom<=1){
            v10=v10pom;
        }else{
            v10=0.0;
        }

        double plat=0.0;
        double bonus=0.0;
        if(v8==0){
            bonus=0.0;
        }else{
            if(v9pom>1){
                bonus=registerLector.personalEvaluation*(1+(0.2*v9));
            }else{
                bonus=registerLector.personalEvaluation*1*v10;
            }
        }
        plat=registerLector.basicSalary+bonus;


        PersonSalary ps = new PersonSalary(registerLector.obligation, registerLector.basicSalary, registerLector.personalEvaluation, registerLector.personalEvaluationPct, plat);
        ps.save();

        String a=v1+", "+v2+", "+v3+", "+v4+", "+v5+", "+v6+", "+v7+", "+v8+", "+v9+", "+v10+"";

        StringBuffer sb = new StringBuffer();
        String delim = "";
        for (String i : registerLector.valuesKPIPrevious) {
            sb.append(delim).append(i);
            delim = ",";
        }
        ps.setValuePrevious(a);

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
