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
public class StatementVisitsParticipants extends Model {

    public static Finder<Long, StatementVisitsParticipants> find = new Finder<Long, StatementVisitsParticipants>(
            StatementVisitsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date date;

    public String state;

    public String note;

    @ManyToOne
    public Visits visits;

    @ManyToOne
    public Statement statement;

    public StatementVisitsParticipants(Visits visits, Statement statement) {
        this.visits = visits;
        this.statement = statement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Visits getVisits() {
        return visits;
    }

    public void setVisits(Visits visits) {
        this.visits = visits;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public static StatementVisitsParticipants findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<StatementVisitsParticipants> subjectSets = StatementVisitsParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (StatementVisitsParticipants set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<StatementVisitsParticipants> search() {
        return StatementVisitsParticipants.find.all();
    }
}
