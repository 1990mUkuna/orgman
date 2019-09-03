package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserRoleFactory class
         * 4. Assert that the an object is created.
         */

        User user = UserFactory.buildUser("mukuna.freeman@gmail.com","Mukuna","Junior");
        Role role = RoleFactory.buildRole("CEO");
        Organisation organisation= OrganisationFactory.buildOrganisation("Payment24");

        UserRole userRole = UserRoleFactory.buildUserRole(organisation.getOrgCode(),user.getUserEmail(),role.getRoleId());
        System.out.println(userRole);
        Assert.assertNotNull(userRole);
        Assert.assertEquals(user.getUserEmail(),userRole.getUserEmail());
    }
}