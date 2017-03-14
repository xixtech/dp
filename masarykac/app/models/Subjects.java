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
}
