package controllers;

import models.Member;
import models.Roles;
import models.StudyPlans;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import it.innove.play.pdf.PdfGenerator;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Security.Authenticated(Secured.class)
public class Application extends Controller {
    @Inject
    public PdfGenerator pdfGenerator;

    @Inject
    private FormFactory formFactory;

    public Result pdf() {
        Map<String, String> test = new HashMap<String, String>();
        test.put("name", "Jan");
        test.put("surname", "Novák");
        test.put("date", "1. 1. 2017");
        test.put("personalNumber", "3456789");

        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.utf.render(test), "http://localhost:9000");
    }

    public Result raw() {

        Map<String, String> test = new HashMap<String, String>();
        test.put("name", "Jan");
        test.put("surname", "Novák");
        test.put("date", "1. 1. 2017");
        test.put("personalNumber", "3456789");
        return ok(views.html.utf.render(test));
    }

    public Result dashboard() {

        Member m=Member.findByEmail(request()
                .username());
        session().put("email",request()
                .username());
        session().put("role", m.getEmployees().getAccessRole());
        return ok(views.html.dashboard.render(m));
    }

    public Result index() {
        return ok(views.html.dashboard.render(Member.findByEmail(request()
                .username())));

    }

    public Result tables() {
        return ok(views.html.tables.tables.render());
    }

    public Result forms() {
        return ok(views.html.forms.render());
    }

    public Result roles() {
        return ok(views.html.roles.render(Roles.rolesList()));
    }

    public Result kpiChoosePerson() {

        Form<Member> memberForm = formFactory.form(Member.class);
        return ok(views.html.kpiChoosePerson.render(memberForm));
    }

    /**
     * odhlášení osoby ze systému
     *
     * @return
     */
    public Result logout() {
        session().clear();
        flash("success", "Byl/a jste odhlášen/a.");
        return redirect(routes.Login.index());
    }
}
