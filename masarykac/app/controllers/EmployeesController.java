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
        Form<Member> registerForm = formFactory.form(Member.class);
        Form<Employees> employeesForm = formFactory.form(Employees.class);
        return ok(views.html.registerEmployees.render(registerForm,employeesForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Member> registerForm = formFactory.form(Member.class).bindFromRequest();
        Form<Employees> employeesForm = formFactory.form(Employees.class).bindFromRequest();
        if (employeesForm.hasErrors()) {
            return badRequest(views.html.registerEmployees.render(registerForm,employeesForm));
        }
        if (checkRepeated(registerForm)) {
            registerForm.reject("repeatPassword", "Hesla se neshodují");
            return badRequest(views.html.registerEmployees.render(registerForm,employeesForm));
        }
        Employees employees = employeesForm.get();
        Member registerMember = registerForm.get();
        Result resultError = checkBeforeSave(registerForm, registerMember.email, employeesForm);
        if (resultError != null) {
            return resultError;
        }
        try {
            saveEmployee(registerMember,employees);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerEmployees.render(registerForm,employeesForm));
        }
    }

    private void saveEmployee(Member registerForm,Employees employeesForm) throws Exception {
        Member member = new Member(registerForm.email,
                Hash.createPassword(registerForm.password));
        member.setActive(true);
        member.save();
        Employees employees=new Employees(employeesForm.personalNumber, employeesForm.titleBefore, employeesForm.surname, employeesForm.firstName, employeesForm.titleAfter);
        employees.setMember(member);
        employees.save();

        member.setEmployees(employees);
        member.update();

    }

    private boolean checkRepeated(Form<Member> registerForm) {
        // Check repeated password
        if (!registerForm.field("password").valueOr("").isEmpty()) {
            if (!registerForm.field("password").valueOr("")
                    .equals(registerForm.field("repeatPassword").value())) {
                return true;
            }
        }
        return false;
    }

    /**
     * ověření unikátního emailu před uložením
     *
     * @param registerForm
     * @param email
     * @return
     */
    private Result checkBeforeSave(Form<Member> registerForm, String email,
                                   Form<Employees> employees) {
        // Check unique email
        if (Member.findByEmail(email) != null) {
            registerForm.reject("email",
                    "Tento email již existuje, zvolte jiný");
            return badRequest(views.html.registerEmployees.render(registerForm,employees));

        }
        return null;
    }

}
