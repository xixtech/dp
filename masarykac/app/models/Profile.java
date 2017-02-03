package models;

import com.avaje.ebean.Page;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by Martin on 03.02.2017.
 */
@Entity
public class Profile  extends Model {

    public static Finder<Long, Profile> find = new Finder<Long, Profile>(
            Long.class, Profile.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Křestní jméno je povinné")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 2, message = "Křestní jméno musí být delší, než 2 znaky")
    public String firstName;

    @Constraints.Required(message = "Příjmení je povinné")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 2, message = "Příjmení musí být delší, než 2 znaky")
    public String lastName;

    @Constraints.Required(message = "Telefonní číslo je povinné")
    @Formats.NonEmpty
    public String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    public User user;

    /**
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param user
     */
    public Profile(final String firstName, final String lastName,
                  final String phoneNumber, final User user) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.user = user;

    }

    /**
     * stránka profilů
     *
     * @param page
     * @param pageSize
     * @param sortBy
     * @param order
     * @param filter
     * @return
     */
    public static Page<Profile> page(final int page, final int pageSize,
                                    final String sortBy, final String order, final String filter) {
        return find.where().ilike("email", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize).setFetchAhead(false).getPage(page);
    }



}
