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
}