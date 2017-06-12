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
 * @author MarioDias
 */
public class CongressTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectCongressIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Congress event = new Congress("Model Example", "Explae string", beginning, end, local,100);
        assertEquals(event, event);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsCongressAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);

        Congress event = new Congress("Model Example", "Example string", beginning, end, local,100);
        Congress result = new Congress("Model", "string", end, beginning, local,100);
        assertNotEquals(event, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsCongressAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);

        Congress event = new Congress("Model Example", "Example string",  beginning, end, local,100);
        Object result = new Object();
        assertNotEquals(event, result);
    }

}
