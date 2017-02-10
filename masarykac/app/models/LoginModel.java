package models;

import play.data.format.Formats;
import play.data.validation.Constraints;


/**
 * Created by Martin on 03.02.2017.
 */
public class LoginModel {

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