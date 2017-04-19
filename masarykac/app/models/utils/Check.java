package models.utils;

import models.Member;

/**
 * Created by Martin on 28.03.2017.
 */
public class Check {
    public static boolean isEmployee(final Member m) {
        if (m.employees!= null) {
            return true;
        }
        return false;
    }

    public static boolean isNormalEmployee(final Member m) {
        if (isEmployee(m)) {
            if (m.employees.accessRole.equals("employee")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isHeadOfOU(final Member m) {
        if (isEmployee(m)) {
            if (m.employees.accessRole.equals("Vedoucí organizační jednotky")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isDeputyHeadOfOU(final Member m) {
        if (isEmployee(m)) {
            if (m.employees.accessRole.equals("Zástupce vedoucího organizační jednotky")) {
                return true;
            }
            return false;
        }
        return false;
    }
    public static boolean isDirector(final Member m) {
        if (isEmployee(m)) {
            if (m.employees.accessRole.equals("Reditel")) {
                return true;
            }
            return false;
        }
        return false;
    }

}
