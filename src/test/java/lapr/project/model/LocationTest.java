/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class LocationTest {
     /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
       Location location = new Location("sy");
       String result = location.toString();
       String expectedResult = "Address: sy";
       assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        Location location = new Location("sy");
       String result = location.toString();
       String expectedResult = "Address: su";
       assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetInUseIsEqual() {
       Location location = new Location("sy");
       boolean inUse = true;
       location.setInUse(inUse);
       boolean expectedResult = location.isInUse();
       assertEquals(inUse, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureSetInUseIsNotEqual() {
       Location location = new Location("sy");
       boolean inUse = true;
       boolean inUse2 = false;
       location.setInUse(inUse);
       boolean expectedResult = location.isInUse();
       assertNotEquals(inUse2, expectedResult);
    }
       /**
     *
     */
    @Test
    public void EnsureIsInUseIsEqual() {
       Location location = new Location("sy");
       boolean inUse = true;
       location.setInUse(inUse);
       boolean expectedResult = location.isInUse();
       assertEquals(inUse, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureIsInUseIsNotEqual() {
       Location location = new Location("sy");
       boolean inUse = true;
       boolean inUse2 = false;
       location.setInUse(inUse);
       boolean expectedResult = location.isInUse();
       assertNotEquals(inUse2, expectedResult);
    }
}
