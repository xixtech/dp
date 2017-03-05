
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.management.relation.Role;

import models.Member;
import models.utils.Hash;
import models.Person;
import models.Profile;
import models.Roles;

/**
 * This class is a Guice module that tells Guice how to bind several
 * different types. This Guice module is created when the Play
 * application starts.
 * <p>
 * Play will automatically use any class called `Module` that is in
 * the root package. You can create modules in other locations by
 * adding `play.modules.enabled` settings to the `application.conf`
 * configuration file.
 */
@Singleton
public class OnStartup {

    @Inject
    public OnStartup(Member member1) {
        if (member1.find.findRowCount() == 0) {

            try {
                Roles roles=new Roles("Lektor");
                roles.save();

                Roles rolesAsistent=new Roles("Asistent");
                rolesAsistent.save();

                Member member = new Member("a@a.cz", Hash.createPassword("secret"));
                member.setActive(true);
                member.save();

                Profile profile= new Profile("Jan", "Novák", "123456789", member);
                profile.save();
                Person person = new Person(20000, "Lektor", member, roles.roleName);
                person.save();
                member.setPerson(person);
                member.setProfile(profile);
                member.update();
                KPIStart kpi=new KPIStart();
                kpi.insertKPIStart();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}