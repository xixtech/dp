package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Ideas extends Model {

    public static Finder<Long, Ideas> find = new Finder<Long, Ideas>(
            Ideas.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String idea;

    public Date date;

    @OneToOne(cascade = CascadeType.ALL)
    public Employees employees;

    public Ideas(String idea, Date date) {
        this.idea = idea;
        this.date = date;
    }

    public static List<Ideas> search() {
        return Ideas.find.all();
    }

    public static Ideas findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public static Map<String,String> options() {
        List<Ideas> subjectSets = Ideas.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Ideas set: subjectSets) {
            options.put(set.id.toString(), set.idea.toString());
        }
        return options;
    }
}