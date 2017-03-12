package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Courses extends Model {

    public static Finder<Long, Courses> find = new Finder<Long, Courses>(
            Courses.class);
}