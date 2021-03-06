package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
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

        for (String insId : formData.get("semester.id")) {
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

            Publications p = new Publications(yearOfPublication.get(i), Semesters.findById(Long.parseLong(semester.get(i))), type.get(i), citation.get(i));
            p.save();
            publicationId = p.getId();
        }

        PublicationsParticipants[] publPart = new PublicationsParticipants[employees.size()];
        for (int i = 0; i < employees.size(); i++) {

            PublicationsParticipants pp = new PublicationsParticipants(faculty.get(i), orderInPublication.get(i), department.get(i), share.get(i), Publications.findById(publicationId), Employees.findById(Long.parseLong(employees.get(i))));
            pp.save();
            publPart[i] = pp;

        }

        List<Statement> s = Statement.findBySemester(Long.parseLong(semester.get(0)));
        for (int i = 0; i < employees.size(); i++) {
            boolean saved = false;
            if (s.size() > 0) {
                for (Statement statement : s) {
                    if (statement.getEmployees().getId() == Long.parseLong(employees.get(i))) {
                        StatementPublicationsParticipants spp = new StatementPublicationsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), publPart[i], statement);
                        spp.save();
                        saved = true;
                    }
                }
                if (saved == false) {
                    Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                    st.save();
                    StatementPublicationsParticipants spp = new StatementPublicationsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), publPart[i], st);
                    spp.save();
                }
            } else {
                Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                st.save();
                StatementPublicationsParticipants spp = new StatementPublicationsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), publPart[i], st);
                spp.save();
            }
        }
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
