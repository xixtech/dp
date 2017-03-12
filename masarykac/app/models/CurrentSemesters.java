package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class CurrentSemesters extends Model {

    public static Finder<Long, CurrentSemesters> find = new Finder<Long, CurrentSemesters>(
            CurrentSemesters.class);
}