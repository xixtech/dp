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
public class Courses extends Model {

    public static Finder<Long, Courses> find = new Finder<Long, Courses>(
            Courses.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Subjects subjects;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Teachers> teachers;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Schedule> schedule;

    public static Courses findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String,String> options() {
        List<Courses> subjectSets = Courses.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Courses set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

}