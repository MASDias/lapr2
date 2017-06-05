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
    public void EnsureToStringIsEqual() {
        EventEmployee employeeResult = new EventEmployee("Z", "c", "b", "a", 1);
        String result = employeeResult.toString();
        String expectedResult = "Name: Z\nEmail: c\nUserName: b\nExperience: 1";
        assertEquals(result, expectedResult);
    }
    
    @Test
    public void EnsureToStringIsNotEqual() {
        EventEmployee employeeResult = new EventEmployee("Z", "c", "b", "a", 1);
        String result = employeeResult.toString();
        String expectedResult = "Name: l\nEmail: c\nUserName: b\nExperience: 1";
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetExperienceIsEqual() {
        EventEmployee employee = new EventEmployee("Z", "c", "b", "a", 1);
        int expectedResult = 3;
        employee.setExperience(3);
        int result = employee.getExperience();
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetExperienceIsNotEqual() {
        EventEmployee employee = new EventEmployee("Z", "c", "b", "a", 1);
        int expectedResult = 1;
        employee.setExperience(3);
        int result = employee.getExperience();
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetExperienceIsEqual() {
        EventEmployee employee = new EventEmployee("Z", "c", "b", "a", 1);
        int expectedResult = 1;
        int result = employee.getExperience();
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetExperienceIsNotEqual() {
        EventEmployee employee = new EventEmployee("Z", "c", "b", "a", 1);
        int expectedResult = 2;
        int result = employee.getExperience();
        assertNotEquals(result, expectedResult);
    }

}
