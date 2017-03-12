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
public class Schedule extends Model {

    public static Finder<Long, Schedule> find = new Finder<Long, Schedule>(
            Schedule.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
}