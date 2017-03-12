package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class ScheduleInWeeks extends Model {

    public static Finder<Long, ScheduleInWeeks> find = new Finder<Long, ScheduleInWeeks>(
            ScheduleInWeeks.class);
}