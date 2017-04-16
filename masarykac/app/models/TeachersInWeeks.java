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
public class TeachersInWeeks extends Model {

    public static Finder<Long, TeachersInWeeks> find = new Finder<Long, TeachersInWeeks>(
            TeachersInWeeks.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Teachers teachers;

    @ManyToOne
    public ScheduleInWeeks scheduleInWeeks;

    public float scale;

    public TeachersInWeeks(Teachers teachers, ScheduleInWeeks scheduleInWeeks, float scale) {
        this.teachers = teachers;
        this.scheduleInWeeks = scheduleInWeeks;
        this.scale = scale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public ScheduleInWeeks getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(ScheduleInWeeks scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public static List<TeachersInWeeks> search() {
        return TeachersInWeeks.find.all();
    }


}