package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    private String testRole;

    @Before
    public void setUp(){
        this.testRole="Developer";
    }
    @Test
    public void buildRole() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RoleFactory class
         * 4. Assert that the id is generated.
         */
        Role role = RoleFactory.buildRole(testRole);
        System.out.println(role);
        Assert.assertNotNull(role.getRoleId());
        Assert.assertEquals(testRole,role.getRoleName());
    }
}