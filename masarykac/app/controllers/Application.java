package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import it.innove.play.pdf.PdfGenerator;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

        List<Statement> statements = Statement.findByEmployees(m.getEmployees().getId());
        long idS=0;
        if (statements.size() != 0) {
            idS=statements.get(0).getId();
        }
        return ok(views.html.dashboard.render(m, m.getEmployees().getId(),idS));
    }

    public Result index() {

        Member m=Member.findByEmail(request()
                .username());
        List<Statement> statements = Statement.findByEmployees(m.getEmployees().getId());
        long idS=0;
        if (statements.size() != 0) {
            idS=statements.get(0).getId();
        }
        return ok(views.html.dashboard.render(m,m.getEmployees().getId(),idS));

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
