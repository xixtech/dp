package models.utils;

import models.Member;

/**
 * Created by Martin on 28.03.2017.
 */
public class Check {
    public static boolean isEmployee(final Member m) {
        if (m.employees != null) {
            return true;
        }
        return false;
    }

    public static boolean isNormalEmployee(final Member m) {
        if (isEmployee(m)) {
            if (m.getEmployees().getAccessRole().equals("employee")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isHeadOfOU(final Member m) {
        if (isEmployee(m)) {
            if (m.getEmployees().getAccessRole().equals("headOfOU")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isDeputyHeadOfOU(final Member m) {
        if (isEmployee(m)) {
            if (m.getEmployees().getAccessRole().equals("deputyHeadOfOU")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isDirector(final Member m) {
        if (isEmployee(m)) {
            if (m.getEmployees().getAccessRole().equals("director")) {
                return true;
            }
            return false;
        }
        return false;
    }

}
