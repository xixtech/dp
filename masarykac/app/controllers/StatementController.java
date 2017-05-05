package controllers;

import models.*;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class StatementController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        List<Employees> e = Employees.search();
        List<Semesters> sem = Semesters.search();
        List<Statement> statements = Statement.search();
        List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.search();
        List<StatementFinalWorksParticipants> sfwp = StatementFinalWorksParticipants.search();
        List<StatementProjectsParticipants> spp = StatementProjectsParticipants.search();
        List<StatementPublicationsParticipants> sppart = StatementPublicationsParticipants.search();
        List<StatementTeachersParticipants> stp = StatementTeachersParticipants.search();
        List<StatementVisitsParticipants> svp = StatementVisitsParticipants.search();
        return ok(views.html.tables.tableStatement.render(e, sem, statements, scp, sfwp, spp, sppart, stp, svp));
    }

    public Result employeeStatement(String email) {
        Member m = Member.findByEmail(email);
        List<Statement> statements = Statement.findByEmployees(m.getEmployees().getId());
        return ok(views.html.tables.tableEmployeeStatements.render(statements));
    }
    public Result sendStatementToEmployee(long idE, long idS) {
        List<Employees> e=new ArrayList<>();
        e.add(Employees.findById(idE));
        List<Statement> statements=new ArrayList<>();
        Statement s=Statement.findById(idS);
        s.setState("Odesláno ke zpracování");
        statements.add(s);
        List<Semesters> sem = Semesters.search();
        List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.search();
        List<StatementFinalWorksParticipants> sfwp = StatementFinalWorksParticipants.search();
        List<StatementProjectsParticipants> spp = StatementProjectsParticipants.search();
        List<StatementPublicationsParticipants> sppart = StatementPublicationsParticipants.search();
        List<StatementTeachersParticipants> stp = StatementTeachersParticipants.search();
        List<StatementVisitsParticipants> svp = StatementVisitsParticipants.search();
        return ok(views.html.tables.tableEmployeeCheckStatement.render(idE, idS, e, sem, statements, scp, sfwp, spp, sppart, stp, svp));
    }
    public Result sendToRepair(long idE, long idS) {
        List<Statement> statements=new ArrayList<>();
        Statement s=Statement.findById(idS);
        s.setState("Vytvořeno");
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements));
    }

    public Result sendToAgree(long idE, long idS) {
        List<Statement> statements = Statement.findByEmployees(idE);
        return ok(views.html.tables.tableEmployeeStatements.render(statements));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {

        return redirect(routes.Application.index());

    }
}
