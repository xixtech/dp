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
public class AccessRole extends Model {

    public static Finder<Long, AccessRole> find = new Finder<Long, AccessRole>(
            AccessRole.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String role;
    public String xx;

    public String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "accessRole", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Employees> employees;

    public AccessRole(String role, String description) {
        this.role = role;
        this.description = description;
        this.active = true;
    }

    public static AccessRole findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static AccessRole findByRoleName(String role) {
        return find.where().eq("role", role).findUnique();
    }

    public static List<AccessRole> search() {
        return AccessRole.find.all();
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public static Map<String, String> options() {
        List<AccessRole> subjectSets = AccessRole.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (AccessRole set : subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.description.toString());
            }
        }
        return options;
    }


}