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
public class VisitsController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Visits> visitsForm = formFactory.form(Visits.class);
        Form<VisitsParticipants> visitsParticipantsForm = formFactory.form(VisitsParticipants.class);
        return ok(views.html.registerVisits.render(visitsForm, visitsParticipantsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() throws Exception {
        Form<Visits> visitsForm = formFactory.form(Visits.class).bindFromRequest();
        Form<VisitsParticipants> visitsParticipantsForm = formFactory.form(VisitsParticipants.class).bindFromRequest();

        Map<String, String[]> formData = request().body().asFormUrlEncoded();

            saveVisit(formData);
            return redirect(routes.Application.index());

    }

    private void saveVisit(Map<String, String[]> formData) throws Exception {

        List<String> purposeOfVisit = new ArrayList<>();

        for (String insId : formData.get("purposeOfVisit")) {
            purposeOfVisit.add(insId);
        }

        List<String> country = new ArrayList<>();

        for (String insId : formData.get("country")) {
            country.add(insId);
        }

        List<String> event = new ArrayList<>();

        for (String insId : formData.get("event")) {
            event.add(insId);
        }

        List<Date> visitFrom = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);

        for (String insId : formData.get("visitFrom")) {

            visitFrom.add(format.parse(insId));
        }

        List<Date> visitTo = new ArrayList<>();

        for (String insId : formData.get("visitTo")) {
            visitTo.add(format.parse(insId));
        }

        List<String> semester = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semester.add(insId);
        }

        List<String> employees = new ArrayList<>();

        for (String insId : formData.get("employees.id")) {
            employees.add(insId);
        }

        long visitId = 0;

        for (int i = 0; i < purposeOfVisit.size(); i++) {

            Visits v = new Visits(purposeOfVisit.get(i), country.get(i), event.get(i), visitFrom.get(i), visitTo.get(i), Semesters.findById(Long.parseLong(semester.get(i))));
            v.save();
            visitId = v.getId();
        }

        for (int i = 0; i < employees.size(); i++) {

            VisitsParticipants vp = new VisitsParticipants(Employees.findById(Long.parseLong(employees.get(i))), Visits.findById(visitId));
            vp.save();
        }
    }
}
