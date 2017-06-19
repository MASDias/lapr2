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
public class LocationListTest {

    @Test
    public void EnsureAddLocalMethodAddsLocalToList() throws Exception {
        LocationList list = new LocationList();
        Location l1 = new Location("Rua do prego");
        Location l2 = new Location("Avenida da Liberdade");
        list.addLocal(l1);
        list.addLocal(l2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }
     /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddLocalMethodAddsUserToListNotValid() throws Exception {
         LocationList result = new LocationList();
        Location l1 = new Location("Rua do prego");
        Location l2 = new Location("Avenida da Liberdade");
        result.addLocal(l1);
        result.addLocal(l2);
        int size = result.size();
        int expectedResult = 1;
        assertNotEquals(size, expectedResult);
    }
    
    @Test
    public void EnsureRemoveLocalMethodAddsLocalToList() throws Exception {
        LocationList list = new LocationList();
        Location l1 = new Location("Rua do prego");
        Location l2 = new Location("Avenida da Liberdade");
        list.addLocal(l1);
        list.addLocal(l2);
        list.removeLocation(l2);
        int size = list.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }
     /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureRemoveLocalMethodAddsUserToListNotValid() throws Exception {
         LocationList result = new LocationList();
        Location location = new Location("Rua do prego");
        result.addLocal(location);
        result.addLocal(location);
        result.removeLocation(location);
        int size = result.size();
        int expectedResult = 1;
        assertNotEquals(size, expectedResult);
    }
 /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddLocalMethodAddsUserToListIndex() throws Exception {
        LocationList list = new LocationList();
        Location result = new Location("Rua do prego");
        list.addLocal(result);
        Location expectedResult = list.getLocal(0);
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsLocalListAreEqual() throws Exception {

        LocationList list = new LocationList();
        Location location = new Location("Rua do prego");

        list.addLocal(location);
        assertEquals(list, list);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsLocationListAreNotEqual() throws Exception {
       Location location = new Location("Rua do prego");
         LocationList list = new LocationList();
          LocationList list2 = new LocationList();
        list.addLocal(location);
        assertNotEquals(list, list2);
    }

}
