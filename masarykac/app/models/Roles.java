package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 03.02.2017.
 */
public class Roles {
    /**
     * List rolí pracovníků
     *
     * @return
     */
    public static List<String> rolesList() {
        List<String> all = new ArrayList<String>();
        all.add("Admin");
        all.add("Kontrolní pracovník");
        all.add("Servisní pracovník");
        return all;
    }

    /**
     * List rolí v systému
     *
     * @return
     */
    public static List<String> accessRoles() {
        List<String> all = new ArrayList<String>();
        all.add("Zákazník");
        all.add("Pracovník");
        return all;
    }
}
