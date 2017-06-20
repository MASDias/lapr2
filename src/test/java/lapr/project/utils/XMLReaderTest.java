/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import lapr.project.model.EventCenter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author playtard
 */
public class XMLReaderTest {
    
    /**
     *
     * @throws java.lang.Exception
     */
    @Test
    public void EnsureXMLReaderIsEqual() throws Exception{
        XMLReader xmlFile = new XMLReader();
        EventCenter ec = new EventCenter();
        ec = xmlFile.readValuesFromXML(ec);
        EventCenter ec2 = ec;
        assertEquals(ec,ec2);
        
    }
    
        /**
     *
     * @throws java.lang.Exception
     */
    @Test
    public void EnsureXMLReaderIsNotEqual() throws Exception{
        XMLReader xmlFile = new XMLReader();
        EventCenter ec = new EventCenter();
        ec = xmlFile.readValuesFromXML(ec);
        EventCenter ec2 = new EventCenter();
        ec2 = xmlFile.readValuesFromXML(ec2);
        assertNotEquals(ec,ec2);
        
    }
}
