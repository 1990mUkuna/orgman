package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the UserFactory class
         * 3. Assert that the an object is created.
         */

        String email="mukuna.freeman@gmail.com";
        String fname ="Kgori";
        String lname="Bogosi";

        User user = UserFactory.buildUser(email,fname,lname);
        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(email,user.getUserEmail());
    }
}