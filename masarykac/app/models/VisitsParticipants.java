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
public class VisitsParticipants extends Model {

    public static Finder<Long, VisitsParticipants> find = new Finder<Long, VisitsParticipants>(
            VisitsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Employees employees;

    @ManyToOne
    public Visits visits;

    @OneToMany(mappedBy = "visitsParticipants",cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementVisitsParticipants> statementVisitsParticipants;

    public VisitsParticipants(Employees employees, Visits visits) {
        this.employees = employees;
        this.visits = visits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Visits getVisits() {
        return visits;
    }

    public void setVisits(Visits visits) {
        this.visits = visits;
    }

    public List<StatementVisitsParticipants> getStatementVisitsParticipants() {
        return statementVisitsParticipants;
    }

    public void setStatementVisitsParticipants(List<StatementVisitsParticipants> statementVisitsParticipants) {
        this.statementVisitsParticipants = statementVisitsParticipants;
    }

    public static VisitsParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<VisitsParticipants> subjectSets = VisitsParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(VisitsParticipants set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<VisitsParticipants> search() {
        return VisitsParticipants.find.all();
    }
}
