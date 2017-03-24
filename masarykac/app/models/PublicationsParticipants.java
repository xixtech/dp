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
public class PublicationsParticipants extends Model {

    public static Finder<Long, PublicationsParticipants> find = new Finder<Long, PublicationsParticipants>(
            PublicationsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String faculty;

    public String orderInPublication;

    public String department;

    public String share;

    @ManyToOne
    public Publications publications;

    @ManyToOne
    public Employees employees;

    public static PublicationsParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<PublicationsParticipants> subjectSets = PublicationsParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(PublicationsParticipants set: subjectSets) {
            options.put(set.id.toString(), set.faculty.toString());
        }
        return options;
    }

    public static List<PublicationsParticipants> search() {
        return PublicationsParticipants.find.all();
    }
}
