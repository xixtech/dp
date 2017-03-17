package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Teachers extends Model {

    public static Finder<Long, Teachers> find = new Finder<Long, Teachers>(
            Teachers.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Courses courses;

    @ManyToOne
    public Employees employees;

    public int scale;

    public Teachers(Courses courses, Employees employees, int scale) {
        this.courses = courses;
        this.employees = employees;
        this.scale = scale;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public static List<Teachers> search() {
        return Teachers.find.all();
    }
}