package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public String ident;

    public String fieldOfStudy;

    public String semesterEntry;

    public String semester;

    public String group;

    public String groupFieldOfStudy;

    public StudyPlans(String ident, String fieldOfStudy, String semesterEntry, String semester, String group, String groupFieldOfStudy) {
        this.ident = ident;
        this.fieldOfStudy = fieldOfStudy;
        this.semesterEntry = semesterEntry;
        this.semester = semester;
        this.group = group;
        this.groupFieldOfStudy = groupFieldOfStudy;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSemesterEntry() {
        return semesterEntry;
    }

    public void setSemesterEntry(String semesterEntry) {
        this.semesterEntry = semesterEntry;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroupFieldOfStudy() {
        return groupFieldOfStudy;
    }

    public void setGroupFieldOfStudy(String groupFieldOfStudy) {
        this.groupFieldOfStudy = groupFieldOfStudy;
    }
}
