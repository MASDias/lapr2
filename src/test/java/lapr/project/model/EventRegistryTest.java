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
    
    @Test
    public void EnsureAddEventMethodAddsEventToList() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local,null, null);
        
        list.addEvent(event);
        int size = list.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }
    
     @Test
    public void EnsureSameObjectsEventRegistryListAreEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local,null, null);
        
        EventRegistry list = new EventRegistry();
        list.addEvent(event);
        assertEquals(list, list);
    }

    @Test
    public void EnsureSameObjectsEventRegistryListAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local,null, null);
        
      
        EventRegistry list = new EventRegistry();
        EventRegistry list2 = new EventRegistry();
        list.addEvent(event);
        assertNotEquals(list, list2);
    }



    @Test
    public void EnsureGetEventRegistryListIsNotEqual() throws Exception {
        ApplicationsList al = new ApplicationsList();
        ApplicationsList al2 = new ApplicationsList();
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local,null, al);

       
        event.setApplicationsList(al);
        assertNotEquals(al, al2);
    }


}
