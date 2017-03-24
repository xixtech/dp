package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Visits extends Model {

    public static Finder<Long, Visits> find = new Finder<Long, Visits>(
            Visits.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String purposeOfVisit;

    public String country;

    public String event;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date visitFrom;
    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date visitTo;

    public String semester;

    @ManyToOne
    public Employees employees;

    public static Visits findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Visits> subjectSets = Visits.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Visits set: subjectSets) {
            options.put(set.id.toString(), set.purposeOfVisit.toString());
        }
        return options;
    }

    public static List<Visits> search() {
        return Visits.find.all();
    }
}
