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
public class FinalWorksParticipants extends Model {

    public static Finder<Long, FinalWorksParticipants> find = new Finder<Long, FinalWorksParticipants>(
            FinalWorksParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String teachersRole;

    @ManyToOne
    public FinalWorks finalWorks;

    @ManyToOne
    public Employees employees;

    public static FinalWorksParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<FinalWorksParticipants> subjectSets = FinalWorksParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(FinalWorksParticipants set: subjectSets) {
            options.put(set.id.toString(), set.teachersRole.toString());
        }
        return options;
    }

    public static List<FinalWorksParticipants> search() {
        return FinalWorksParticipants.find.all();
    }
}
