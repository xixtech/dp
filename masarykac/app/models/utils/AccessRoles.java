package models.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 28.03.2017.
 */
public class AccessRoles {
    public static List<String> accessRolesList() {
        List<String> all = new ArrayList<String>();
        all.add("employee");
        all.add("headOfOU");
        all.add("deputyHeadOfOU");
        all.add("director");
        return all;
    }

    /**
     * List rolí v systému
     *
     * @return
     */
    public static List<String> role() {
        List<String> all = new ArrayList<String>();
        all.add("Student");
        all.add("Zaměstnanec");
        return all;
    }
}
