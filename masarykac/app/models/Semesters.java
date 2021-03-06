package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.*;
import java.util.*;

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

    public boolean active;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeekses;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Courses> courses;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Visits> visits;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Committee> committee;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<FinalWorks> finalWorks;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Projects> projects;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Schedule> schedule;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Publications> publications;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementCommitteeParticipants> statementCommitteeParticipants;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementFinalWorksParticipants> statementFinalWorksParticipants;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementProjectsParticipants> projectsParticipants;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementPublicationsParticipants> statementPublicationsParticipants;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementTeachersParticipants> statementTeachersParticipants;

    @OneToMany(mappedBy = "semester", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementVisitsParticipants> statementVisitsParticipants;


    public Semesters(String semesterValue, String semesterVK, String semesterVD, String semesterAr, Date semesterFrom, Date semesterTo) {
        this.semesterValue = semesterValue;
        this.semesterVK = semesterVK;
        this.semesterVD = semesterVD;
        this.semesterAr = semesterAr;
        this.semesterFrom = semesterFrom;
        this.semesterTo = semesterTo;
        this.active = true;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Visits> getVisits() {
        return visits;
    }

    public void setVisits(List<Visits> visits) {
        this.visits = visits;
    }

    public List<Committee> getCommittee() {
        return committee;
    }

    public void setCommittee(List<Committee> committee) {
        this.committee = committee;
    }

    public List<FinalWorks> getFinalWorks() {
        return finalWorks;
    }

    public void setFinalWorks(List<FinalWorks> finalWorks) {
        this.finalWorks = finalWorks;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<Publications> getPublications() {
        return publications;
    }

    public void setPublications(List<Publications> publications) {
        this.publications = publications;
    }

    public List<ScheduleInWeeks> getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(List<ScheduleInWeeks> scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public List<StatementCommitteeParticipants> getStatementCommitteeParticipants() {
        return statementCommitteeParticipants;
    }

    public void setStatementCommitteeParticipants(List<StatementCommitteeParticipants> statementCommitteeParticipants) {
        this.statementCommitteeParticipants = statementCommitteeParticipants;
    }

    public List<StatementFinalWorksParticipants> getStatementFinalWorksParticipants() {
        return statementFinalWorksParticipants;
    }

    public void setStatementFinalWorksParticipants(List<StatementFinalWorksParticipants> statementFinalWorksParticipants) {
        this.statementFinalWorksParticipants = statementFinalWorksParticipants;
    }

    public List<StatementProjectsParticipants> getProjectsParticipants() {
        return projectsParticipants;
    }

    public void setProjectsParticipants(List<StatementProjectsParticipants> projectsParticipants) {
        this.projectsParticipants = projectsParticipants;
    }

    public List<StatementPublicationsParticipants> getStatementPublicationsParticipants() {
        return statementPublicationsParticipants;
    }

    public void setStatementPublicationsParticipants(List<StatementPublicationsParticipants> statementPublicationsParticipants) {
        this.statementPublicationsParticipants = statementPublicationsParticipants;
    }

    public List<StatementTeachersParticipants> getStatementTeachersParticipants() {
        return statementTeachersParticipants;
    }

    public void setStatementTeachersParticipants(List<StatementTeachersParticipants> statementTeachersParticipants) {
        this.statementTeachersParticipants = statementTeachersParticipants;
    }

    public List<StatementVisitsParticipants> getStatementVisitsParticipants() {
        return statementVisitsParticipants;
    }

    public void setStatementVisitsParticipants(List<StatementVisitsParticipants> statementVisitsParticipants) {
        this.statementVisitsParticipants = statementVisitsParticipants;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static Map<String, String> options() {
        List<Semesters> semestersSet = Semesters.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Semesters set : semestersSet) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.semesterValue.toString());
            }
        }
        return options;
    }

    public static Map<String, String> optionsValues() {
        List<Semesters> semestersSet = Semesters.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Semesters set : semestersSet) {
            if (set.isActive()) {
                options.put(set.semesterValue.toString(), set.semesterValue.toString());
            }
        }
        return options;
    }

    public static String[] getKey() {

        String[] arr1 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v = "";
        while (entriesIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr1[i] = mapping.getKey().toString() + ";";
            v = mapping.getKey().toString();
            i++;
        }
        if (arr1.length > 0) {
            arr1[arr1.length - 1] = v;
        }
        return arr1;
    }

    public static String[] getValue() {

        String[] arr2 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v = "";
        while (entriesIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr2[i] = mapping.getValue().toString() + ";";
            v = mapping.getValue().toString();
            i++;
        }
        if (arr2.length > 0) {
            arr2[arr2.length - 1] = v;
        }
        return arr2;
    }

    public static List<Semesters> search() {
        return Semesters.find.all();
    }

    public static Semesters findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Semesters findBySemValue(String semesterValue) {
        return find.where().eq("semesterValue", semesterValue).findUnique();
    }
}