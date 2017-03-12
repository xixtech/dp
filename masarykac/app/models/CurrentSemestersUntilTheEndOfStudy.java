package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class CurrentSemestersUntilTheEndOfStudy extends Model {

    public static Finder<Long, CurrentSemestersUntilTheEndOfStudy> find = new Finder<Long, CurrentSemestersUntilTheEndOfStudy>(
            CurrentSemestersUntilTheEndOfStudy.class);
}