package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Groups extends Model {

    public static Finder<Long, Groups> find = new Finder<Long, Groups>(
            Groups.class);
}