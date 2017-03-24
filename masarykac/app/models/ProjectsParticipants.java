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

    @ManyToOne
    public Employees employees;

    @ManyToOne
    public Projects projects;

    public static ProjectsParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<ProjectsParticipants> subjectSets = ProjectsParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(ProjectsParticipants set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<ProjectsParticipants> search() {
        return ProjectsParticipants.find.all();
    }
}
