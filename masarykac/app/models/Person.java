package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import com.avaje.ebean.*;
import java.util.List;

import javax.persistence.*;


/**
 * Created by Martin on 03.02.2017.
 */
@Entity
public class Person extends Model {

    public static Finder<Long, Person> find = new Finder<Long, Person>(
            Long.class, Person.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Zadejte plat")
    @Formats.NonEmpty
    public double salary;

    @Constraints.Required(message = "Zvolte zařazení")
    @Formats.NonEmpty
    public String jobTitle;

    @OneToOne(cascade = CascadeType.ALL)
    public Member member;

    /**
     * @param salary
     * @param jobTitle
     * @param member
     */
    public Person(double salary, String jobTitle, Member member) {
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.member = member;
    }


    public static List<Person> search() {
        return find.where().findList();
    }
    public static List<Person> personDetail(long id) {
        return find.where().eq("id",id).findList();
    }
    public static List<Person> persons() {
        return find.where().findList();
    }
}
