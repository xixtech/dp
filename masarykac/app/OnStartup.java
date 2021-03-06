
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.management.relation.Role;

import controllers.StartMethods;
import models.*;
import models.utils.Hash;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public OnStartup(Member member1) throws Exception {
        if (member1.find.findRowCount() == 0) {


            StartMethods sm = new StartMethods();
            sm.insertDaysStart();
            sm.insertClassroomStart();
            sm.insertTeachersRole();
            sm.insertAccessRole();
            Member member = new Member("a@a.cz", "password1", "test1");
            member.setActive(true);
            member.save();


            Employees em = new Employees(123456, "Bc.", "Černý", "Tomáš", "Ph.D.", AccessRole.findById(3));
            em.save();
            em.setMember(member);
            em.update();
            member.setEmployees(em);
            member.update();

            Member member2 = new Member("b@b.cz", "password2", "test2");
            member2.setActive(true);
            member2.save();

            Employees e = new Employees(456789, "Ing.", "Novák", "Karel", "Ph.D.", AccessRole.findById(1));
            e.save();
            e.setMember(member2);
            e.update();

            member2.setEmployees(e);
            member2.update();
            sm.insertOJ();
            sm.insertSemesters();
           // sm.insertEmployees();
            sm.insertFS();
            sm.insertSG();
           // sm.insertOJPart();
           // sm.insertSubjects();
           // sm.insertSP();
            //sm.insertCourses();
            //sm.insertTeachers();

            Roles roles = new Roles("Lektor");
            roles.save();

            Roles rolesAsistent = new Roles("Asistent");
            rolesAsistent.save();


            Profile profile = new Profile(e.getFirstName(), e.getSurname(), ""+e.getPersonalNumber(), member);
            profile.save();
            Person person = new Person(20000, "Lektor", member, roles.roleName);
            person.save();

            Profile profile1 = new Profile(em.getFirstName(), em.getSurname(), ""+em.getPersonalNumber(), member2);
            profile1.save();
            Person person1 = new Person(20000, "Lektor", member2, roles.roleName);
            person1.save();
            OrganizationalUnitsParticipants ou = new OrganizationalUnitsParticipants("employee", "zaměstnanec", e, OrganizationalUnits.findById(1));
            ou.save();

            OrganizationalUnitsParticipants ou1 = new OrganizationalUnitsParticipants("employee", "zaměstnanec", em, OrganizationalUnits.findById(1));
            ou1.save();
            member.setPerson(person);
            member.setProfile(profile);
            member.update();

            member2.setPerson(person1);
            member2.setProfile(profile1);
            member2.update();
            KPIStart kpi = new KPIStart();
            kpi.insertKPIStart();


        }
    }
}