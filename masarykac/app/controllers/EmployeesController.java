package controllers;

import models.Employees;
import models.Member;
import models.Person;
import models.Profile;
import models.utils.Hash;
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
public class EmployeesController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Employees> employeesForm = formFactory.form(Employees.class);
        return ok(views.html.registerEmployees.render(employeesForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Employees> employeesForm = formFactory.form(Employees.class).bindFromRequest();
        if (employeesForm.hasErrors()) {
            return badRequest(views.html.registerEmployees.render(employeesForm));
        }
        Employees employees = employeesForm.get();
        try {
            saveEmployee(employees);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerEmployees.render(employeesForm));
        }
    }

    private void saveEmployee(Employees employeesForm) throws Exception {
        Employees employees=new Employees(employeesForm.personalNumber, employeesForm.titleBefore, employeesForm.surname, employeesForm.firstName, employeesForm.titleAfter);
        employees.save();

    }

}
