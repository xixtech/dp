package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FieldsOfStudy extends Model {

    /** Obory **/
    public static Finder<Long, FieldsOfStudy> find = new Finder<Long, FieldsOfStudy>(
            FieldsOfStudy.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    public String fieldOfStudyV;

    public String study;

    public String fieldsOfStudyLanguage;

    public String formOfTeaching;


}