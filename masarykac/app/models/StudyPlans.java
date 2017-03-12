package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class StudyPlans extends Model {

    public static Finder<Long, StudyPlans> find = new Finder<Long, StudyPlans>(
            StudyPlans.class);
}
