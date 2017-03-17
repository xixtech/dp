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
public class Employees extends Model {

    public static Finder<Long, Employees> find = new Finder<Long, Employees>(
            Employees.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public int personalNumber;

    public String titleBefore;

    public String surname;

    public String firstName;

    public String titleAfter;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Teachers> teachers;

    public Employees(int personalNumber, String titleBefore, String surname, String firstName, String titleAfter) {
        this.personalNumber = personalNumber;
        this.titleBefore = titleBefore;
        this.surname = surname;
        this.firstName = firstName;
        this.titleAfter = titleAfter;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getTitleBefore() {
        return titleBefore;
    }

    public void setTitleBefore(String titleBefore) {
        this.titleBefore = titleBefore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitleAfter() {
        return titleAfter;
    }

    public void setTitleAfter(String titleAfter) {
        this.titleAfter = titleAfter;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public static Employees findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<Employees> search() {
        return Employees.find.all();
    }

    public static Map<String,String> options() {
        List<Employees> subjectSets = Employees.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Employees set: subjectSets) {
            options.put(set.id.toString(), set.personalNumber+"");
        }
        return options;
    }
}
