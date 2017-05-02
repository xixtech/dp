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
public class StatementProjectsParticipants extends Model {

    public static Finder<Long, StatementProjectsParticipants> find = new Finder<Long, StatementProjectsParticipants>(
            StatementProjectsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date date;

    public String state;

    public String note;

    @ManyToOne
    public ProjectsParticipants projectsParticipants;

    @ManyToOne
    public Statement statement;

    public StatementProjectsParticipants(ProjectsParticipants projectsParticipants, Statement statement) {
        this.projectsParticipants = projectsParticipants;
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

    public ProjectsParticipants getProjectsParticipants() {
        return projectsParticipants;
    }

    public void setProjectsParticipants(ProjectsParticipants projectsParticipants) {
        this.projectsParticipants = projectsParticipants;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public static StatementProjectsParticipants findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<StatementProjectsParticipants> subjectSets = StatementProjectsParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (StatementProjectsParticipants set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<StatementProjectsParticipants> search() {
        return StatementProjectsParticipants.find.all();
    }
}
