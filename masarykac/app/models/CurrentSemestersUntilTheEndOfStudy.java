package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    public Semesters semester;

    public CurrentSemestersUntilTheEndOfStudy(String fieldOfStudy, String semesterEntry, Semesters semester) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public static List<CurrentSemestersUntilTheEndOfStudy> search() {
        return CurrentSemestersUntilTheEndOfStudy.find.all();
    }
}