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
public class StatementFinalWorksParticipants extends Model {

    public static Finder<Long, StatementFinalWorksParticipants> find = new Finder<Long, StatementFinalWorksParticipants>(
            StatementFinalWorksParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date date;

    public String state;

    public String note;

    @ManyToOne
    public Semesters semester;

    @ManyToOne
    public FinalWorksParticipants finalWorksParticipants;

    @ManyToOne
    public Statement statement;

    public StatementFinalWorksParticipants(Date date, String state, Semesters semester, FinalWorksParticipants finalWorksParticipants, Statement statement) {
        this.date = date;
        this.state = state;
        this.semester = semester;
        this.finalWorksParticipants = finalWorksParticipants;
        this.statement = statement;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
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

    public FinalWorksParticipants getFinalWorksParticipants() {
        return finalWorksParticipants;
    }

    public void setFinalWorksParticipants(FinalWorksParticipants finalWorksParticipants) {
        this.finalWorksParticipants = finalWorksParticipants;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public static StatementFinalWorksParticipants findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<StatementFinalWorksParticipants> subjectSets = StatementFinalWorksParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (StatementFinalWorksParticipants set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<StatementFinalWorksParticipants> search() {
        return StatementFinalWorksParticipants.find.all();
    }
}
