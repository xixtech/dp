package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class StudyGroups extends Model {

    public static Finder<Long, StudyGroups> find = new Finder<Long, StudyGroups>(
            StudyGroups.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    public String studyGroupP;

    public String getStudyGroupV;

    public String studyGroupsNote;


}