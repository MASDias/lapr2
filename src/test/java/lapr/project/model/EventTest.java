/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local,100);
        assertEquals(event, event);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        
        Event event = new Event("Model Example", "Example string", beginning, end, local,100);
        Event result = new Event("Model", "string", end, beginning, local,100);
        assertNotEquals(event, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        
        Event event = new Event("Model Example", "Example string", beginning, end, local,100);
        Object result = new Object();
        assertNotEquals(event, result);
    }
}
