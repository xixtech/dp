package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FinalWorksToEmployees extends Model {

    public static Finder<Long, FinalWorksToEmployees> find = new Finder<Long, FinalWorksToEmployees>(
            FinalWorksToEmployees.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String teachersRole;

    @ManyToOne
    public FinalWorks finalWorks;

    @ManyToOne
    public Employees employees;

    public static FinalWorksToEmployees findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<FinalWorksToEmployees> subjectSets = FinalWorksToEmployees.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(FinalWorksToEmployees set: subjectSets) {
            options.put(set.id.toString(), set.teachersRole.toString());
        }
        return options;
    }

    public static List<FinalWorksToEmployees> search() {
        return FinalWorksToEmployees.find.all();
    }
}
