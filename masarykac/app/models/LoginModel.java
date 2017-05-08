package models;

import play.data.format.Formats;
import play.data.validation.Constraints;


/**
 * Created by Martin on 03.02.2017.
 */
public class LoginModel {

    @Formats.NonEmpty
    @Constraints.Required(message = "Uživatelské jméno je povinné")
    public String uid;

    @Constraints.Required(message = "Heslo je povinné")
    @Formats.NonEmpty
    public String password;

    /**
     * @return validace uživatele
     */
    public String validate() {
        if (Member.authenticate(uid, password) == null) {
            return "Neplatné uživatelské jméno nebo heslo.";
        }
        return null;
    }
}