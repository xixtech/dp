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
public class Classroom extends Model {

    public static Finder<Long, Classroom> find = new Finder<Long, Classroom>(
            Classroom.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public int capacity;

    public String classroomName;

    public Classroom(int capacity, String classroomName) {
        this.capacity = capacity;
        this.classroomName = classroomName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public static Classroom findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Classroom> subjectSets = Classroom.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Classroom set: subjectSets) {
            options.put(set.id.toString(), set.classroomName.toString()+" , max. kapacita: "+set.capacity);
        }
        return options;
    }

    public static List<Classroom> search() {
        return Classroom.find.all();
    }
}
