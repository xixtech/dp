package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.*;
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
    public Member member;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param member
     */
    public Profile(String firstName, String lastName,
                  String phoneNumber, Member member) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.member = member;

    }


}
