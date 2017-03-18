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

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    @ManyToOne
    public Courses courses;

    public Schedule(List<ScheduleInWeeks> scheduleInWeeks, Courses courses) {
        this.scheduleInWeeks = scheduleInWeeks;
        this.courses = courses;
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

    public static List<Schedule> search() {
        return Schedule.find.all();
    }
}