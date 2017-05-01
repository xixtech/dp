package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Classroom extends Model {

    public static Finder<Long, Classroom> find = new Finder<Long, Classroom>(
            Classroom.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public int capacity;

    public String classroomName;

    public boolean active;

    @OneToMany(mappedBy = "classRoom", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Schedule> schedule;

    @OneToMany(mappedBy = "classRoom", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    public Classroom(int capacity, String classroomName) {
        this.capacity = capacity;
        this.classroomName = classroomName;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<ScheduleInWeeks> getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(List<ScheduleInWeeks> scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public static Classroom findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<Classroom> subjectSets = Classroom.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Classroom set : subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.classroomName.toString() + " , max. kapacita: " + set.capacity);
            }
        }
        return options;
    }

    public static List<Classroom> search() {
        return Classroom.find.all();
    }
}
