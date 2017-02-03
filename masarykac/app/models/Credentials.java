package models;

import models.utils.Hash;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Martin on 03.02.2017.
 */
public class Credentials extends Model{
    public static Model.Finder<Long,Credentials> find = new Model.Finder<Long,Credentials>(Long.class, Credentials.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public boolean active;

    @Constraints.Email(message = "Nebyl zadán platný email")
    @Constraints.Required(message = "Email je povinný")
    public String email;

    @Constraints.Required(message = "Heslo je povinné")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 6)
    public String password;

    /**
     * @param email
     * @param password
     */
    public Credentials(String email, String password) {
        super();
        this.email = email;
        this.password = password;
        this.active=true;
    }
    public Long getId() {
        return id;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @param email
     * @param password
     * @return
     */
    public static Credentials authenticate(String email, String password) {
        Credentials user = findByEmail(email);
        if (user != null) {
            if (user.active == true) {

                if (Hash.checkPassword(password, user.password)) {

                    return user;
                }
            }
        }
        return null;
    }
    /**
     * vrací osobu podle emailu
     *
     * @param email
     * @return
     */
    public static Credentials findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
}
