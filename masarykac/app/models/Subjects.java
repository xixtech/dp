package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

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

    public Subjects(String ident, String identOld, String titleC, String titleA, int hoursP, int hoursC, int hoursSemester, int credits, boolean credit, boolean exam, boolean classifiedCredit, String department, boolean formPresentation, boolean formCombined) {
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
}
