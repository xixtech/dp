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
import java.util.Map;

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
        return ok(views.html.registerPublications.render(publicationsForm, publicationsParticipantsForm));
    }


    public Result save() {
        Form<Publications> publicationsForm = formFactory.form(Publications.class).bindFromRequest();
        Form<PublicationsParticipants> publicationsParticipantsForm = formFactory.form(PublicationsParticipants.class).bindFromRequest();
        if (publicationsForm.hasErrors() || publicationsParticipantsForm.hasErrors()) {
            return badRequest(views.html.registerPublications.render(publicationsForm, publicationsParticipantsForm));
        }

        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            savePublication(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerPublications.render(publicationsForm, publicationsParticipantsForm));
        }
    }

    private void savePublication(Map<String, String[]> formData) {

        List<String> citation = new ArrayList<>();

        for (String insId : formData.get("citation")) {
            citation.add(insId);
        }
        List<String> type = new ArrayList<>();

        for (String insId : formData.get("type")) {
            type.add(insId);
        }

        List<String> semester = new ArrayList<>();

        for (String insId : formData.get("semester")) {
            semester.add(insId);
        }

        List<String> yearOfPublication = new ArrayList<>();

        for (String insId : formData.get("yearOfPublication")) {
            yearOfPublication.add(insId);
        }

        List<String> employees = new ArrayList<>();
        for (String insId : formData.get("employees.id")) {
            employees.add(insId);
        }

        List<String> faculty = new ArrayList<>();

        for (String insId : formData.get("faculty")) {
            faculty.add(insId);
        }

        List<String> orderInPublication = new ArrayList<>();

        for (String insId : formData.get("orderInPublication")) {
            orderInPublication.add(insId);
        }

        List<String> department = new ArrayList<>();

        for (String insId : formData.get("department")) {
            department.add(insId);
        }

        List<String> share = new ArrayList<>();

        for (String insId : formData.get("share")) {
            share.add(insId);
        }

        long publicationId = 0;

        for (int i = 0; i < citation.size(); i++) {

            Publications p = new Publications(yearOfPublication.get(i), Semesters.findById(i), type.get(i), citation.get(i));
            p.save();
            publicationId = p.getId();
        }

        for (int i = 0; i < employees.size(); i++) {

            PublicationsParticipants pp = new PublicationsParticipants(faculty.get(i), orderInPublication.get(i), department.get(i), share.get(i), Publications.findById(publicationId), Employees.findById(Long.parseLong(employees.get(i))));
            pp.save();

        }

    }

}
