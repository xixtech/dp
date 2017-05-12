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

    @ManyToOne
    public Days days;

    public String scheduleFrom;

    public String scheduleTo;

    public String duration;

    @ManyToOne
    public Classroom classRoom;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    @ManyToOne
    public Courses courses;

    public Schedule(List<ScheduleInWeeks> scheduleInWeeks, Courses courses) {
        this.scheduleInWeeks = scheduleInWeeks;
        this.courses = courses;
    }

    public Schedule(Semesters semester, String ident, Courses courses, Days days, String scheduleFrom, String scheduleTo, Classroom classRoom, String duration) {
        this.semester = semester;
        this.ident = ident;
        this.courses = courses;
        this.days = days;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.classRoom = classRoom;
        this.duration = duration;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Classroom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Classroom classRoom) {
        this.classRoom = classRoom;
    }

    public static List<Schedule> search() {
        return Schedule.find.all();
    }
}