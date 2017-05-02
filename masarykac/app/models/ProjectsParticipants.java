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
public class ProjectsParticipants extends Model {

    public static Finder<Long, ProjectsParticipants> find = new Finder<Long, ProjectsParticipants>(
            ProjectsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String projectRole;

    @ManyToOne
    public Employees employees;

    @ManyToOne
    public Projects projects;

    @OneToMany(mappedBy = "projectsParticipants", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StatementProjectsParticipants> projectsParticipants;

    public ProjectsParticipants(Employees employees, Projects projects, String projectRole) {
        this.employees = employees;
        this.projects = projects;
        this.projectRole = projectRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public String getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    public List<StatementProjectsParticipants> getProjectsParticipants() {
        return projectsParticipants;
    }

    public void setProjectsParticipants(List<StatementProjectsParticipants> projectsParticipants) {
        this.projectsParticipants = projectsParticipants;
    }

    public static ProjectsParticipants findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String, String> options() {
        List<ProjectsParticipants> subjectSets = ProjectsParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (ProjectsParticipants set : subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<ProjectsParticipants> search() {
        return ProjectsParticipants.find.all();
    }
}
