package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class StudyGroups1 extends Model {

    public static Finder<Long, StudyGroups1> find = new Finder<Long, StudyGroups1>(
            StudyGroups1.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    public String fieldOfStudyV;

    public String study;

    public String groupFieldsOfStudyLanguage;

    public String formOfTeaching;


}