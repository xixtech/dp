package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;
import java.util.Map;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 03.02.2017.
 */
@Entity
public class Roles extends Model {
    public static Finder<Long, Roles> find = new Finder<Long, Roles>(
            Roles.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Název role je povinný")
    @Formats.NonEmpty
    public String roleName;

    public Roles(String roleName) {
        this.roleName = roleName;
    }

    /**
     * List rolí pracovníků
     *
     * @return
     */
    public static List<Roles> rolesList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection()  {
        HashMap<String, String> output = new HashMap<String, String>();

        for(Roles r : Roles.find.all())  {
            output.put(r.id.toString(), r.roleName);
        }

        return output;
    }
}
