package models.utils;

import org.mindrot.jbcrypt.BCrypt;

public class Hash {

    /**
     * vytváří hash hesla
     *
     * @param clearString
     * @return
     * @throws Exception
     */
    public static String createPassword(final String clearString) throws Exception {
        if (clearString == null) {
            throw new Exception("Nedefinováno heslo!");
        }
        return BCrypt.hashpw(clearString, BCrypt.gensalt());
    }

    /**
     * kontroluje, zda kandidátní heslo odpovídá již hashi hesla
     *
     * @param candidate
     * @param encryptedPassword
     * @return
     */
    public static boolean checkPassword(final String candidate,
                                        final String encryptedPassword) {
        if (candidate == null) {
            return false;
        }
        if (encryptedPassword == null) {
            return false;
        }
        return BCrypt.checkpw(candidate, encryptedPassword);
    }
}
