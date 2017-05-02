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
public class CommitteeController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Committee> committeeForm = formFactory.form(Committee.class);
        Form<CommitteeParticipants> committeeParticipantsForm = formFactory.form(CommitteeParticipants.class);
        return ok(views.html.registerCommittee.render(committeeForm, committeeParticipantsForm));
    }

    public Result save() {
        Form<Committee> committeeForm = formFactory.form(Committee.class).bindFromRequest();
        Form<CommitteeParticipants> committeeParticipantsForm = formFactory.form(CommitteeParticipants.class).bindFromRequest();

        if (committeeForm.hasErrors() || committeeParticipantsForm.hasErrors()) {
            return badRequest(views.html.registerCommittee.render(committeeForm, committeeParticipantsForm));
        }

        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveCommittee(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerCommittee.render(committeeForm, committeeParticipantsForm));
        }
    }

    private void saveCommittee(Map<String, String[]> formData) throws Exception {

        List<Date> dateOfCommittee = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
        for (String insId : formData.get("dateOfCommittee")) {
            dateOfCommittee.add(format.parse(insId));
        }

        List<String> semester = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semester.add(insId);
        }

        List<String> employees = new ArrayList<>();
        for (String insId : formData.get("employees.id")) {
            employees.add(insId);
        }

        List<String> roleInCommittee = new ArrayList<>();

        for (String insId : formData.get("roleInCommittee")) {
            roleInCommittee.add(insId);
        }

        long committeeId = 0;

        for (int i = 0; i < dateOfCommittee.size(); i++) {
            Committee c = new Committee(dateOfCommittee.get(i), Semesters.findById(Long.parseLong(semester.get(i))));
            c.save();
            committeeId = c.getId();
        }

        CommitteeParticipants[] comPart = new CommitteeParticipants[employees.size()];
        for (int i = 0; i < employees.size(); i++) {
            CommitteeParticipants cp = new CommitteeParticipants(roleInCommittee.get(i), Committee.findById(committeeId), Employees.findById(Long.parseLong(employees.get(i))));
            cp.save();
            comPart[i] = cp;
        }

        List<Statement> s = Statement.findBySemester(Long.parseLong(semester.get(0)));
        for (int i = 0; i < employees.size(); i++) {
            boolean saved = false;
            if (s.size() > 0) {
                for (Statement statement : s) {
                    if (statement.getEmployees().getId() == Long.parseLong(employees.get(i))) {
                        StatementCommitteeParticipants scp = new StatementCommitteeParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), comPart[i], statement);
                        scp.save();
                        saved = true;
                    }
                }
                if (saved == false) {
                    Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                    st.save();
                    StatementCommitteeParticipants scp = new StatementCommitteeParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), comPart[i], st);
                    scp.save();
                }
            } else {
                Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                st.save();
                StatementCommitteeParticipants scp = new StatementCommitteeParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), comPart[i], st);
                scp.save();
            }
        }
    }

}
