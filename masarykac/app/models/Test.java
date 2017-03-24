package models;

import com.avaje.ebean.Model;
import com.newrelic.agent.deps.org.json.simple.JSONObject;
import jdk.nashorn.internal.objects.NativeObject;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.validation.Valid;
import java.util.*;

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

    public static String[] getJS1Key() {

        String[] arr1 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v="";
        while(entriesIterator.hasNext()){
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr1[i] = mapping.getKey().toString()+";";
            v=mapping.getKey().toString();
            i++;
        }
        arr1[arr1.length-1]=v;
        return arr1;
    }
    public static String[] getJS1Value() {

        String[] arr2 = new String[options().size()];

        Set entries = options().entrySet();
        Iterator entriesIterator = entries.iterator();

        int i = 0;
        String v="";
        while(entriesIterator.hasNext()){
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr2[i] = mapping.getValue().toString()+";";
            v=mapping.getValue().toString();
            i++;
        }

        arr2[arr2.length-1]=v;
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

    public static List<Test> search() {
        return Test.find.all();
    }

}