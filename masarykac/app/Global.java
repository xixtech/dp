import models.User;
import models.utils.Hash;
import play.Application;
import play.GlobalSettings;

/**
 * Created by Martin on 02.02.2017.
 */
public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        if (User.find.findRowCount() == 0) {

            try {
                User user = new User("a@a.cz", Hash.createPassword("secret"));
                user.setActive(true);
                user.save();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
