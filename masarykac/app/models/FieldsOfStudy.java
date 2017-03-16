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
public class FieldsOfStudy extends Model {

    /** Obory **/
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

    public FieldsOfStudy(String fieldOfStudy, String fieldOfStudyV, String study, String fieldsOfStudyLanguage, String formOfTeaching) {
        this.fieldOfStudy = fieldOfStudy;
        this.fieldOfStudyV = fieldOfStudyV;
        this.study = study;
        this.fieldsOfStudyLanguage = fieldsOfStudyLanguage;
        this.formOfTeaching = formOfTeaching;
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

    public static Map<String,String> options() {
        List<FieldsOfStudy> fieldsOfStudiesSet = FieldsOfStudy.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(FieldsOfStudy set: fieldsOfStudiesSet) {
            options.put(set.id.toString(), set.fieldOfStudy.toString());
        }
        return options;
    }

    public static FieldsOfStudy findById(long id) {
        return find.where().eq("id",id).findUnique();
    }
}