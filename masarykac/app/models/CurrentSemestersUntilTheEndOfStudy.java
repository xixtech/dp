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
public class CurrentSemestersUntilTheEndOfStudy extends Model {

    public static Finder<Long, CurrentSemestersUntilTheEndOfStudy> find = new Finder<Long, CurrentSemestersUntilTheEndOfStudy>(
            CurrentSemestersUntilTheEndOfStudy.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String fieldOfStudy;

    public String semesterEntry;

    public String semester;

    public CurrentSemestersUntilTheEndOfStudy(String fieldOfStudy, String semesterEntry, String semester) {
        this.fieldOfStudy = fieldOfStudy;
        this.semesterEntry = semesterEntry;
        this.semester = semester;
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
}