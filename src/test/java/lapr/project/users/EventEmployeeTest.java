/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import lapr.project.model.EventEmployee;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeTest {

    @Test
    public void EnsureSameObjectEventEmployeeIsEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123", 3);
        assertEquals(eEmployee, eEmployee);
    }

    @Test
    public void EnsureSameObjectsEventEmployeeAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123", 3);
        EventEmployee expectedResult = new EventEmployee("Z", "c", "b", "a", 3);
        assertNotEquals(eEmployee, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsEventEmployeeAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee("Miguel", "miguel@gmail.com", "miguel4", "miguel123", 3);
        Object expectedResult = new Object();
        assertNotEquals(eEmployee, expectedResult);
    }

    @Test
    public void EnsureSameObjectEventEmployeeEmptyIsEqual() {
        EventEmployee eEmployee = new EventEmployee();
        assertEquals(eEmployee, eEmployee);
    }

    @Test
    public void EnsureSameObjectsEventEmployeeEmptyAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee();
        EventEmployee expectedResult = new EventEmployee("Z", "c", "b", "a", 3);
        assertNotEquals(eEmployee, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsEventEmployeeEmptyAreNotEqual() {
        EventEmployee eEmployee = new EventEmployee();
        Object expectedResult = new Object();
        assertNotEquals(eEmployee, expectedResult);
    }

    @Test
    public void EnsureSetExperience() {
        EventEmployee result = new EventEmployee("Z", "c", "b", "a", 1);
        EventEmployee expectedResult = new EventEmployee("Z", "c", "b", "a", 3);
        result.setExperience(3);
        assertEquals(result, expectedResult);
    }
}
