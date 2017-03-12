package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FieldsOfStudy extends Model {

    public static Finder<Long, FieldsOfStudy> find = new Finder<Long, FieldsOfStudy>(
            FieldsOfStudy.class);
}