package models;

import com.avaje.ebean.Model;
import org.joda.time.*;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class ScheduleInWeeks extends Model {

    public static Finder<Long, ScheduleInWeeks> find = new Finder<Long, ScheduleInWeeks>(
            ScheduleInWeeks.class);

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

    public String classRoom;

    public int scheduleWeek;

    public int scheduleYear;

    @ManyToOne
    public Courses courses;

    @ManyToOne
    public Schedule schedule;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<TeachersInWeeks> teachersInWeeks;

    public ScheduleInWeeks(Semesters semester, String ident, Courses courses, Days days, String scheduleFrom, String scheduleTo, String classRoom, int scheduleWeek, int scheduleYear, Schedule schedule) {
        this.semester = semester;
        this.ident = ident;
        this.courses = courses;
        this.days = days;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.classRoom = classRoom;
        this.scheduleWeek = scheduleWeek;
        this.scheduleYear = scheduleYear;
        this.schedule = schedule;
    }

    public ScheduleInWeeks(Semesters semester, Courses courses, Days days, String scheduleFrom, String scheduleTo, String classRoom, int scheduleWeek, int scheduleYear) {
        this.semester = semester;
        this.courses = courses;
        this.days = days;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.classRoom = classRoom;
        this.scheduleWeek = scheduleWeek;
        this.scheduleYear = scheduleYear;
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

    public Courses getCourse() {
        return courses;
    }

    public void setCourse(Courses courses) {
        this.courses = courses;
    }

    public String getDay() {
        return days.getDay();
    }

    public void setDay(Days scheduleDay) {
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

    public int getScheduleWeek() {
        return scheduleWeek;
    }

    public void setScheduleWeek(int scheduleWeek) {
        this.scheduleWeek = scheduleWeek;
    }

    public int getScheduleYear() {
        return scheduleYear;
    }

    public void setScheduleYear(int scheduleYear) {
        this.scheduleYear = scheduleYear;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public List<TeachersInWeeks> getTeachersInWeeks() {
        return teachersInWeeks;
    }

    public void setTeachersInWeeks(List<TeachersInWeeks> teachersInWeeks) {
        this.teachersInWeeks = teachersInWeeks;
    }

    public static List<ScheduleInWeeks> search() {
        return ScheduleInWeeks.find.all();
    }

    public static ScheduleInWeeks findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<ScheduleInWeeks> subjectSets = ScheduleInWeeks.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (ScheduleInWeeks set : subjectSets) {
            options.put(set.id.toString(), set.semester.toString());
        }
        return options;
    }
}