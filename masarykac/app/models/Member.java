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

    @Formats.NonEmpty
    @Constraints.Required(message = "Uživatelské jméno je povinný")
    public String uid;

    @Email(message = "Nebyl zadán platný email")
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
    public Member(String email, String password, String uid) {
        super();
        this.email = email;
        this.password = password;
        this.uid=uid;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @param uid
     * @param password
     * @return
     */
    public static Member authenticate(String uid, String password) {
        Member member = findByUID(uid);
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

    public static Member findByUID(String uid) {
        return find.where().eq("uid", uid).findUnique();
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
                options.put(set.id.toString(), set.uid.toString());
            }
        }
        return options;
    }
}
