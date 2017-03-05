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
public class SalaryScale  extends Model {
    public static Model.Finder<Long, SalaryScale> find = new Model.Finder<Long, SalaryScale>(
            SalaryScale.class);

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
    public String valueDocent;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String valueOdbornyAsistent;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String valueAsistent;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String valueLektor;

    public SalaryScale(String identificator, String description, String unit, String valueDocent, String valueOdbornyAsistent, String valueAsistent, String valueLektor) {
        this.identificator = identificator;
        this.description = description;
        this.unit = unit;
        this.valueDocent = valueDocent;
        this.valueOdbornyAsistent = valueOdbornyAsistent;
        this.valueAsistent = valueAsistent;
        this.valueLektor = valueLektor;
    }

    /**
     * List identifikátorů
     *
     * @return
     */
    public static List<SalaryScale> salaryScaleList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection()  {
        HashMap<String, String> output = new HashMap<String, String>();

        for(SalaryScale r : SalaryScale.find.all())  {
            output.put(r.id.toString(), r.identificator);
        }

        return output;
    }
}