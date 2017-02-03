package models;

import java.util.*;
import javax.persistence.*;

import models.utils.Hash;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Email;
import play.db.ebean.*;

import com.avaje.ebean.Page;

import play.data.validation.*;

/**
 * Created by Martin on 02.02.2017.
 */
@Entity
public class User extends Model{
    public static Model.Finder<Long,User> find = new Model.Finder<Long,User>(Long.class, User.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public boolean active;

    @Email(message = "Nebyl zadán platný email")
    @Constraints.Required(message = "Email je povinný")
    public String email;

    @Constraints.Required(message = "Heslo je povinné")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 6)
    public String password;

    @OneToOne(cascade = CascadeType.ALL)
    public Person person;

    /**
     * @param email
     * @param password
     */
    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    /**
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;
    }
    /**
     * stránka všech osob
     *
     * @param page
     * @param pageSize
     * @param sortBy
     * @param order
     * @param filter
     * @return
     */
    public static Page<User> page(int page, int pageSize, String sortBy,
                                   String order, String filter) {
        return find.where().ilike("email", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize).setFetchAhead(false).getPage(page);
    }

    /**
     * @param email
     * @param password
     * @return
     */
    public static User authenticate(String email, String password) {
        User user = findByEmail(email);
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
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
}
