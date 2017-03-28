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
    public Semesters semester;

    public String course;

    public int numberOfStudents;

    @ManyToOne
    public Subjects subjects;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Teachers> teachers;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Schedule> schedule;

    public Courses(String course, int numberOfStudents, Subjects subjects, Semesters semester) {
        this.course = course;
        this.numberOfStudents = numberOfStudents;
        this.subjects = subjects;
        this.semester = semester;
    }

    public Courses(String course, int numberOfStudents, Subjects subjects) {
        this.course = course;
        this.numberOfStudents = numberOfStudents;
        this.subjects = subjects;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public static Courses findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<Courses> subjectSets = Courses.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Courses set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<Courses> search() {
        return Courses.find.all();
    }

}