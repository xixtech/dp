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
public class Groups extends Model {

    public static Finder<Long, Groups> find = new Finder<Long, Groups>(
            Groups.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String group;

    public String groupP;

    public String groupV;

    public String note;

    public Groups(String group, String groupP, String groupV, String note) {
        this.group = group;
        this.groupP = groupP;
        this.groupV = groupV;
        this.note = note;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroupP() {
        return groupP;
    }

    public void setGroupP(String groupP) {
        this.groupP = groupP;
    }

    public String getGroupV() {
        return groupV;
    }

    public void setGroupV(String groupV) {
        this.groupV = groupV;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}