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
import java.util.Map;

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

    public Result employeeStatement(String uid) {
        Member m = Member.findByUID(uid);
        Member mE = Member.findByUID(request()
                .username());
        List<Statement> statements = Statement.findByEmployees(m.getEmployees().getId());
        if (statements.size() != 0) {
            statements.get(0).setState("Vytvořeno");
            statements.get(0).setManagerEmployee(Employees.findById(mE.getEmployees().getId()));
            statements.get(0).update();
        }
        return ok(views.html.tables.tableEmployeeStatements.render(statements, mE.getEmployees().getId()));
    }

    public Result employeeCheckStatement(long idE, long idS) {
        List<Employees> e = new ArrayList<>();
        e.add(Employees.findById(idE));
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
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

    public Result sendStatementToEmployee(long idE, long idS) {
        Member m = Member.findByUID(request()
                .username());
        List<Employees> e = new ArrayList<>();
        e.add(Employees.findById(idE));
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        s.setState("Odesláno ke schválení");
        s.setManagerEmployee(Employees.findById(m.getEmployees().getId()));
        s.update();
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements, m.getEmployees().getId()));
    }

    public Result infoStatementToEmployee(long idE, long idS) {
        List<Employees> e = new ArrayList<>();
        e.add(Employees.findById(idE));
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        statements.add(s);
        List<Semesters> sem = Semesters.search();
        List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.search();
        List<StatementFinalWorksParticipants> sfwp = StatementFinalWorksParticipants.search();
        List<StatementProjectsParticipants> spp = StatementProjectsParticipants.search();
        List<StatementPublicationsParticipants> sppart = StatementPublicationsParticipants.search();
        List<StatementTeachersParticipants> stp = StatementTeachersParticipants.search();
        List<StatementVisitsParticipants> svp = StatementVisitsParticipants.search();
        return ok(views.html.tables.tableInfoEmployeeCheckStatement.render(idE, idS, e, sem, statements, scp, sfwp, spp, sppart, stp, svp));
    }

    public Result checkRepairStatementToEmployee(long idE, long idS) {
        List<Employees> e = new ArrayList<>();
        e.add(Employees.findById(idE));
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        statements.add(s);
        List<Semesters> sem = Semesters.search();
        List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.search();
        List<StatementFinalWorksParticipants> sfwp = StatementFinalWorksParticipants.search();
        List<StatementProjectsParticipants> spp = StatementProjectsParticipants.search();
        List<StatementPublicationsParticipants> sppart = StatementPublicationsParticipants.search();
        List<StatementTeachersParticipants> stp = StatementTeachersParticipants.search();
        List<StatementVisitsParticipants> svp = StatementVisitsParticipants.search();
        return ok(views.html.tables.tableCheckRepairEmployeeCheckStatement.render(idE, idS, e, sem, statements, scp, sfwp, spp, sppart, stp, svp));
    }

    public Result sendRepairedStatement(long idE, long idS) {
        Member m = Member.findByUID(request()
                .username());
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        s.setState("Opraveno");
        s.update();
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements, m.getEmployees().getId()));
    }

    public Result sendToVerify(long idE, long idS) {
        Member m = Member.findByUID(request()
                .username());
        Map<String, String[]> formData = request().body().asFormUrlEncoded();
        String radioSubject = formData.get("radioSubject")[0];
        String radioPublication = formData.get("radioPublication")[0];
        String radioProject = formData.get("radioProject")[0];
        String radioCommittee = formData.get("radioCommittee")[0];
        String radioFinal = formData.get("radioFinal")[0];
        String radioVisit = formData.get("radioVisit")[0];

        String textSubject = "";
        boolean rsubject = true;
        if (radioSubject.equals("0")) {
            List<StatementTeachersParticipants> stp = StatementTeachersParticipants.findByStatementId(idS);
            textSubject = formData.get("textSubject")[0];
            for (StatementTeachersParticipants set : stp) {
                set.setNote(textSubject);
                set.setState("Neschváleno");
                set.update();
            }
            rsubject = false;
        } else if (radioSubject.equals("1")) {
            List<StatementTeachersParticipants> stp = StatementTeachersParticipants.findByStatementId(idS);
            for (StatementTeachersParticipants set : stp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rsubject = true;
        }

        String textPublication = "";
        boolean rpublication = true;
        if (radioPublication.equals("0")) {
            List<StatementPublicationsParticipants> spp = StatementPublicationsParticipants.findByStatementId(idS);
            textPublication = formData.get("textPublication")[0];
            for (StatementPublicationsParticipants set : spp) {
                set.setNote(textPublication);
                set.setState("Neschváleno");
                set.update();
            }
            rpublication = false;
        } else if (radioPublication.equals("1")) {
            List<StatementPublicationsParticipants> spp = StatementPublicationsParticipants.findByStatementId(idS);
            for (StatementPublicationsParticipants set : spp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rpublication = true;
        }

        String textProject = "";
        boolean rproject = true;
        if (radioProject.equals("0")) {
            List<StatementProjectsParticipants> sprojp = StatementProjectsParticipants.findByStatementId(idS);
            textProject = formData.get("textProject")[0];
            for (StatementProjectsParticipants set : sprojp) {
                set.setNote(textProject);
                set.setState("Neschváleno");
                set.update();
            }
            rproject = false;
        } else if (radioProject.equals("1")) {
            List<StatementProjectsParticipants> sprojp = StatementProjectsParticipants.findByStatementId(idS);
            for (StatementProjectsParticipants set : sprojp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rproject = true;
        }

        String textCommittee = "";
        boolean rcommittee = true;
        if (radioCommittee.equals("0")) {
            List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.findByStatementId(idS);
            textCommittee = formData.get("textCommittee")[0];
            for (StatementCommitteeParticipants set : scp) {
                set.setNote(textCommittee);
                set.setState("Neschváleno");
                set.update();
            }
            rcommittee = false;
        } else if (radioCommittee.equals("1")) {
            List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.findByStatementId(idS);
            for (StatementCommitteeParticipants set : scp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rcommittee = true;
        }

        String textFinal = "";
        boolean rfinal = true;
        if (radioFinal.equals("0")) {
            List<StatementFinalWorksParticipants> sfp = StatementFinalWorksParticipants.findByStatementId(idS);
            textFinal = formData.get("textFinal")[0];
            for (StatementFinalWorksParticipants set : sfp) {
                set.setNote(textFinal);
                set.setState("Neschváleno");
                set.update();
            }
            rfinal = false;
        } else if (radioFinal.equals("1")) {
            List<StatementFinalWorksParticipants> sfp = StatementFinalWorksParticipants.findByStatementId(idS);
            for (StatementFinalWorksParticipants set : sfp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rfinal = true;
        }

        String textVisit = "";
        boolean rvisit = true;
        if (radioVisit.equals("0")) {
            List<StatementVisitsParticipants> svp = StatementVisitsParticipants.findByStatementId(idS);
            textVisit = formData.get("textVisit")[0];
            for (StatementVisitsParticipants set : svp) {
                set.setNote(textVisit);
                set.setState("Neschváleno");
                set.update();
            }
            rvisit = false;
        } else if (radioVisit.equals("1")) {
            List<StatementVisitsParticipants> svp = StatementVisitsParticipants.findByStatementId(idS);
            for (StatementVisitsParticipants set : svp) {
                set.setNote("");
                set.setState("Schváleno");
                set.update();
            }
            rvisit = true;
        }

        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        if (rsubject && rpublication && rproject && rcommittee && rfinal && rvisit) {
            s.setState("Schváleno");
        } else {
            s.setState("Neschváleno");
        }
        s.update();
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements, m.getEmployees().getId()));
    }

    public Result sendToAgree(long idE, long idS) {
        Member m = Member.findByUID(request()
                .username());
        Map<String, String[]> formData = request().body().asFormUrlEncoded();

        String textSubject = "";
        List<StatementTeachersParticipants> stp = StatementTeachersParticipants.findByStatementId(idS);
        for (StatementTeachersParticipants set : stp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        String textPublication = "";
        List<StatementPublicationsParticipants> spp = StatementPublicationsParticipants.findByStatementId(idS);
        for (StatementPublicationsParticipants set : spp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        String textProject = "";
        List<StatementProjectsParticipants> sprojp = StatementProjectsParticipants.findByStatementId(idS);
        for (StatementProjectsParticipants set : sprojp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        String textCommittee = "";
        List<StatementCommitteeParticipants> scp = StatementCommitteeParticipants.findByStatementId(idS);
        for (StatementCommitteeParticipants set : scp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        String textFinal = "";
        List<StatementFinalWorksParticipants> sfp = StatementFinalWorksParticipants.findByStatementId(idS);
        for (StatementFinalWorksParticipants set : sfp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        String textVisit = "";
        List<StatementVisitsParticipants> svp = StatementVisitsParticipants.findByStatementId(idS);
        for (StatementVisitsParticipants set : svp) {
            set.setNote("");
            set.setState("Schváleno");
            set.update();
        }

        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        s.setState("Schváleno");
        s.update();
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements, m.getEmployees().getId()));
    }

    public Result sendToRepair(long idE, long idS) {
        Member m = Member.findByUID(request()
                .username());
        List<Statement> statements = new ArrayList<>();
        Statement s = Statement.findById(idS);
        s.setState("Uloženo k opravě údajů");
        s.update();
        statements.add(s);
        return ok(views.html.tables.tableEmployeeStatements.render(statements, m.getEmployees().getId()));
    }

    public Result save() {
        return redirect(routes.Application.index());

    }
}
