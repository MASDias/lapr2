/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class StandRegistryTest {
    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception{
        StandRegistry list = new StandRegistry();
        Stand s1 = new Stand("stand 1", 500);
        Stand s2 = new Stand("stand 2", 600);
        list.addStand(s1);
        list.addStand(s2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
    
    @Test
    public void EnsureSameObjectsStandRegistryIsEqual() throws Exception {
        StandRegistry result = new  StandRegistry();
        assertEquals(result, result);
    }

//    @Test
//    public void EnsureSameObjectsApplicationAreNotEqual() throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//        Date beginning = sdf.parse("01/10/2017");
//        Date end = sdf.parse("01/30/2017");
//        Local local = new Local("Example Street", 500);
//        Event event = new Event("Model Example", "Explae string", beginning, end, local, null);
//        Application2 application = new Application2("qwert", event, false);
//        Application2 application2 = new Application2("qwerty", event, false);
//
//        assertNotEquals(application, application2);
//    }
//
//    @Test
//    public void EnsureDifferentObjectsApplicationAreNotEqual() throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//        Date beginning = sdf.parse("01/10/2017");
//        Date end = sdf.parse("01/30/2017");
//        Local local = new Local("Example Street", 500);
//        Event event = new Event("Model Example", "Explae string", beginning, end, local, null);
//        Application2 application = new Application2("qwerty", event, false);
//        Object expectedResult = new Object();
//        assertNotEquals(application, expectedResult);
//    }
//
//    @Test
//    public void EnsureToStringIsEqual() throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//        Date beginning = sdf.parse("01/10/2017");
//        Date end = sdf.parse("01/30/2017");
//        Local local = new Local("Example Street", 500);
//        Event event = new Event("Model Example", "Explae string", beginning, end, local, null);
//        Application2 application = new Application2("qwerty", event, false);
//        String result = application.toString();
//        String expectedResult = "Description: qwerty\nTitle: Model Example\nDescription: Explae string\nDate Begin: Tue Jan 10\nDate End: Mon Jan 30\nLocal: Address: Example Street\nDecision: false";
//        assertEquals(result, expectedResult);
//    }
//
//    @Test
//    public void EnsureToStringIsNotEqual() throws Exception {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//        Date beginning = sdf.parse("01/10/2017");
//        Date end = sdf.parse("01/30/2017");
//        Local local = new Local("Example Street", 500);
//        Event event = new Event("Model Example", "Explae string", beginning, end, local, null);
//        Application2 application = new Application2("qwerty", event, false);
//        String result = application.toString();
//        String expectedResult = "Description: qwert\nTitle: Model Example\nDescription: Explae string\nDate Begin: Tue Jan 10\nDate End: Mon Jan 30\nLocal: Address: Example Street\nDecision: false";
//        assertNotEquals(result, expectedResult);
//
//    }
}
