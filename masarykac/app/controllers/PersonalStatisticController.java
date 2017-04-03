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
        List<Teachers> t=Teachers.search();
        List<OrganizationalUnitsParticipants> oj=OrganizationalUnitsParticipants.search();
        List<Courses> c=Courses.search();
        List<Subjects> s=Subjects.searchAAA();
        List<Courses> caaa=Courses.searchAAA();
        List<Courses> caab=Courses.searchAAB();
        List<Courses> cb=Courses.searchCB();
        return ok(views.html.tables.tableTeachingDepartmentEmployee.render(oj,e,c,s,t,caaa,caab,cb));
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
