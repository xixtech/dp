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
public class ComitteeToEmployess extends Model {

    public static Finder<Long, ComitteeToEmployess> find = new Finder<Long, ComitteeToEmployess>(
            ComitteeToEmployess.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String roleInComittee;

    @ManyToOne
    public Comittee comittee;

    @ManyToOne
    public Employees employees;


    public static ComitteeToEmployess findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<ComitteeToEmployess> subjectSets = ComitteeToEmployess.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(ComitteeToEmployess set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<ComitteeToEmployess> search() {
        return ComitteeToEmployess.find.all();
    }
}
