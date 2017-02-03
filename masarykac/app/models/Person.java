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
public class Person extends Model {

    public static Finder<Long, Person> find = new Finder<Long, Person>(
            Long.class, Person.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Zadejte plat")
    @Formats.NonEmpty
    public double plat;

    @Constraints.Required(message = "Zvolte zařazení")
    @Formats.NonEmpty
    public String zarazeni;

    @OneToOne(cascade = CascadeType.ALL)
    public User osoba;

    /**
     * @param plat
     * @param zarazeni
     * @param osoba
     */
    public Person(final double plat, final String zarazeni, final User osoba) {
        this.plat = plat;
        this.zarazeni = zarazeni;
        this.osoba = osoba;
    }

    /**
     *
     * stránka pracovníků
     *
     * @param page
     * @param pageSize
     * @param sortBy
     * @param order
     * @param filter
     * @return
     */
    public static Page<Person> page(final int page, final int pageSize,
                                       final String sortBy, final String order, final String filter) {
        return find.where().ilike("zarazeni", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize).setFetchAhead(false).getPage(page);
    }

    public static List<Person> persons() {
        return find.where().findList();
    }
}
