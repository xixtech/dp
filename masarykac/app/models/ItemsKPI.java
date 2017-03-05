package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
@Entity
public class ItemsKPI extends Model {
    public static Finder<Long, ItemsKPI> find = new Finder<Long, ItemsKPI>(
            ItemsKPI.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String identificator;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String description;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String unit;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String weight;

    public ItemsKPI(String identificator, String description, String unit, String weight) {
        this.identificator = identificator;
        this.description = description;
        this.unit = unit;
        this.weight = weight;
    }

    /**
     * List identifikátorů
     *
     * @return
     */
    public static List<ItemsKPI> itemsKPIList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection()  {
        HashMap<String, String> output = new HashMap<String, String>();

        for(ItemsKPI r : ItemsKPI.find.all())  {
            output.put(r.id.toString(), r.identificator);
        }

        return output;
    }
}
