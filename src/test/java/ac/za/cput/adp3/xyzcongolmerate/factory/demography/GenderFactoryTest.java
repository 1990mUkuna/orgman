package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {

    private String testGender;
    @Before
    public void setUp(){
        this.testGender="male";
    }
    @Test
    public void buildGender() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported!");]
         * 3. Test the GenderFactory class
         * 4. Assert that the id is generated.
         */
        Gender gender= GenderFactory.buildGender(testGender);
        System.out.println(gender);
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertEquals(testGender,gender.getGenderDescription());
    }
}