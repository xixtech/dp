package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Martin on 06.03.2017.
 */
@Entity
public class Lector extends Model {
    public static Model.Finder<Long, Lector> find = new Model.Finder<Long, Lector>(
            Lector.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String identificator;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String itemsKPI;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String valueLektor;

    public Lector(String identificator, String itemsKPI, String valueLektor) {
        this.identificator = identificator;
        this.itemsKPI = itemsKPI;
        this.valueLektor = valueLektor;
    }

    /**
     * List identifikátorů
     *
     * @return
     */
    public static List<Lector> criteriaKPIList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection()  {
        HashMap<String, String> output = new HashMap<String, String>();

        for(Lector r : Lector.find.all())  {
            output.put(r.id.toString(), r.identificator);
        }

        return output;
    }
    public static List<Lector> search() {
        return Lector.find.all();
    }
}
