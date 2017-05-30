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

    public Result edit(String uid) {
        Member m = Member.findByUID(uid);
        Form<Member> registerForm = formFactory.form(Member.class).fill(m);
        Form<Employees> employeesForm = formFactory.form(Employees.class).fill(Employees.findById(m.getEmployees().getId()));
        Form<OrganizationalUnitsParticipants> organizationalUnitsForm = formFactory.form(OrganizationalUnitsParticipants.class);
        return ok(views.html.editEmployee.render(uid, registerForm, employeesForm,organizationalUnitsForm));
    }

    public Result info(String uid) {
        Member m = Member.findByUID(uid);
        Form<Member> registerForm = formFactory.form(Member.class).fill(m);
        Form<Employees> employeesForm = formFactory.form(Employees.class).fill(Employees.findById(m.getEmployees().getId()));
        return ok(views.html.infoEmployee.render(uid, registerForm, employeesForm));
    }

    public Result delete(String uid) {
        Member m = Member.findByUID(uid);
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
        if (Employees.findByUniquePN(employeesForm.get().getPersonalNumber())) {
            employeesForm.reject("personalNumber", "Osobní číslo musí být unikátní");
            return badRequest(views.html.registerEmployees.render(registerForm, employeesForm, organizationalUnitsParticipantsForm));
        }
        Employees employees = employeesForm.get();
        Member registerMember = registerForm.get();
        OrganizationalUnitsParticipants organizationalUnits = organizationalUnitsParticipantsForm.get();
        int state = 0;
        Result resultError = checkBeforeSave(registerForm, registerMember.uid, employeesForm, organizationalUnitsParticipantsForm);
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
                registerForm.password, registerForm.uid);
        member.setActive(true);
        member.save();
        Employees employees = new Employees(employeesForm.personalNumber, employeesForm.titleBefore, employeesForm.surname, employeesForm.firstName, employeesForm.titleAfter, employeesForm.accessRole);
        employees.setMember(member);
        employees.save();


        Profile profile = new Profile(employees.getFirstName(), employees.getSurname(), ""+employees.getPersonalNumber(), member);
        profile.save();
        Person person = new Person(20000, "Lektor", member, "Lektor");
        person.save();
        member.setPerson(person);
        member.setProfile(profile);
        member.setEmployees(employees);
        member.update();
    }

    public Result update(String uid) throws Exception {
        Form<Member> registerForm = formFactory.form(Member.class).bindFromRequest();
        Form<Employees> employeesForm = formFactory.form(Employees.class).bindFromRequest();
        Form<OrganizationalUnitsParticipants> organizationalUnitsParticipantsForm = formFactory.form(OrganizationalUnitsParticipants.class).bindFromRequest();

        Member m = Member.findByUID(uid);
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
        oup.update();
        return redirect(routes.TableController.listEmployees());
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
     * ověření unikátního uživatelského jména před uložením
     *
     * @param registerForm
     * @param uid
     * @return
     */
    private Result checkBeforeSave(Form<Member> registerForm, String uid,
                                   Form<Employees> employees, Form<OrganizationalUnitsParticipants> organizationalUnitsForm) {
        // Check unique uid
        if (Member.findByUID(uid) != null) {
            registerForm.reject("uid",
                    "Toto uživatelské jméno již existuje, zvolte jiné");
            return badRequest(views.html.registerEmployees.render(registerForm, employees, organizationalUnitsForm));
        }
        return null;
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
