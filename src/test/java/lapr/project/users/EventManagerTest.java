/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import lapr.project.model.EventManager;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManagerTest {

    @Test
    public void EnsureSameObjectEventManagerIsEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(eManager, eManager);
    }
    

    @Test
    public void EnsureSameObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        EventManager expectedResult = new EventManager("Z", "c", "b", "a");
        assertNotEquals(expectedResult, eManager);
    }

    @Test
    public void EnsureDifferentObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        Object expectedResult = new Object();
        assertNotEquals(eManager, expectedResult);
    }

}
