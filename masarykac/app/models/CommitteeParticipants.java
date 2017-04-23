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
public class CommitteeParticipants extends Model {

    public static Finder<Long, CommitteeParticipants> find = new Finder<Long, CommitteeParticipants>(
            CommitteeParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String roleInCommittee;

    @ManyToOne
    public Committee committee;

    @ManyToOne
    public Employees employees;

    public CommitteeParticipants(String roleInCommittee, Committee committee, Employees employees) {
        this.roleInCommittee = roleInCommittee;
        this.committee = committee;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleInCommittee() {
        return roleInCommittee;
    }

    public void setRoleInCommittee(String roleInComittee) {
        this.roleInCommittee = roleInCommittee;
    }

    public Committee getCommittee() {
        return committee;
    }

    public void setCommittee(Committee committee) {
        this.committee = committee;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public static CommitteeParticipants findById(long id) {
        return find.where().eq("id",id).findUnique();
    }

    public static Map<String,String> options() {
        List<CommitteeParticipants> subjectSets = CommitteeParticipants.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(CommitteeParticipants set: subjectSets) {
            options.put(set.id.toString(), set.id.toString());
        }
        return options;
    }

    public static List<CommitteeParticipants> search() {
        return CommitteeParticipants.find.all();
    }
}
