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
public class PublicationsParticipants extends Model {

    public static Finder<Long, PublicationsParticipants> find = new Finder<Long, PublicationsParticipants>(
            PublicationsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String faculty;

    public String orderInPublication;

    public String department;

    public String share;

    @ManyToOne
    public Publications publications;

    @ManyToOne
    public Employees employees;

    public PublicationsParticipants(String faculty, String orderInPublication, String department, String share, Publications publications, Employees employees) {
        this.faculty = faculty;
        this.orderInPublication = orderInPublication;
        this.department = department;
        this.share = share;
        this.publications = publications;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getOrderInPublication() {
        return orderInPublication;
    }

    public void setOrderInPublication(String orderInPublication) {
        this.orderInPublication = orderInPublication;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public Publications getPublications() {
        return publications;
    }

    public void setPublications(Publications publications) {
        this.publications = publications;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public static PublicationsParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<PublicationsParticipants> subjectSets = PublicationsParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(PublicationsParticipants set: subjectSets) {
            options.put(set.id.toString(), set.faculty.toString());
        }
        return options;
    }

    public static List<PublicationsParticipants> search() {
        return PublicationsParticipants.find.all();
    }
}
