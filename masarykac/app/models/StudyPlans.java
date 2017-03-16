package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class StudyPlans extends Model {

    public static Finder<Long, StudyPlans> find = new Finder<Long, StudyPlans>(
            StudyPlans.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Subjects subjects;

    @ManyToOne
    public FieldsOfStudy fieldsOfStudy;

    @ManyToOne
    public Semesters semesters;

    public int semester;

    @ManyToOne
    public StudyGroups studyGroups;

    @ManyToOne
    public StudyGroups1 studyGroups1;
}
