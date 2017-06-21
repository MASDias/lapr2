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
    
    @Test
    public void EnsureXMLReaderWithParametersIsEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.1.xml");
        EventCenter ec = new EventCenter();
        ec = xmlFile.readValuesFromXML(ec);
        EventCenter ec2 = ec;
        assertEquals(ec,ec2);
    }

    @Test
    public void EnsureXMLReaderWithParametersIsNotEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.1.xml");
        EventCenter ec = new EventCenter();
        ec = xmlFile.readValuesFromXML(ec);
        EventCenter ec2 = new EventCenter();
        ec2 = xmlFile.readValuesFromXML(ec2);
        assertNotEquals(ec,ec2);
    }
    
    @Test
    public void EnsureTestFilePathIsEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.1.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.1.xml");
        boolean expectedResult = true;
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void EnsureTestFilePathIsNotEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.1.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.1.xml");
        boolean expectedResult = false;
        assertNotEquals(result,expectedResult);
    }
    
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureFilePathTestingWorksInConstrutorIsEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.1.xml");
        boolean expectedResult = true;
        assertEquals(result,expectedResult);
    }
    
    
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureFilePathTestingWorksInConstrutorIsNotEqual() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.1.xml");
        boolean expectedResult = false;
        assertNotEquals(result,expectedResult);
    }
    
    @Test
    public void EnsureFilePathTestingWorksInConstrutorIsEqualWhenFalse() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.xml");
        boolean expectedResult = false;
        assertEquals(result,expectedResult);
    }
    
        @Test
    public void EnsureFilePathTestingWorksInConstrutorIsNotEqualWhenFalse() throws Exception{
        XMLReader xmlFile = new XMLReader("xml/exposicao1_v0.xml");
        boolean result = xmlFile.testFilepath("xml/exposicao1_v0.xml");
        boolean expectedResult = true;
        assertNotEquals(result,expectedResult);
    }
    
}
