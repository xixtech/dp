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
public class Semesters extends Model {

    public static Finder<Long, Semesters> find = new Finder<Long, Semesters>(
            Semesters.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String semester;

    public String semesterVK;

    public String semesterVD;

    public String ar;

    public String from;

    public String to;

    public Semesters(String semester, String semesterVK, String semesterVD, String ar, String from, String to) {
        this.semester = semester;
        this.semesterVK = semesterVK;
        this.semesterVD = semesterVD;
        this.ar = ar;
        this.from = from;
        this.to = to;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemesterVK() {
        return semesterVK;
    }

    public void setSemesterVK(String semesterVK) {
        this.semesterVK = semesterVK;
    }

    public String getSemesterVD() {
        return semesterVD;
    }

    public void setSemesterVD(String semesterVD) {
        this.semesterVD = semesterVD;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}