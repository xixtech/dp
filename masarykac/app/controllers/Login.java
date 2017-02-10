package controllers;

import play.data.Form;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.mvc.Controller;
import play.mvc.Result;
import models.Member;
import javax.inject.Inject;

import play.data.FormFactory;

/**
 * Created by Martin on 02.02.2017.
 */
public class Login  extends Controller {
    @Inject
    private FormFactory formFactory;

    /**
     * vypsání přihlašovacího formuláře
     *
     * @return
     */
    public Result index() {
        Form<LoginModel> loginForm = formFactory.form(LoginModel.class);
        return ok(views.html.pages.login.render(loginForm));
    }

    public static class LoginModel {

        @Constraints.Email(message = "Nebyl zadán platný email")
        @Constraints.Required(message = "Email je povinný")
        public String email;

        @Constraints.Required(message = "Heslo je povinné")
        @Formats.NonEmpty
        public String password;

        /**
         * @return validace uživatele
         */
        public String validate() {

            if (Member.authenticate(email, password) == null) {
                return "Neplatný email nebo heslo.";
            }
            return null;
        }
    }

    /**
     * autentifikace osoby
     *
     * @return
     */
    public Result authenticate() {
        Form<LoginModel> form = formFactory.form(LoginModel.class).bindFromRequest();
        if (form.hasErrors()) {
            form.reject("email", "Neexistující email nebo špatné heslo.");
            form.reject("password", "Neexistující email nebo špatné heslo.");
            return badRequest(views.html.pages.login.render(form));
        } else {
            session().clear();
            session("email", form.get().email);
            return redirect(routes.Application.dashboard());
        }
    }
}
