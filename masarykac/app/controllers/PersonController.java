package controllers;

import models.Member;
import models.Person;
import models.Profile;
import models.Roles;
import models.utils.Hash;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import play.data.FormFactory;
import play.mvc.Security;

import static play.data.Form.form;

/**
 * Created by Martin on 03.02.2017.
 */
@Security.Authenticated(Secured.class)
public class PersonController extends Controller {
    @Inject
    private FormFactory formFactory;
       /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Member> registerForm = formFactory.form(Member.class);
        Form<Person> personForm = formFactory.form(Person.class);
        Form<Profile> profileForm = formFactory.form(Profile.class);
        return ok(views.html.registerPerson.render(registerForm, personForm, profileForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Member> registerForm = formFactory.form(Member.class).bindFromRequest();
        Form<Person> personForm = formFactory.form(Person.class).bindFromRequest();
        Form<Profile> profileForm = formFactory.form(Profile.class).bindFromRequest();
        if (registerForm.hasErrors() || personForm.hasErrors() || profileForm.hasErrors()) {
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));
        }
        if (checkRepeated(registerForm)) {
            registerForm.reject("repeatPassword", "Hesla se neshodují");
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));
        }
        Member registerMember = registerForm.get();
        Person registerPerson = personForm.get();
        Profile registerProfile = profileForm.get();
        Result resultError = checkBeforeSave(registerForm, registerMember.uid, personForm, profileForm);
        if (resultError != null) {
            return resultError;
        }
        try {
            savePerson(registerMember, registerPerson, registerProfile);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerPerson.render(registerForm,
                    personForm, profileForm));
        }
    }

    private void savePerson(Member registerForm, Person personForm, Profile profileForm) throws Exception {
        Member member = new Member(registerForm.email,
                Hash.createPassword(registerForm.password), registerForm.uid);
        member.setActive(true);
        member.save();
        Profile profile = new Profile(profileForm.firstName,
                profileForm.lastName, profileForm.phoneNumber, member);
        profile.save();
        Person person = new Person(personForm.salary,
                personForm.jobTitle, member, personForm.role);
        person.save();
        member.setProfile(profile);
        member.setPerson(person);
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
     * @param uid
     * @return
     */
    private Result checkBeforeSave(Form<Member> registerForm, String uid,
                                   Form<Person> personForm, Form<Profile> profileForm) {
        // Check unique email
        if (Member.findByUID(uid) != null) {
            registerForm.reject("uid",
                    "Toto uživatelské jméno již existuje, zvolte jiné");
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));
        }
        return null;
    }
}
