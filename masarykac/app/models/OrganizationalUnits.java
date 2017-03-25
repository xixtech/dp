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
public class OrganizationalUnits extends Model {

    public static Finder<Long, OrganizationalUnits> find = new Finder<Long, OrganizationalUnits>(
            OrganizationalUnits.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String organizationalUnitNumber;

    public String organizationalUnitNumberParent;

    public String titleCzech;

    public String titleEnglish;

    public String functionNameOfSeniorEmployee;

    public String functionNameOfSeniorEmployeeAppointment;

    public Long organizationalUnitResponsible;

    @ManyToOne
    public Employees headOfOrganizationalUnit;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<OrganizationalUnitsParticipants> organizationalUnitsParticipantses;


    public OrganizationalUnits(String organizationalUnitNumber, String organizationalUnitNumberParent, String titleCzech, String titleEnglish, String functionNameOfSeniorEmployee, String functionNameOfSeniorEmployeeAppointment, Long organizationalUnitResponsible) {
        this.organizationalUnitNumber = organizationalUnitNumber;
        this.organizationalUnitNumberParent = organizationalUnitNumberParent;
        this.titleCzech = titleCzech;
        this.titleEnglish = titleEnglish;
        this.functionNameOfSeniorEmployee = functionNameOfSeniorEmployee;
        this.functionNameOfSeniorEmployeeAppointment = functionNameOfSeniorEmployeeAppointment;
        this.organizationalUnitResponsible = organizationalUnitResponsible;
    }

    public String getOrganizationalUnitNumber() {
        return organizationalUnitNumber;
    }

    public void setOrganizationalUnitNumber(String organizationalUnitNumber) {
        this.organizationalUnitNumber = organizationalUnitNumber;
    }

    public String getOrganizationalUnitNumberParent() {
        return organizationalUnitNumberParent;
    }

    public void setOrganizationalUnitNumberParent(String organizationalUnitNumberParent) {
        this.organizationalUnitNumberParent = organizationalUnitNumberParent;
    }

    public String getTitleCzech() {
        return titleCzech;
    }

    public void setTitleCzech(String titleCzech) {
        this.titleCzech = titleCzech;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getFunctionNameOfSeniorEmployee() {
        return functionNameOfSeniorEmployee;
    }

    public void setFunctionNameOfSeniorEmployee(String functionNameOfSeniorEmployee) {
        this.functionNameOfSeniorEmployee = functionNameOfSeniorEmployee;
    }

    public String getFunctionNameOfSeniorEmployeeAppointment() {
        return functionNameOfSeniorEmployeeAppointment;
    }

    public void setFunctionNameOfSeniorEmployeeAppointment(String functionNameOfSeniorEmployeeAppointment) {
        this.functionNameOfSeniorEmployeeAppointment = functionNameOfSeniorEmployeeAppointment;
    }

    public Long getOrganizationalUnitResponsible() {
        return organizationalUnitResponsible;
    }

    public void setOrganizationalUnitResponsible(Long organizationalUnitResponsible) {
        this.organizationalUnitResponsible = organizationalUnitResponsible;
    }

    public Employees getHeadOfOrganizationalUnit() {
        return headOfOrganizationalUnit;
    }

    public void setHeadOfOrganizationalUnit(Employees headOfOrganizationalUnit) {
        this.headOfOrganizationalUnit = headOfOrganizationalUnit;
    }

    public List<OrganizationalUnitsParticipants> getOrganizationalUnitsParticipantses() {
        return organizationalUnitsParticipantses;
    }

    public void setOrganizationalUnitsParticipantses(List<OrganizationalUnitsParticipants> organizationalUnitsParticipantses) {
        this.organizationalUnitsParticipantses = organizationalUnitsParticipantses;
    }

    public static List<OrganizationalUnits> search() {
        return OrganizationalUnits.find.all();
    }

    public static Map<String, String> options() {
        List<OrganizationalUnits> subjectSets = OrganizationalUnits.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (OrganizationalUnits set : subjectSets) {
            options.put(set.id.toString(), set.organizationalUnitNumber.toString());
        }
        return options;
    }
}