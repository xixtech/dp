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
public class TeachersRole extends Model {

    public static Finder<Long, TeachersRole> find = new Finder<Long, TeachersRole>(
            TeachersRole.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String role;

    public boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @OneToMany(mappedBy="teachersRole",cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Teachers> teachers;

    public TeachersRole(String role) {
        this.role = role;
        this.active = true;
    }

    public static TeachersRole findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<TeachersRole> search() {
        return TeachersRole.find.all();
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public static Map<String, String> options() {
        List<TeachersRole> subjectSets = TeachersRole.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (TeachersRole set : subjectSets) {
            options.put(set.id.toString(), set.role.toString());
        }
        return options;
    }


}