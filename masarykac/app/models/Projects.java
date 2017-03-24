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

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date projectFrom;

    @Formats.DateTime(pattern = "dd.MM.yyyy")
    public Date projectTo;

    public String semester;

    public boolean hasGrant;

    public String grantValue;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ProjectsParticipants> projectsParticipants;

    public static Projects findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<Projects> subjectSets = Projects.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Projects set: subjectSets) {
            options.put(set.id.toString(), set.projectName.toString());
        }
        return options;
    }

    public static List<Projects> search() {
        return Projects.find.all();
    }
}
