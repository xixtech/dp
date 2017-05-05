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
public class Statement extends Model {

    public static Finder<Long, Statement> find = new Finder<Long, Statement>(
            Statement.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date date;

    public String state;

    @ManyToOne
    public Semesters semester;

    @ManyToOne
    public Employees employees;

    @ManyToOne
    public Employees managerEmployee;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementCommitteeParticipants> statementCommitteeParticipants;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementFinalWorksParticipants> statementFinalWorksParticipants;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementProjectsParticipants> projectsParticipants;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementPublicationsParticipants> statementPublicationsParticipants;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementTeachersParticipants> statementTeachersParticipants;

    @OneToMany(mappedBy = "statement", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementVisitsParticipants> statementVisitsParticipants;

    public Statement(Date date, String state, Semesters semester,Employees employees) {
        this.date = date;
        this.state = state;
        this.semester = semester;
        this.employees=employees;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Employees getManagerEmployee() {
        return managerEmployee;
    }

    public void setManagerEmployee(Employees managerEmployee) {
        this.managerEmployee = managerEmployee;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Statement findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<Statement> subjectSets = Statement.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Statement set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<Statement> search() {
        return Statement.find.all();
    }

    public static List<Statement> findBySemester(long semester) {
        return find.where().eq("semester.id", semester).findList();
    }

    public static List<Statement> findByEmployees(long employees) {
        return find.where().eq("employees.id", employees).findList();
    }
}
