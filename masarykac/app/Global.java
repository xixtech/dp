import models.Person;
import models.Profile;
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

                Profile profile= new Profile("Jan", "Novák", "123456789", user );
                profile.save();
                Person person = new Person(20000, "Admin", user);
                person.save();
                user.setPerson(person);
                user.setProfile(profile);
                user.update();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
