package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Days extends Model {

    public static Finder<Long, Days> find = new Finder<Long, Days>(
            Days.class);
}