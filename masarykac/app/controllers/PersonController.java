package controllers;

import models.Person;
import models.Profile;
import models.User;
import models.utils.Hash;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import static play.data.Form.form;

/**
 * Created by Martin on 03.02.2017.
 */
@Security.Authenticated(Secured.class)
public class PersonController extends Controller {
    final static Form<User> SIGNUP_FORM = form(User.class);
    final static Form<Person> SIGNUP_PERSON_FORM = form(Person.class);
    final static Form<Profile> SIGNUP_PROFILE_FORM = form(Profile.class);

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public static Result index() {
        return ok(views.html.registerPerson.render(SIGNUP_FORM, SIGNUP_PERSON_FORM, SIGNUP_PROFILE_FORM));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public static Result save() {
        final Form<User> registerForm = SIGNUP_FORM.bindFromRequest();
        final Form<Person> personForm = SIGNUP_PERSON_FORM.bindFromRequest();
        final Form<Profile> profileForm = SIGNUP_PROFILE_FORM.bindFromRequest();
        if (registerForm.hasErrors() || personForm.hasErrors() || profileForm.hasErrors()) {
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));
        }
        if (checkRepeated(registerForm)) {
            registerForm.reject("repeatPassword", "Hesla se neshodují");
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));
        }
        final User registerUser = registerForm.get();
        final Person registerPerson = personForm.get();
        final Profile registerProfile = profileForm.get();
        final Result resultError = checkBeforeSave(registerForm, registerUser.email, personForm, profileForm);
        if (resultError != null) {
            return resultError;
        }
        try {
            savePerson(registerUser, registerPerson, registerProfile);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerPerson.render(registerForm,
                    personForm, profileForm));
        }
    }

    private static void savePerson(final User registerForm, final Person personForm, final Profile profileForm) throws Exception {
        final User user = new User(registerForm.email,
                Hash.createPassword(registerForm.password));
        user.setActive(true);
        user.save();
        final Profile profile = new Profile(profileForm.firstName,
                profileForm.lastName, profileForm.phoneNumber, user);
        profile.save();
        final Person person = new Person(personForm.salary,
                personForm.jobTitle, user);
        person.save();
        user.setProfile(profile);
        user.setPerson(person);
        user.update();

    }

    private static boolean checkRepeated(final Form<User> registerForm) {
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
    private static Result checkBeforeSave(Form<User> registerForm, String email,
                                          final Form<Person> personForm, final Form<Profile> profileForm) {
        // Check unique email
        if (User.findByEmail(email) != null) {
            registerForm.reject("email",
                    "Tento email již existuje, zvolte jiný");
            return badRequest(views.html.registerPerson.render(registerForm, personForm, profileForm));

        }
        return null;
    }
}
