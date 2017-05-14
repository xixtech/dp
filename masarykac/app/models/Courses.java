package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.*;

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

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    public Courses(String course, int numberOfStudents, Subjects subjects, Semesters semester) {
        this.course = course;
        this.numberOfStudents = numberOfStudents;
        this.subjects = subjects;
        this.semester = semester;
    }

    public Courses(String course, int numberOfStudents, Semesters semester) {
        this.course = course;
        this.numberOfStudents = numberOfStudents;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ScheduleInWeeks> getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(List<ScheduleInWeeks> scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public static Courses findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<Courses> findByCourse(String course) {
        return find.where().eq("course", course).findList();
    }

    public static Map<String, String> options() {
        List<Courses> subjectSets = Courses.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Courses set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<Courses>  searchAAA() {

        List<Courses> list =search();
        for (Iterator<Courses> iterator = list.iterator(); iterator.hasNext(); ) {
            Courses courses = iterator.next();
            String identToCheck = courses.getSubjects().getIdent();

            if (identToCheck.toUpperCase().startsWith("P")) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Courses> searchAAB() {

        List<Courses> list =search();
        for (Iterator<Courses> iterator = list.iterator(); iterator.hasNext(); ) {
            Courses courses = iterator.next();
            String identToCheck = courses.getSubjects().getIdent();

            if (identToCheck.toUpperCase().startsWith("P")==false) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Courses> searchCB() {
        List<Courses> list = search();
        for (Iterator<Courses> iterator = list.iterator(); iterator.hasNext(); ) {
            Courses courses = iterator.next();
            String identToCheck = courses.getSubjects().getIdent();
            char fourth = identToCheck.toUpperCase().charAt(3);
            if (fourth!='E') {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Courses> search() {
        return Courses.find.all();
    }

    public static List<Courses> searchCombi() {
        List<Courses> list = search();
        for (Iterator<Courses> iterator = list.iterator(); iterator.hasNext(); ) {
            Courses courses = iterator.next();
            boolean combi = courses.getSubjects().isFormCombined();
            if (!combi) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Courses> searchPresentation() {
        List<Courses> list = search();
        for (Iterator<Courses> iterator = list.iterator(); iterator.hasNext(); ) {
            Courses courses = iterator.next();
            boolean pres = courses.getSubjects().isFormPresentation();
            if (!pres) {
                iterator.remove();
            }
        }
        return list;
    }

}