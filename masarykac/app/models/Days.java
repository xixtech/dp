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
public class Days extends Model {

    public static Finder<Long, Days> find = new Finder<Long, Days>(
            Days.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public int dayP;

    public String day;

    public String dayV;

    @OneToMany(mappedBy="days",cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<ScheduleInWeeks> scheduleInWeeks;

    public Days(int dayP, String day, String dayV) {
        this.dayP = dayP;
        this.day = day;
        this.dayV = dayV;
    }

    public int getDayP() {
        return dayP;
    }

    public void setDayP(int dayP) {
        this.dayP = dayP;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDayV() {
        return dayV;
    }

    public void setDayV(String dayV) {
        this.dayV = dayV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ScheduleInWeeks> getScheduleInWeeks() {
        return scheduleInWeeks;
    }

    public void setScheduleInWeeks(List<ScheduleInWeeks> scheduleInWeeks) {
        this.scheduleInWeeks = scheduleInWeeks;
    }

    public static List<Days> search() {
        return Days.find.all();
    }

    public static Days findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String,String> options() {
        List<Days> subjectSets = Days.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Days set: subjectSets) {
            options.put(set.id.toString(), set.day.toString());
        }
        return options;
    }

    public static Map<String,String> optionsDay() {
        List<Days> subjectSets = Days.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Days set: subjectSets) {
            options.put(set.day.toString(), set.day.toString());
        }
        return options;
    }
}