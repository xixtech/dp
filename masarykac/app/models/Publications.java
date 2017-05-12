package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

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

    @Constraints.Required(message = "Vyplňte rok")
    @Formats.NonEmpty
    public String yearOfPublication;

    @ManyToOne
    public Semesters semester;

    @Constraints.Required(message = "Vyplňte typ publikace")
    @Formats.NonEmpty
    @Constraints.MinLength(message = "Zadejte alespoň 2 znaky", value = 2)
    public String type;

    @Constraints.Required(message = "Vyplňte citaci")
    @Formats.NonEmpty
    @Constraints.MinLength(message = "Zadejte alespoň 2 znaky", value = 2)
    public String citation;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<PublicationsParticipants> publicationsParticipants;

    public boolean active;

    public Publications(String yearOfPublication, Semesters semester, String type, String citation) {
        this.yearOfPublication = yearOfPublication;
        this.semester = semester;
        this.type = type;
        this.citation = citation;
        this.active=true;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static Publications findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Publications> subjectSets = Publications.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Publications set: subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.citation.toString());
            }
        }
        return options;
    }

    public static List<Publications> search() {
        return Publications.find.all();
    }
}
