package models;

import com.avaje.ebean.Page;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

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
    public User user;

    /**
     * @param salary
     * @param jobTitle
     * @param user
     */
    public Person(final double salary, final String jobTitle, final User user) {
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.user = user;
    }


    public static List<Person> search() {
        return find.where().findList();
    }
    public static List<Person> personDetail(long id) {
        return find.where().ilike("id", "%"+id+"%").findList();
    }
    public static List<Person> persons() {
        return find.where().findList();
    }
}
