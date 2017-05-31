/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeTest {
     @Test
    public static void EnsureSameObjectEventEmployeeIsEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        assertEquals(eEmployee, eEmployee);
    }

    @Test
    public static void EnsureSameObjectsEventEmployeeAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee expectedResult = new EventEmployee("Z", "c", "b", "a");
        assertNotEquals(eEmployee, expectedResult);
    }

    @Test
    public static void EnsureDifferentObjectsEventEmployeeAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Object expectedResult = new Object();
        assertNotEquals(eEmployee, expectedResult);
    }
}
