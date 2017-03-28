package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Employees extends Model {

    public static Finder<Long, Employees> find = new Finder<Long, Employees>(
            Employees.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public int personalNumber;

    public String titleBefore;

    public String surname;

    public String firstName;

    public String titleAfter;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Teachers> teachers;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<FinalWorksParticipants> finalWorksToEmployees;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Visits> visits;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ProjectsParticipants> projectsParticipants;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<PublicationsParticipants> publicationsParticipants;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ComitteeToEmployess> comitteeToEmployess;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<OrganizationalUnitsParticipants> organizationalUnitsParticipantses;

    public Employees(int personalNumber, String titleBefore, String surname, String firstName, String titleAfter) {
        this.personalNumber = personalNumber;
        this.titleBefore = titleBefore;
        this.surname = surname;
        this.firstName = firstName;
        this.titleAfter = titleAfter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getTitleBefore() {
        return titleBefore;
    }

    public void setTitleBefore(String titleBefore) {
        this.titleBefore = titleBefore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitleAfter() {
        return titleAfter;
    }

    public void setTitleAfter(String titleAfter) {
        this.titleAfter = titleAfter;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public List<FinalWorksParticipants> getFinalWorksToEmployees() {
        return finalWorksToEmployees;
    }

    public void setFinalWorksToEmployees(List<FinalWorksParticipants> finalWorksToEmployees) {
        this.finalWorksToEmployees = finalWorksToEmployees;
    }

    public List<Visits> getVisits() {
        return visits;
    }

    public void setVisits(List<Visits> visits) {
        this.visits = visits;
    }

    public List<ProjectsParticipants> getProjectsParticipants() {
        return projectsParticipants;
    }

    public void setProjectsParticipants(List<ProjectsParticipants> projectsParticipants) {
        this.projectsParticipants = projectsParticipants;
    }

    public List<PublicationsParticipants> getPublicationsParticipants() {
        return publicationsParticipants;
    }

    public void setPublicationsParticipants(List<PublicationsParticipants> publicationsParticipants) {
        this.publicationsParticipants = publicationsParticipants;
    }

    public List<ComitteeToEmployess> getComitteeToEmployess() {
        return comitteeToEmployess;
    }

    public void setComitteeToEmployess(List<ComitteeToEmployess> comitteeToEmployess) {
        this.comitteeToEmployess = comitteeToEmployess;
    }

    public List<OrganizationalUnitsParticipants> getOrganizationalUnitsParticipantses() {
        return organizationalUnitsParticipantses;
    }

    public void setOrganizationalUnitsParticipantses(List<OrganizationalUnitsParticipants> organizationalUnitsParticipantses) {
        this.organizationalUnitsParticipantses = organizationalUnitsParticipantses;
    }

    public static Employees findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<Employees> search() {
        return Employees.find.all();
    }

    public static Map<String,String> options() {
        List<Employees> subjectSets = Employees.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Employees set: subjectSets) {
            options.put(set.id.toString(),  set.getSurname().toString()+" "+set.getFirstName().toString());
        }
        return options;
    }

    public static String[] getJS1Key() {

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

    public static String[] getJS1Value() {

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

    public static String[][] getJS() {



        final String[][] result = new String[options().size()][2];

        final Iterator<?> iter = options().entrySet().iterator();

        int ii = 0;
        while(iter.hasNext()){
            final Map.Entry<?, ?> mapping = (Map.Entry<?, ?>) iter.next();

            result[ii][0] = mapping.getKey()+" ";
            result[ii][1] = mapping.getValue()+"; ";

            ii++;
        }
        return result;
    }
}
