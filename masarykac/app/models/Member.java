package models;

import javax.persistence.*;

import com.avaje.ebean.*;
import models.utils.Hash;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Email;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 02.02.2017.
 */
@Entity
public class Member extends Model {
    public static Model.Finder<Long, Member> find = new Model.Finder<Long, Member>(Member.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public boolean active;

    @Email(message = "Nebyl zadán platný email")
    @Constraints.Required(message = "Email je povinný")
    public String email;

    @Constraints.Required(message = "Heslo je povinné")
    @Formats.NonEmpty
    @Constraints.MinLength(message = "Minimální délka je 6 znaků",value = 6)
    public String password;

    @OneToOne(cascade = CascadeType.ALL)
    public Employees employees;

    @OneToOne(cascade = CascadeType.ALL)
    public Person person;

    @OneToOne(cascade = CascadeType.ALL)
    public Profile profile;

    /**
     * @param email
     * @param password
     */
    public Member(String email, String password) {
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
     * @param profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    /**
     * @param email
     * @param password
     * @return
     */
    public static Member authenticate(String email, String password) {
        Member member = findByEmail(email);
        if (member != null) {
            if (member.isActive()) {
                if (Hash.checkPassword(password, member.password)) {

                    return member;
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
    public static Member findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static List<Member> search() {
        return Member.find.all();
    }

    public static List<Member> memberDetail(long id) {
        return find.where().eq("id", id).findList();
    }

    public static Map<String, String> options() {
        List<Member> subjectSets = Member.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Member set : subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.email.toString());
            }
        }
        return options;
    }
}
