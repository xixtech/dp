package controllers;

import models.Courses;
import models.Employees;
import models.Member;
import models.ScheduleInWeeks;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;

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
        Member m=Member.findByEmail(request().username());
        Employees e=Employees.findById(m.getEmployees().getId());

        return ok(views.html.tables.tableTeachingDepartmentEmployee.render());
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
