package models.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 28.03.2017.
 */
public class AccessRoles {
    public static List<String> accessRolesList() {
        List<String> all = new ArrayList<String>();
        all.add("Zaměstnanec");
        all.add("Vedoucí organizační jednotky");
        all.add("Zástupce vedoucího organizační jednotky");
        all.add("Reditel");
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
