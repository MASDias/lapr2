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

    
    @Test
    public void EnsureSameObjectEventIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local);
        assertEquals(event, event);
    }

    @Test
    public void EnsureSameObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        
        Event event = new Event("Model Example", "Example string", beginning, end, local);
        Event result = new Event("Model", "string", end, beginning, local);
        assertNotEquals(event, result);
    }

    @Test
    public void EnsureDifferentObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        
        Event event = new Event("Model Example", "Example string", beginning, end, local);
        Object result = new Object();
        assertNotEquals(event, result);
    }
}
