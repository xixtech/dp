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
public class StudyGroups1 extends Model {

    public static Finder<Long, StudyGroups1> find = new Finder<Long, StudyGroups1>(
            StudyGroups1.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    public String studyGroup;

    public int studyGroupP;

    public String studyGroupV;

    public String studyGroupsNote;

    public StudyGroups1(String studyGroup, int studyGroupP, String studyGroupV, String studyGroupsNote) {
        this.studyGroup = studyGroup;
        this.studyGroupP = studyGroupP;
        this.studyGroupV = studyGroupV;
        this.studyGroupsNote = studyGroupsNote;
    }

    public List<StudyPlans> getStudyPlans() {
        return studyPlans;
    }

    public void setStudyPlans(List<StudyPlans> studyPlans) {
        this.studyPlans = studyPlans;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    public int getStudyGroupP() {
        return studyGroupP;
    }

    public void setStudyGroupP(int studyGroupP) {
        this.studyGroupP = studyGroupP;
    }

    public String getStudyGroupV() {
        return studyGroupV;
    }

    public void setStudyGroupV(String studyGroupV) {
        this.studyGroupV = studyGroupV;
    }

    public String getStudyGroupsNote() {
        return studyGroupsNote;
    }

    public void setStudyGroupsNote(String studyGroupsNote) {
        this.studyGroupsNote = studyGroupsNote;
    }

    public static Map<String,String> options() {
        List<StudyGroups1> studyGroupsSet = StudyGroups1.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(StudyGroups1 set: studyGroupsSet) {
            options.put(set.id.toString(), set.studyGroup.toString());
        }
        return options;
    }

    public static StudyGroups1 findById(long id) {
        return find.where().eq("id",id).findUnique();
    }


}