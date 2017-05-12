package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import it.innove.play.pdf.PdfGenerator;

import javax.inject.Inject;
import java.util.*;

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
        return pdfGenerator.ok(views.html.pdf.tableEmployeesPDF.render(Employees.search()), "http://localhost:9000");
    }

    public Result raw() {
        Map<String, String> test = new HashMap<String, String>();
        test.put("name", "Jan");
        test.put("surname", "Novák");
        test.put("date", "1. 1. 2017");
        test.put("personalNumber", "3456789");
        return ok(views.html.doc.tableEmployeesDOC.render(Employees.search()));
    }

    public Result dashboard() {
        Member m=Member.findByUID(request()
                .username());
        session().put("uid",request()
                .username());
        session().put("role", m.getEmployees().getAccessRole().getRole());

        List<Statement> statements=new ArrayList<>();
        List<Statement> s = Statement.findByEmployees(m.getEmployees().getId());
        for (Statement set : s) {
            if(set.getState().equals("Odesláno ke schválení")||set.getState().equals("Opraveno")){
                statements.add(set);
            }
        }
        long idS=0;
        if (statements.size() != 0) {
            idS=statements.get(0).getId();
        }
        return ok(views.html.dashboard.render(m, m.getEmployees().getId(),idS,statements));
    }

    public Result index() {
        Member m=Member.findByUID(request()
                .username());
        List<Statement> statements=new ArrayList<>();
        List<Statement> s = Statement.findByEmployees(m.getEmployees().getId());
        for (Statement set : s) {
            if(set.getState().equals("Vytvořeno")||set.getState().equals("Opraveno")){
                statements.add(set);
            }
        }
        long idS=0;
        if (statements.size() != 0) {
            idS=statements.get(0).getId();
        }
        return ok(views.html.dashboard.render(m,m.getEmployees().getId(),idS,statements));
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
