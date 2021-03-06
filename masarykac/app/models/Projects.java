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
public class Projects extends Model {

    public static Finder<Long, Projects> find = new Finder<Long, Projects>(
            Projects.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String projectName;

    @Formats.DateTime(pattern = "dd.mm.yyyy")
    public Date projectFrom;

    @Formats.DateTime(pattern = "dd.mm.yyyy")
    public Date projectTo;

    @ManyToOne
    public Semesters semester;

    public boolean hasGrant;

    public String grantValue;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ProjectsParticipants> projectsParticipants;

    public boolean active;

    public Projects(String projectName, Date projectFrom, Date projectTo, Semesters semester, boolean hasGrant, String grantValue) {
        this.projectName = projectName;
        this.projectFrom = projectFrom;
        this.projectTo = projectTo;
        this.semester = semester;
        this.hasGrant = hasGrant;
        this.grantValue = grantValue;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectFrom() {
        return projectFrom;
    }

    public void setProjectFrom(Date projectFrom) {
        this.projectFrom = projectFrom;
    }

    public Date getProjectTo() {
        return projectTo;
    }

    public void setProjectTo(Date projectTo) {
        this.projectTo = projectTo;
    }

    public Semesters getSemester() {
        return semester;
    }

    public void setSemester(Semesters semester) {
        this.semester = semester;
    }

    public boolean isHasGrant() {
        return hasGrant;
    }

    public void setHasGrant(boolean hasGrant) {
        this.hasGrant = hasGrant;
    }

    public String getGrantValue() {
        return grantValue;
    }

    public void setGrantValue(String grantValue) {
        this.grantValue = grantValue;
    }

    public List<ProjectsParticipants> getProjectsParticipants() {
        return projectsParticipants;
    }

    public void setProjectsParticipants(List<ProjectsParticipants> projectsParticipants) {
        this.projectsParticipants = projectsParticipants;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static Projects findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<Projects> subjectSets = Projects.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (Projects set : subjectSets) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.projectName.toString());
            }
        }
        return options;
    }

    public static List<Projects> search() {
        return Projects.find.all();
    }
}
