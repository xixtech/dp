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

    public int semesterValue;

    @ManyToOne
    public StudyGroups studyGroups;

    @ManyToOne
    public StudyGroups1 studyGroups1;

    public StudyPlans(Subjects subjects, FieldsOfStudy fieldsOfStudy, Semesters semesters, int semesterValue, StudyGroups studyGroups, StudyGroups1 studyGroups1) {
        this.subjects = subjects;
        this.fieldsOfStudy = fieldsOfStudy;
        this.semesters = semesters;
        this.semesterValue = semesterValue;
        this.studyGroups = studyGroups;
        this.studyGroups1 = studyGroups1;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public FieldsOfStudy getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    public void setFieldsOfStudy(FieldsOfStudy fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public Semesters getSemesters() {
        return semesters;
    }

    public void setSemesters(Semesters semesters) {
        this.semesters = semesters;
    }

    public int getSemesterValue() {
        return semesterValue;
    }

    public void setSemesterValue(int semesterValue) {
        this.semesterValue = semesterValue;
    }

    public StudyGroups getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(StudyGroups studyGroups) {
        this.studyGroups = studyGroups;
    }

    public StudyGroups1 getStudyGroups1() {
        return studyGroups1;
    }

    public void setStudyGroups1(StudyGroups1 studyGroups1) {
        this.studyGroups1 = studyGroups1;
    }
}
