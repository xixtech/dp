package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.*;

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
    @Column(length=10485760)
    public String studyGroup;
    @Column(length=10485760)
    public int studyGroupP;
    @Column(length=10485760)
    public String studyGroupV;
    @Column(length=10485760)
    public String studyGroupsNote;

    public StudyGroups(String studyGroup, int studyGroupP, String studyGroupV, String studyGroupsNote) {
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

    public static Map<String, String> options() {
        List<StudyGroups> studyGroupsSet = StudyGroups.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (StudyGroups set : studyGroupsSet) {
            options.put(set.id.toString(), set.studyGroup.toString());
        }
        return options;
    }

    public static String[] getKey() {

        String[] arr1 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v = "";
        while (entriesIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr1[i] = mapping.getKey().toString() + ";";
            v = mapping.getKey().toString();
            i++;
        }
        if (arr1.length > 0) {
            arr1[arr1.length - 1] = v;
        }
        return arr1;
    }

    public static String[] getValue() {

        String[] arr2 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v = "";
        while (entriesIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr2[i] = mapping.getValue().toString() + ";";
            v = mapping.getValue().toString();
            i++;
        }
        if (arr2.length > 0) {
            arr2[arr2.length - 1] = v;
        }
        return arr2;
    }

    public static StudyGroups findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static StudyGroups findByStudyGroup(String studyGroup) {
        return find.where().eq("studyGroup",studyGroup).findUnique();
    }

    public static List<StudyGroups> search() {
        return StudyGroups.find.where().orderBy("studyGroupP asc").findList();
    }
}