/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author MarioDias
 */
public class EventTest {

    @Test
    public void EnsureSameObjectEventIsEqual() {
        Event event = new Event("Model Example", "Explae string", new Date(2017, 3, 15), new Date(2017, 4, 15), new Local("Example street", 500));
        assertEquals(event, event);
    }

    @Test
    public void EnsureSameObjectsEventAreNotEqual() {
        Event event = new Event("Model Example", "Example string", new Date(2017, 3, 15), new Date(2017, 4, 15), new Local("Example street", 500));
        Event result = new Event("Model", "string", new Date(2016, 3, 15), new Date(2016, 4, 15), new Local("Example street", 500));
        assertNotEquals(event, result);
    }

    @Test
    public void EnsureDifferentObjectsEventAreNotEqual() {
        Event event = new Event("Model Example", "Example string", new Date(2017, 3, 15), new Date(2017, 4, 15), new Local("Example street", 500));
        Object result = new Object();
        assertNotEquals(event, result);
    }
}
