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
public class FinalWorksParticipants extends Model {

    public static Finder<Long, FinalWorksParticipants> find = new Finder<Long, FinalWorksParticipants>(
            FinalWorksParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String teachersRole;

    @ManyToOne
    public FinalWorks finalWorks;

    @ManyToOne
    public Employees employees;

    @OneToMany(mappedBy = "statement",cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementFinalWorksParticipants> statementFinalWorksParticipants;

    public FinalWorksParticipants(String teachersRole, FinalWorks finalWorks, Employees employees) {
        this.teachersRole = teachersRole;
        this.finalWorks = finalWorks;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeachersRole() {
        return teachersRole;
    }

    public void setTeachersRole(String teachersRole) {
        this.teachersRole = teachersRole;
    }

    public FinalWorks getFinalWorks() {
        return finalWorks;
    }

    public void setFinalWorks(FinalWorks finalWorks) {
        this.finalWorks = finalWorks;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public List<StatementFinalWorksParticipants> getStatementFinalWorksParticipants() {
        return statementFinalWorksParticipants;
    }

    public void setStatementFinalWorksParticipants(List<StatementFinalWorksParticipants> statementFinalWorksParticipants) {
        this.statementFinalWorksParticipants = statementFinalWorksParticipants;
    }

    public static FinalWorksParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<FinalWorksParticipants> subjectSets = FinalWorksParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(FinalWorksParticipants set: subjectSets) {
            options.put(set.id.toString(), set.teachersRole.toString());
        }
        return options;
    }

    public static List<FinalWorksParticipants> search() {
        return FinalWorksParticipants.find.all();
    }
}
