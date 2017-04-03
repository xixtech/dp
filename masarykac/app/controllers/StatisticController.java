package controllers;

import models.*;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class StatisticController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        List<StudyPlans> sp = StudyPlans.search();

        List<FieldsOfStudy> f = FieldsOfStudy.search();

        List<Subjects> s = Subjects.search();

        List<Semesters> sem = Semesters.search();
        return ok(views.html.tables.tableDCPS.render(sp,f,s));
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
