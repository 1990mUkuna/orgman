package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private String testRace;

    @Before
    public void setUp(){
        this.testRace="Black";
    }
    @Test
    public void buildRace() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RaceFactory class
         * 4. Assert that the id is generated.
         */
        Race race = RaceFactory.buildRace(testRace);
        System.out.println(testRace);
        Assert.assertNotNull(race.getRaceId());
        Assert.assertEquals(testRace,race.getRaceDescription());
    }
}