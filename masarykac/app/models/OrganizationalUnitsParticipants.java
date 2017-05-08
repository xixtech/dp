package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.avaje.ebean.Expr.eq;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class OrganizationalUnitsParticipants extends Model {

    public static Finder<Long, OrganizationalUnitsParticipants> find = new Finder<Long, OrganizationalUnitsParticipants>(
            OrganizationalUnitsParticipants.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Funkce je povinná")
    @Formats.NonEmpty
    public String function;

    @Constraints.Required(message = "Název funkce je povinný")
    @Formats.NonEmpty
    public String functionName;

    @ManyToOne
    public Employees employees;

    @ManyToOne
    public OrganizationalUnits organizationalUnits;

    public OrganizationalUnitsParticipants(String function, String functionName, Employees employees, OrganizationalUnits organizationalUnits) {
        this.function = function;
        this.functionName = functionName;
        this.employees = employees;
        this.organizationalUnits = organizationalUnits;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public OrganizationalUnits getOrganizationalUnits() {
        return organizationalUnits;
    }

    public void setOrganizationalUnits(OrganizationalUnits organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
    }

    public static List<OrganizationalUnitsParticipants>  findEmployeesID(Employees employees) {
        return find.where().eq("employees.id", employees.getId()).findList();
    }

    public static List<OrganizationalUnitsParticipants> findOUID(OrganizationalUnits organizationalUnits) {
        return find.where().eq("organizationalUnits.id", organizationalUnits.getId()).findList();
    }

    public static List<OrganizationalUnitsParticipants> findFunction(String function) {
        return find.where().eq("function", function).findList();
    }

    public static List<OrganizationalUnitsParticipants> search() {
        return OrganizationalUnitsParticipants.find.all();
    }

    public static Map<String, String> options() {
        List<OrganizationalUnitsParticipants> subjectSets = OrganizationalUnitsParticipants.find.all();
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
        for (OrganizationalUnitsParticipants set : subjectSets) {
            options.put(set.id.toString(), set.function.toString());
        }
        return options;
    }

    public static Map<String, String> optionsFunction() {
        LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();

        options.put("head", "Vedoucí oddělení");
        options.put("deputy", "Zástupce vedoucího");
        options.put("employee", "Zaměstnanec");

        return options;
    }
}