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
public class CommitteeToEmployess extends Model {

    public static Finder<Long, CommitteeToEmployess> find = new Finder<Long, CommitteeToEmployess>(
            CommitteeToEmployess.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String roleInComittee;

    @ManyToOne
    public Committee committee;

    @ManyToOne
    public Employees employees;


    public static CommitteeToEmployess findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<CommitteeToEmployess> subjectSets = CommitteeToEmployess.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(CommitteeToEmployess set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<CommitteeToEmployess> search() {
        return CommitteeToEmployess.find.all();
    }
}
