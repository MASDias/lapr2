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
import org.junit.Test;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class EventRegistryTest {
    
    @Test
    public void EnsureAddEventMethodAddsEventToList() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local, null);
        
        list.addEvent(event);
        int size = list.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }
}
