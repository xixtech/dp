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
public class CriteriaKPI extends Model {
    public static Model.Finder<Long, CriteriaKPI> find = new Model.Finder<Long, CriteriaKPI>(
            CriteriaKPI.class);

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

    public CriteriaKPI(String identificator, String itemsKPI, String valueDocent, String valueOdbornyAsistent, String valueAsistent, String valueLektor) {
        this.identificator = identificator;
        this.itemsKPI = itemsKPI;
        this.valueDocent = valueDocent;
        this.valueOdbornyAsistent = valueOdbornyAsistent;
        this.valueAsistent = valueAsistent;
        this.valueLektor = valueLektor;
    }

    public String getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    public String getItemsKPI() {
        return itemsKPI;
    }

    public void setItemsKPI(String itemsKPI) {
        this.itemsKPI = itemsKPI;
    }

    public String getValueDocent() {
        return valueDocent;
    }

    public void setValueDocent(String valueDocent) {
        this.valueDocent = valueDocent;
    }

    public String getValueOdbornyAsistent() {
        return valueOdbornyAsistent;
    }

    public void setValueOdbornyAsistent(String valueOdbornyAsistent) {
        this.valueOdbornyAsistent = valueOdbornyAsistent;
    }

    public String getValueAsistent() {
        return valueAsistent;
    }

    public void setValueAsistent(String valueAsistent) {
        this.valueAsistent = valueAsistent;
    }

    public String getValueLektor() {
        return valueLektor;
    }

    public void setValueLektor(String valueLektor) {
        this.valueLektor = valueLektor;
    }

    /**
     * List identifikátorů
     *
     * @return
     */
    public static List<CriteriaKPI> criteriaKPIList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection() {
        HashMap<String, String> output = new HashMap<String, String>();

        for (CriteriaKPI r : CriteriaKPI.find.all()) {
            output.put(r.id.toString(), r.identificator);
        }

        return output;
    }

    public static List<CriteriaKPI> search() {
        return CriteriaKPI.find.all();
    }
}
