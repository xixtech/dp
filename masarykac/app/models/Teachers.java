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

    public double scale;

    public double summary;

    public double recountedSummary;

    @ManyToOne
    public TeachersRole teachersRole;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<TeachersInWeeks> teachersInWeeks;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementTeachersParticipants> statementTeachersParticipants;

    public Teachers(Courses courses, Employees employees, double scale, double summary, double recountedSummary) {
        this.courses = courses;
        this.employees = employees;
        this.scale = scale;
        this.summary = summary;
        this.recountedSummary = recountedSummary;
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

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSummary() {
        return summary;
    }

    public void setSummary(double summary) {
        this.summary = summary;
    }

    public double getRecountedSummary() {
        return recountedSummary;
    }

    public void setRecountedSummary(double recountedSummary) {
        this.recountedSummary = recountedSummary;
    }

    public List<TeachersInWeeks> getTeachersInWeeks() {
        return teachersInWeeks;
    }

    public void setTeachersInWeeks(List<TeachersInWeeks> teachersInWeeks) {
        this.teachersInWeeks = teachersInWeeks;
    }

    public TeachersRole getTeachersRole() {
        return teachersRole;
    }

    public void setTeachersRole(TeachersRole teachersRole) {
        this.teachersRole = teachersRole;
    }

    public List<StatementTeachersParticipants> getStatementTeachersParticipants() {
        return statementTeachersParticipants;
    }

    public void setStatementTeachersParticipants(List<StatementTeachersParticipants> statementTeachersParticipants) {
        this.statementTeachersParticipants = statementTeachersParticipants;
    }

    public static List<Teachers> search() {
        return Teachers.find.all();
    }

    public static Teachers findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<Teachers> subjectSets = Teachers.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Teachers set : subjectSets) {
            options.put(set.id.toString(), set.employees.getSurname().toString() + " " + set.employees.getFirstName().toString());
        }
        return options;
    }

    public static Map<String, Long> teachersIds() {
        List<Teachers> subjectSets = Teachers.find.all();
        LinkedHashMap<String, Long> options = new LinkedHashMap<String, Long>();
        for (Teachers set : subjectSets) {
            options.put(set.id.toString(), set.getEmployees().getId());
        }
        return options;
    }
}