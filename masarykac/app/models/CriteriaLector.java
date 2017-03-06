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
public class CriteriaLector  extends Model {
    public static Model.Finder<Long, CriteriaLector> find = new Model.Finder<Long, CriteriaLector>(
            CriteriaLector.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String period;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String identificator;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String itemsKPI;

    @Constraints.Required(message = "Identifikátor je povinný")
    @Formats.NonEmpty
    public String valueLektor;


    public CriteriaLector(String period, String identificator, String itemsKPI, String valueLektor) {
        this.period = period;
        this.identificator = identificator;
        this.itemsKPI = itemsKPI;
        this.valueLektor = valueLektor;
    }


    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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
    public static List<CriteriaLector> criteriaKPIList() {
        return find.where().findList();
    }

    public static HashMap<String, String> selectCollection()  {
        HashMap<String, String> output = new HashMap<String, String>();

        for(CriteriaLector r : CriteriaLector.find.all())  {
            output.put(r.id.toString(), r.period);
        }

        return output;
    }
    public static List<CriteriaLector> search() {
        return CriteriaLector.find.all();
    }
}
