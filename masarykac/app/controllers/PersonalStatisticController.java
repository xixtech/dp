package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class PersonalStatisticController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        List<Employees> e=Employees.search();
        List<OrganizationalUnits> oj=OrganizationalUnits.search();
        List<Courses> c=Courses.search();

        return ok(views.html.tables.tableTeachingDepartmentEmployee.render(oj,e,c));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {

            return redirect(routes.Application.index());

    }
}
