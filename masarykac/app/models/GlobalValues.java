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
public class GlobalValues extends Model {

    public static Finder<Long, GlobalValues> find = new Finder<Long, GlobalValues>(
            GlobalValues.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public long semesterId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(long semesterId) {
        this.semesterId = semesterId;
    }

    public static GlobalValues findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<GlobalValues> search() {
        return GlobalValues.find.all();
    }
}
