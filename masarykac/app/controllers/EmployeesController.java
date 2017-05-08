package controllers;

import models.*;
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
        Form<OrganizationalUnitsParticipants> organizationalUnitsForm = formFactory.form(OrganizationalUnitsParticipants.class);
        return ok(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsForm));
    }

    public Result edit(String email) {
        Member m = Member.findByEmail(email);
        Form<Member> registerForm = formFactory.form(Member.class).fill(m);
        Form<Employees> employeesForm = formFactory.form(Employees.class).fill(Employees.findById(m.getEmployees().getId()));
        Form<OrganizationalUnitsParticipants> organizationalUnitsForm = formFactory.form(OrganizationalUnitsParticipants.class);
        return ok(views.html.editEmployee.render(email, registerForm, employeesForm,organizationalUnitsForm));
    }

    public Result info(String email) {
        Member m = Member.findByEmail(email);
        Form<Member> registerForm = formFactory.form(Member.class).fill(m);
        Form<Employees> employeesForm = formFactory.form(Employees.class).fill(Employees.findById(m.getEmployees().getId()));
        return ok(views.html.infoEmployee.render(email, registerForm, employeesForm));
    }

    public Result delete(String email) {
        Member m = Member.findByEmail(email);
        m.setActive(false);
        m.update();
        return redirect(routes.Application.index());
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<Member> registerForm = formFactory.form(Member.class).bindFromRequest();
        Form<Employees> employeesForm = formFactory.form(Employees.class).bindFromRequest();
        Form<OrganizationalUnitsParticipants> organizationalUnitsParticipantsForm = formFactory.form(OrganizationalUnitsParticipants.class).bindFromRequest();
        if (employeesForm.hasErrors()) {
            return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        if (organizationalUnitsParticipantsForm.hasErrors()) {
            return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        if (checkRepeated(registerForm)) {
            registerForm.reject("repeatPassword", "Hesla se neshodují");
            return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        Employees employees = employeesForm.get();
        Member registerMember = registerForm.get();
        OrganizationalUnitsParticipants organizationalUnits = organizationalUnitsParticipantsForm.get();
        int state = 0;
        Result resultError = checkBeforeSave(registerForm, registerMember.email, employeesForm, organizationalUnitsParticipantsForm);
        if (resultError != null) {
            return resultError;
        }
        try {
            state = OrganizationalUnitsController.checkFunction(organizationalUnits);
            if (state == 1) {
                OrganizationalUnitsController.saveOUParticipantsEmployees(organizationalUnits, employees);
            } else {
                return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
            }
            saveEmployee(registerMember, employees);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
    }

    private void saveEmployee(Member registerForm, Employees employeesForm) throws Exception {
        Member member = new Member(registerForm.email,
                Hash.createPassword(registerForm.password));
        member.setActive(true);
        member.save();
        Employees employees = new Employees(employeesForm.personalNumber, employeesForm.titleBefore, employeesForm.surname, employeesForm.firstName, employeesForm.titleAfter, employeesForm.accessRole);
        employees.setMember(member);
        employees.save();
        member.setEmployees(employees);
        member.update();
    }

    public Result update(String email) throws Exception {
        Form<Member> registerForm = formFactory.form(Member.class).bindFromRequest();
        Form<Employees> employeesForm = formFactory.form(Employees.class).bindFromRequest();
        Form<OrganizationalUnitsParticipants> organizationalUnitsParticipantsForm = formFactory.form(OrganizationalUnitsParticipants.class).bindFromRequest();
        if (employeesForm.hasErrors()) {
            return badRequest(views.html.editEmployee.render(email, registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        if (organizationalUnitsParticipantsForm.hasErrors()) {
            return badRequest(views.html.editEmployee.render(email, registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        if (checkRepeated(registerForm)) {
            registerForm.reject("repeatPassword", "Hesla se neshodují");
            return badRequest(views.html.editEmployee.render(email, registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        if (registerForm.hasErrors()) {
            return badRequest(views.html.editEmployee.render(email, registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        Member m = Member.findByEmail(email);
        m.setPassword(Hash.createPassword(registerForm.get().getPassword()));
        m.update();
        Employees e = Employees.findById(m.getEmployees().getId());
        e.setFirstName(employeesForm.get().getFirstName());
        e.setSurname(employeesForm.get().getSurname());
        e.setTitleBefore(employeesForm.get().getTitleBefore());
        e.setTitleAfter(employeesForm.get().getTitleAfter());
        e.setPersonalNumber(employeesForm.get().getPersonalNumber());
        e.setAccessRole(employeesForm.get().getAccessRole());
        e.update();
        OrganizationalUnitsParticipants oup=OrganizationalUnitsParticipants.findEmployeesID(e).get(0);
        oup.setOrganizationalUnits(organizationalUnitsParticipantsForm.get().getOrganizationalUnits());
        oup.setFunction(organizationalUnitsParticipantsForm.get().getFunction());
        oup.setFunctionName(organizationalUnitsParticipantsForm.get().getFunctionName());
        return redirect(routes.Application.index());
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
                                   Form<Employees> employees, Form<OrganizationalUnitsParticipants> organizationalUnitsForm) {
        // Check unique email
        if (Member.findByEmail(email) != null) {
            registerForm.reject("email",
                    "Tento email již existuje, zvolte jiný");
            return badRequest(views.html.registerEmployees.render(registerForm, employees, organizationalUnitsForm));
        }
        return null;
    }
}
