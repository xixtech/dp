package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Subjects extends Model {

    public static Finder<Long, Subjects> find = new Finder<Long, Subjects>(
            Subjects.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String ident;

    public String identOld;

    public String titleC;

    public String titleA;

    public int hoursP;

    public int hoursC;

    public int hoursSemester;

    public int credits;

    public boolean credit;

    public boolean exam;

    public boolean classifiedCredit;

    public String department;

    public boolean formPresentation;

    public boolean formCombined;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Courses> courses;

    public Subjects(String ident, String identOld, String titleC, String titleA, int hoursP, int hoursC,
                    int hoursSemester, int credits, boolean credit, boolean exam, boolean classifiedCredit, String department, boolean formPresentation, boolean formCombined) {
        this.ident = ident;
        this.identOld = identOld;
        this.titleC = titleC;
        this.titleA = titleA;
        this.hoursP = hoursP;
        this.hoursC = hoursC;
        this.hoursSemester = hoursSemester;
        this.credits = credits;
        this.credit = credit;
        this.exam = exam;
        this.classifiedCredit = classifiedCredit;
        this.department = department;
        this.formPresentation = formPresentation;
        this.formCombined = formCombined;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getIdentOld() {
        return identOld;
    }

    public void setIdentOld(String identOld) {
        this.identOld = identOld;
    }

    public String getTitleC() {
        return titleC;
    }

    public void setTitleC(String titleC) {
        this.titleC = titleC;
    }

    public String getTitleA() {
        return titleA;
    }

    public void setTitleA(String titleA) {
        this.titleA = titleA;
    }

    public int getHoursP() {
        return hoursP;
    }

    public void setHoursP(int hoursP) {
        this.hoursP = hoursP;
    }

    public int getHoursC() {
        return hoursC;
    }

    public void setHoursC(int hoursC) {
        this.hoursC = hoursC;
    }

    public int getHoursSemester() {
        return hoursSemester;
    }

    public void setHoursSemester(int hoursSemester) {
        this.hoursSemester = hoursSemester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }

    public boolean isClassifiedCredit() {
        return classifiedCredit;
    }

    public void setClassifiedCredit(boolean classifiedCredit) {
        this.classifiedCredit = classifiedCredit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isFormPresentation() {
        return formPresentation;
    }

    public void setFormPresentation(boolean formPresentation) {
        this.formPresentation = formPresentation;
    }

    public boolean isFormCombined() {
        return formCombined;
    }

    public void setFormCombined(boolean formCombined) {
        this.formCombined = formCombined;
    }

    public List<StudyPlans> getStudyPlans() {
        return studyPlans;
    }

    public void setStudyPlans(List<StudyPlans> studyPlans) {
        this.studyPlans = studyPlans;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public static List<Subjects> findIdent(String ident) {
        return find.where().eq("ident", ident).findList();
    }

    public static Subjects findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Subjects> subjectSets = Subjects.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Subjects set: subjectSets) {
            options.put(set.id.toString(), set.ident.toString());
        }
        return options;
    }

    public static List<Subjects> search() {
        return Subjects.find.all();
    }
}
