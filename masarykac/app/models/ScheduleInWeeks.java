package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

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


}