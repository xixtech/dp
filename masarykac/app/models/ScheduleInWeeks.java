package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public int day;

    public String from;

    public String to;

    public String classRoom;

    public int week;

    public int year;

    public ScheduleInWeeks(String semester, String ident, String course, int day, String from, String to, String classRoom, int week, int year) {
        this.semester = semester;
        this.ident = ident;
        this.course = course;
        this.day = day;
        this.from = from;
        this.to = to;
        this.classRoom = classRoom;
        this.week = week;
        this.year = year;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}