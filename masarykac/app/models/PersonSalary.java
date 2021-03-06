package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
@Entity
public class PersonSalary extends Model {

    public static Finder<Long, PersonSalary> find = new Finder<Long, PersonSalary>(
            PersonSalary.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public double obligation;

    public double basicSalary;

    public double personalEvaluation;

    public double personalEvaluationPct;

    public double evaluationParticipation;

    public String valueCurrent;

    public String valuePrevious;


    public List<String> valuesKPICurrent;
    public List<String> valuesKPIPrevious;

    public PersonSalary(double obligation, double basicSalary, double personalEvaluation, double personalEvaluationPct, double evaluationParticipation) {
        this.obligation = obligation;
        this.basicSalary = basicSalary;
        this.personalEvaluation = personalEvaluation;
        this.personalEvaluationPct = personalEvaluationPct;
        this.evaluationParticipation = evaluationParticipation;
    }


    public String getValueCurrent() {
        return valueCurrent;
    }

    public void setValueCurrent(String valueCurrent) {
        this.valueCurrent = valueCurrent;
    }

    public String getValuePrevious() {
        return valuePrevious;
    }

    public void setValuePrevious(String valuePrevious) {
        this.valuePrevious = valuePrevious;
    }

    public List<String> getValuesKPICurrent() {
        return valuesKPICurrent;
    }

    public void setValuesKPICurrent(List<String> valuesKPICurrent) {
        this.valuesKPICurrent = valuesKPICurrent;
    }

    public List<String> getValuesKPIPrevious() {
        return valuesKPIPrevious;
    }

    public void setValuesKPIPrevious(List<String> valuesKPIPrevious) {
        this.valuesKPIPrevious = valuesKPIPrevious;
    }

    public double getObligation() {
        return obligation;
    }

    public void setObligation(double obligation) {
        this.obligation = obligation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getPersonalEvaluation() {
        return personalEvaluation;
    }

    public void setPersonalEvaluation(double personalEvaluation) {
        this.personalEvaluation = personalEvaluation;
    }

    public double getPersonalEvaluationPct() {
        return personalEvaluationPct;
    }

    public void setPersonalEvaluationPct(double personalEvaluationPct) {
        this.personalEvaluationPct = personalEvaluationPct;
    }

    public double getEvaluationParticipation() {
        return evaluationParticipation;
    }

    public void setEvaluationParticipation(double evaluationParticipation) {
        this.evaluationParticipation = evaluationParticipation;
    }

    public static List<PersonSalary> search() {
        return find.where().findList();
    }

    public static List<PersonSalary> personDetail(long id) {
        return find.where().eq("id", id).findList();
    }

    public static List<PersonSalary> persons() {
        return find.where().findList();
    }

}
