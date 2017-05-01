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
    public Date dateOfCommittee;

    public String state;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementParticipants> statementParticipants;

    public Statement(Date dateOfCommittee, String state) {
        this.dateOfCommittee = dateOfCommittee;
        this.state = state;
    }

    public Date getDateOfCommittee() {
        return dateOfCommittee;
    }

    public void setDateOfCommittee(Date dateOfCommittee) {
        this.dateOfCommittee = dateOfCommittee;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<StatementParticipants> getStatementParticipants() {
        return statementParticipants;
    }

    public void setStatementParticipants(List<StatementParticipants> statementParticipants) {
        this.statementParticipants = statementParticipants;
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
}
