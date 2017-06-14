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
public class EventRegistryTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddEventMethodAddsEventToList() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        int size = list.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddEventMethodAddsUserToListNotValid() throws Exception {
        EventRegistry result = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model 98Example", "Explae string", beginning, end, null, null, local, 100);
        result.addEvent(event);
        result.addEvent(event);
        int size = result.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddEventMethodAddsUserToListIndex() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example50", "Explae string", beginning, end, null, null, local, 100);
        EventRegistry list = new EventRegistry();
        list.addEvent(event);
        int result = list.size();
        int expectedResult = 1;
        
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsEventRegistryListAreEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example10", "Explae string", beginning, end, null, null, local, 100);
        EventRegistry list = new EventRegistry();
        list.addEvent(event);
        assertEquals(list, list);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsEventRegistryListAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example6", "Explae string", beginning, end, null, null, local, 100);
        EventRegistry list = new EventRegistry();
        EventRegistry list2 = new EventRegistry();
        list.addEvent(event);
        assertNotEquals(list, list2);
    }
}
