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

public class Classroom extends Model {

    public static Finder<Long, Classroom> find = new Finder<Long, Classroom>(
            Classroom.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date dateOfCommittee;

    @ManyToOne
    public Semesters semester;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<CommitteeParticipants> committeeToEmployes;

    public Classroom(Date dateOfCommittee, Semesters semester) {
        this.dateOfCommittee = dateOfCommittee;
        this.semester = semester;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfCommittee() {
        return dateOfCommittee;
    }

    public void setDateOfCommittee(Date dateOfCommittee) {
        this.dateOfCommittee = dateOfCommittee;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public List<CommitteeParticipants> getCommitteeToEmployes() {
        return committeeToEmployes;
    }

    public void setCommitteeToEmployes(List<CommitteeParticipants> committeeToEmployes) {
        this.committeeToEmployes = committeeToEmployes;
    }

    public static Classroom findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Classroom> subjectSets = Classroom.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Classroom set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<Classroom> search() {
        return Classroom.find.all();
    }
}
