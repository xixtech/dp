package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class CurrentSemesters extends Model {

    public static Finder<Long, CurrentSemesters> find = new Finder<Long, CurrentSemesters>(
            CurrentSemesters.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String fieldOfStudy;

    public String semesterEntry;

    public String semester;

    public CurrentSemesters(String fieldOfStudy, String semesterEntry, String semester) {
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

    public static List<CurrentSemesters> search() {
        return CurrentSemesters.find.all();
    }
}