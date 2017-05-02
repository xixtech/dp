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
public class StatementTeachersParticipants extends Model {

    public static Finder<Long, StatementTeachersParticipants> find = new Finder<Long, StatementTeachersParticipants>(
            StatementTeachersParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date date;

    public String state;

    public String note;

    @ManyToOne
    public Teachers teachers;

    @ManyToOne
    public Statement statement;

    public StatementTeachersParticipants(Teachers teachers, Statement statement) {
        this.teachers = teachers;
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

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public static StatementTeachersParticipants findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<StatementTeachersParticipants> subjectSets = StatementTeachersParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (StatementTeachersParticipants set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<StatementTeachersParticipants> search() {
        return StatementTeachersParticipants.find.all();
    }
}
