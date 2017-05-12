package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FieldsOfStudy extends Model {

    /**
     * Obory
     **/
    public static Finder<Long, FieldsOfStudy> find = new Finder<Long, FieldsOfStudy>(
            FieldsOfStudy.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<StudyPlans> studyPlans;

    public String fieldOfStudy;

    public String fieldOfStudyV;

    public String study;

    public String fieldsOfStudyLanguage;

    public String formOfTeaching;

    public boolean active;

    public FieldsOfStudy(String fieldOfStudy, String fieldOfStudyV, String study, String fieldsOfStudyLanguage, String formOfTeaching) {
        this.fieldOfStudy = fieldOfStudy;
        this.fieldOfStudyV = fieldOfStudyV;
        this.study = study;
        this.fieldsOfStudyLanguage = fieldsOfStudyLanguage;
        this.formOfTeaching = formOfTeaching;
        this.active=true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<StudyPlans> getStudyPlans() {
        return studyPlans;
    }

    public void setStudyPlans(List<StudyPlans> studyPlans) {
        this.studyPlans = studyPlans;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudyV() {
        return fieldOfStudyV;
    }

    public void setFieldOfStudyV(String fieldOfStudyV) {
        this.fieldOfStudyV = fieldOfStudyV;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getFieldsOfStudyLanguage() {
        return fieldsOfStudyLanguage;
    }

    public void setFieldsOfStudyLanguage(String fieldsOfStudyLanguage) {
        this.fieldsOfStudyLanguage = fieldsOfStudyLanguage;
    }

    public String getFormOfTeaching() {
        return formOfTeaching;
    }

    public void setFormOfTeaching(String formOfTeaching) {
        this.formOfTeaching = formOfTeaching;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static Map<String, String> options() {
        List<FieldsOfStudy> fieldsOfStudiesSet = FieldsOfStudy.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (FieldsOfStudy set : fieldsOfStudiesSet) {
            if (set.isActive()) {
                options.put(set.id.toString(), set.fieldOfStudy.toString());
            }
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


    public static List<FieldsOfStudy> search() {
        return FieldsOfStudy.find.all();
    }

    public static FieldsOfStudy findById(long id) {
        return find.where().eq("id", id).findUnique();
    }
}