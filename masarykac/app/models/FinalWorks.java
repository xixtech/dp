package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FinalWorks extends Model {

    public static Finder<Long, FinalWorks> find = new Finder<Long, FinalWorks>(
            FinalWorks.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Název práce je povinný")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 2, message = "Název práce musí mít alespoň 2 znaky")
    public String finalWorksName;

    @Constraints.Required(message = "Jména jsou povinná")
    @Formats.NonEmpty
    @Constraints.MinLength(value = 2, message = "Jména musejí mít alespoň 2 znaky")
    public String names;

    @Formats.DateTime(pattern = "yyyy")
    public Date year;

    @ManyToOne
    public Semesters semester;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<FinalWorksParticipants> finalWorksToEmployees;

    public boolean active;

    public FinalWorks(String finalWorksName, String names, Date year, Semesters semester) {
        this.finalWorksName = finalWorksName;
        this.names = names;
        this.year = year;
        this.semester = semester;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFinalWorksName() {
        return finalWorksName;
    }

    public void setFinalWorksName(String finalWorksName) {
        this.finalWorksName = finalWorksName;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public List<FinalWorksParticipants> getFinalWorksToEmployees() {
        return finalWorksToEmployees;
    }

    public void setFinalWorksToEmployees(List<FinalWorksParticipants> finalWorksToEmployees) {
        this.finalWorksToEmployees = finalWorksToEmployees;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static FinalWorks findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<FinalWorks> subjectSets = FinalWorks.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (FinalWorks set : subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.finalWorksName.toString());
            }
        }
        return options;
    }

    public static List<FinalWorks> search() {
        return FinalWorks.find.all();
    }
}
