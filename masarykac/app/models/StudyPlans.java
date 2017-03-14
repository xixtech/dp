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

    public String semester;

    @ManyToOne
    public Subjects subjects;

    @ManyToOne
    public FieldsOfStudy fieldsOfStudy;

    @ManyToOne
    public Semesters semesters;

    @ManyToOne
    public StudyGroups studyGroups;

    @ManyToOne
    public GroupFieldsOfStudy groupFieldsOfStudy;
}
