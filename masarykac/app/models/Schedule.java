package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Schedule extends Model {

    public static Finder<Long, Schedule> find = new Finder<Long, Schedule>(
            Schedule.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Semesters semester;

    public String ident;

    public String course;

    @ManyToOne
    public Days days;

    public String scheduleFrom;

    public String scheduleTo;

    public String classRoom;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    @ManyToOne
    public Courses courses;

    public Schedule(List<ScheduleInWeeks> scheduleInWeeks, Courses courses) {
        this.scheduleInWeeks = scheduleInWeeks;
        this.courses = courses;
    }

    public Schedule(Semesters semester, String ident, String course, Days days, String scheduleFrom, String scheduleTo, String classRoom) {
        this.semester = semester;
        this.ident = ident;
        this.course = course;
        this.days = days;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.classRoom = classRoom;
    }

    public List<ScheduleInWeeks> getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(List<ScheduleInWeeks> scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Days getDay() {
        return days;
    }

    public void setDay(Days days) {
        this.days = days;
    }

    public String getScheduleFrom() {
        return scheduleFrom;
    }

    public void setScheduleFrom(String scheduleFrom) {
        this.scheduleFrom = scheduleFrom;
    }

    public String getScheduleTo() {
        return scheduleTo;
    }

    public void setScheduleTo(String scheduleTo) {
        this.scheduleTo = scheduleTo;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public static List<Schedule> search() {
        return Schedule.find.all();
    }
}