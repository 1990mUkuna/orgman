package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
        Gender gender= GenderFactory.buildGender("Lesbian");
        Race race= RaceFactory.buildRace("Albinos");
        User user = UserFactory.buildUser("testAlbinos@gmail.com","Rachel","Nga");

        UserDemography userDemography=UserDemographyFactory.buildUserDemography(user.getUserEmail(),"Front-end Developer",gender.getGenderId(),race.getRaceId(),new Date(1989 ,10, 2));
        System.out.println(userDemography);
        Assert.assertNotNull(userDemography);
        Assert.assertEquals("Front-end Developer",userDemography.getUserTitle());
    }
}