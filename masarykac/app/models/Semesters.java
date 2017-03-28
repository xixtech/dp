package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public String semesterValue;

    public String semesterVK;

    public String semesterVD;

    public String semesterAr;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date semesterFrom;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date semesterTo;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeekses;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Courses> courses;

    public Semesters(String semesterValue, String semesterVK, String semesterVD, String semesterAr, Date semesterFrom, Date semesterTo) {
        this.semesterValue = semesterValue;
        this.semesterVK = semesterVK;
        this.semesterVD = semesterVD;
        this.semesterAr = semesterAr;
        this.semesterFrom = semesterFrom;
        this.semesterTo = semesterTo;
    }

    public List<StudyPlans> getStudyPlans() {
        return studyPlans;
    }

    public void setStudyPlans(List<StudyPlans> studyPlans) {
        this.studyPlans = studyPlans;
    }

    public String getSemesterValue() {
        return semesterValue;
    }

    public void setSemesterValue(String semesterValue) {
        this.semesterValue = semesterValue;
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

    public String getSemesterAr() {
        return semesterAr;
    }

    public void setSemesterAr(String semesterAr) {
        this.semesterAr = semesterAr;
    }

    public Date getSemesterFrom() {
        return semesterFrom;
    }

    public void setSemesterFrom(Date semesterFrom) {
        this.semesterFrom = semesterFrom;
    }

    public Date getSemesterTo() {
        return semesterTo;
    }

    public void setSemesterTo(Date semesterTo) {
        this.semesterTo = semesterTo;
    }

    public List<ScheduleInWeeks> getScheduleInWeekses() {
        return scheduleInWeekses;
    }

    public void setScheduleInWeekses(List<ScheduleInWeeks> scheduleInWeekses) {
        this.scheduleInWeekses = scheduleInWeekses;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public static Map<String, String> options() {
        List<Semesters> semestersSet = Semesters.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Semesters set : semestersSet) {
            options.put(set.id.toString(), set.semesterValue.toString());
        }
        return options;
    }

    public static Map<String, String> optionsValues() {
        List<Semesters> semestersSet = Semesters.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Semesters set : semestersSet) {
            options.put(set.semesterValue.toString(), set.semesterValue.toString());
        }
        return options;
    }

    public static List<Semesters> search() {
        return Semesters.find.all();
    }

    public static Semesters findById(long id) {
        return find.where().eq("id", id).findUnique();
    }
}