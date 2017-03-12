package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class FieldsOfStudy extends Model {

    public static Finder<Long, FieldsOfStudy> find = new Finder<Long, FieldsOfStudy>(
            FieldsOfStudy.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String fieldOfStudy;

    public String fieldOfStudyV;

    public String study;

    public String language;

    public String formOfTeaching;

    public FieldsOfStudy(String fieldOfStudy, String fieldOfStudyV, String study, String language, String formOfTeaching) {
        this.fieldOfStudy = fieldOfStudy;
        this.fieldOfStudyV = fieldOfStudyV;
        this.study = study;
        this.language = language;
        this.formOfTeaching = formOfTeaching;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFormOfTeaching() {
        return formOfTeaching;
    }

    public void setFormOfTeaching(String formOfTeaching) {
        this.formOfTeaching = formOfTeaching;
    }
}