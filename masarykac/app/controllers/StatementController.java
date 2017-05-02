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

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {

        return redirect(routes.Application.index());

    }
}
