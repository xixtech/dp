package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

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

    public String semester;

    public String ident;

    public String course;

    public int scheduleDay;

    public String scheduleFrom;

    public String scheduleTo;

    public String classRoom;

    public int scheduleWeek;

    public int scheduleYear;

    @ManyToOne
    public Schedule schedule;

    public ScheduleInWeeks(String semester, String ident, String course, int scheduleDay, String scheduleFrom, String scheduleTo, String classRoom, int scheduleWeek, int scheduleYear) {
        this.semester = semester;
        this.ident = ident;
        this.course = course;
        this.scheduleDay = scheduleDay;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.classRoom = classRoom;
        this.scheduleWeek = scheduleWeek;
        this.scheduleYear = scheduleYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
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

    public int getScheduleDay() {
        return scheduleDay;
    }

    public void setScheduleDay(int scheduleDay) {
        this.scheduleDay = scheduleDay;
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

    public static List<ScheduleInWeeks> search() {
        return ScheduleInWeeks.find.all();
    }
}