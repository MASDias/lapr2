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
 * @author MarioDias
 */
public class CongressTest {

    @Test
    public void EnsureSameObjectCongressIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Congress event = new Congress("Model Example", "Explae string", beginning, end, local, null);
        assertEquals(event, event);
    }

    @Test
    public void EnsureSameObjectsCongressAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);

        Congress event = new Congress("Model Example", "Example string", beginning, end, local, null);
        Congress result = new Congress("Model", "string", end, beginning, local, null);
        assertNotEquals(event, result);
    }

    @Test
    public void EnsureDifferentObjectsCongressAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);

        Congress event = new Congress("Model Example", "Example string", beginning, end, local, null);
        Object result = new Object();
        assertNotEquals(event, result);
    }

    
}
