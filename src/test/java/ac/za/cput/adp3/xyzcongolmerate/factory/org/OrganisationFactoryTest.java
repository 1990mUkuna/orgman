package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    private String testOrganisation;

    @Before
    public void setUp(){
        this.testOrganisation="CPUT";
    }
    @Test
    public void buildOrganisation() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the OrganisationFactory class
         * 4. Assert that the id is generated.
         */
        Organisation organisation = OrganisationFactory.buildOrganisation(testOrganisation);
        System.out.println(organisation);
        Assert.assertNotNull(organisation.getOrgCode());
        Assert.assertEquals(testOrganisation,organisation.getOrgName());
    }
}