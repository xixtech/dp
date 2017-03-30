package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
        Form<FinalWorksParticipants> finalWorksToEmployeesForm = formFactory.form(FinalWorksParticipants.class);
        return ok(views.html.registerFinalWorks.render(finalWorksForm, finalWorksToEmployeesForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<FinalWorks> finalWorksForm = formFactory.form(FinalWorks.class).bindFromRequest();
        Form<FinalWorksParticipants> finalWorksToEmployeesForm = formFactory.form(FinalWorksParticipants.class).bindFromRequest();
        if (finalWorksForm.hasErrors()||finalWorksToEmployeesForm.hasErrors()) {
            return badRequest(views.html.registerFinalWorks.render(finalWorksForm, finalWorksToEmployeesForm));
        }
        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveFinalWork(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerFinalWorks.render(finalWorksForm, finalWorksToEmployeesForm));
        }
    }

    private void saveFinalWork(Map<String, String[]> formData) throws Exception {
        List<String> finalWorksName = new ArrayList<>();

        for (String insId : formData.get("finalWorksName")) {
            finalWorksName.add(insId);
        }


        List<String> names = new ArrayList<>();

        for (String insId : formData.get("names")) {
            names.add(insId);
        }

        List<Date> year = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy", Locale.ENGLISH);

        for (String insId : formData.get("year")) {

            year.add(format.parse(insId));
        }

        List<String> semester = new ArrayList<>();

        for (String insId : formData.get("semester")) {
            semester.add(insId);
        }

        List<String> employees = new ArrayList<>();

        for (String insId : formData.get("employees.id")) {
            employees.add(insId);
        }

        List<String> teachersRole = new ArrayList<>();

        for (String insId : formData.get("teachersRole")) {
            teachersRole.add(insId);
        }

        long finalWorkId = 0;

        for (int i = 0; i < finalWorksName.size(); i++) {
            FinalWorks fw = new FinalWorks(finalWorksName.get(i), names.get(i), year.get(i), semester.get(i));
            fw.save();
            finalWorkId = fw.getId();
        }

        for (int i = 0; i < employees.size(); i++) {
            FinalWorksParticipants fwp = new FinalWorksParticipants(teachersRole.get(i), FinalWorks.findById(finalWorkId), Employees.findById(Long.parseLong(employees.get(i))));
            fwp.save();
        }

    }

}
