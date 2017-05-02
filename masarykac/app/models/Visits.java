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
public class Visits extends Model {

    public static Finder<Long, Visits> find = new Finder<Long, Visits>(
            Visits.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String purposeOfVisit;

    public String country;

    public String event;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date visitFrom;
    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date visitTo;

    @ManyToOne
    public Semesters semester;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<VisitsParticipants> visitsParticipants;

    public Visits(String purposeOfVisit, String country, String event, Date visitFrom, Date visitTo, Semesters semester) {
        this.purposeOfVisit = purposeOfVisit;
        this.country = country;
        this.event = event;
        this.visitFrom = visitFrom;
        this.visitTo = visitTo;
        this.semester=semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getVisitFrom() {
        return visitFrom;
    }

    public void setVisitFrom(Date visitFrom) {
        this.visitFrom = visitFrom;
    }

    public Date getVisitTo() {
        return visitTo;
    }

    public void setVisitTo(Date visitTo) {
        this.visitTo = visitTo;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public List<VisitsParticipants> getVisitsParticipants() {
        return visitsParticipants;
    }

    public void setVisitsParticipants(List<VisitsParticipants> visitsParticipants) {
        this.visitsParticipants = visitsParticipants;
    }

    public static Visits findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Visits> subjectSets = Visits.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Visits set: subjectSets) {
            options.put(set.id.toString(), set.purposeOfVisit.toString());
        }
        return options;
    }

    public static Map<String,String> optionsCountries() {
        List<Visits> subjectSets = Visits.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Visits set: subjectSets) {
            options.put(set.id.toString(), set.purposeOfVisit.toString());
        }
        return options;
    }

    public static List<Visits> search() {
        return Visits.find.all();
    }
}
