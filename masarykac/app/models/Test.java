package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Test extends Model {

    public static Finder<Long, Test> find = new Finder<Long, Test>(
            Test.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;

    public String value;

    public List<Information> informations;

    public Test(String name, String value, Information... informations) {
        this.name = name;
        this.value = value;
        for(Information information: informations) {
            this.informations.add(information);
        }
    }

    public Test(String name, String value) {
        this.name = name;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Test findById(long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static Map<String,String> options() {
        List<Test> subjectSets = Test.find.all();
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Test set: subjectSets) {
            options.put(set.id.toString(), set.name.toString());
        }
        return options;
    }

    public static List<Test> search() {
        return Test.find.all();
    }
    public static class Information {


        public String label;


        public String email;


        public List<Phone> phones;

        public Information() {}

        public Information(String label, String email, String... phones) {
            this.label = label;
            this.email = email;
            this.phones = new ArrayList<Phone>();
            for(String phone: phones) {
                this.phones.add(new Phone(phone));
            }
        }

        public static class Phone {


            public String number;

            public Phone() {}

            public Phone(String number) {
                this.number = number;
            }

        }

    }
}