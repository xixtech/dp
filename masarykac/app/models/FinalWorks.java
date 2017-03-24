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
public class FinalWorks extends Model {

    public static Finder<Long, FinalWorks> find = new Finder<Long, FinalWorks>(
            FinalWorks.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String finalWorksName;

    public String names;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date year;

    public String semester;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<FinalWorksToEmployees> finalWorksToEmployees;

    public static FinalWorks findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<FinalWorks> subjectSets = FinalWorks.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(FinalWorks set: subjectSets) {
            options.put(set.id.toString(), set.finalWorksName.toString());
        }
        return options;
    }

    public static List<FinalWorks> search() {
        return FinalWorks.find.all();
    }
}
