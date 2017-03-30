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
public class Publications extends Model {

    public static Finder<Long, Publications> find = new Finder<Long, Publications>(
            Publications.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String yearOfPublication;

    @ManyToOne
    public Semesters semester;

    public String type;

    public String citation;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<PublicationsParticipants> publicationsParticipants;

    public Publications(String yearOfPublication, Semesters semester, String type, String citation) {
        this.yearOfPublication = yearOfPublication;
        this.semester = semester;
        this.type = type;
        this.citation = citation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public List<PublicationsParticipants> getPublicationsParticipants() {
        return publicationsParticipants;
    }

    public void setPublicationsParticipants(List<PublicationsParticipants> publicationsParticipants) {
        this.publicationsParticipants = publicationsParticipants;
    }

    public static Publications findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Publications> subjectSets = Publications.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Publications set: subjectSets) {
            options.put(set.id.toString(), set.citation.toString());
        }
        return options;
    }

    public static List<Publications> search() {
        return Publications.find.all();
    }
}
