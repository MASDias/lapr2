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
public class AssignmentTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsAssignmentIsEqual() throws Exception {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Assignment result = new Assignment(eEmployee);
        assertEquals(result, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsApplicationAreNotEqual() throws Exception {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Assignment result = new Assignment(eEmployee);
        User user2 = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventEmployee eEmployee2 = new EventEmployee(user2, 4);
        Assignment expectedResult = new Assignment(eEmployee2);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsApplicationAreNotEqual() throws Exception {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Assignment result = new Assignment(eEmployee);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEventEmployeeIsEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Assignment assignment = new Assignment(eEmployee);
        EventEmployee result = assignment.getEventEmployee();
        assertEquals(result, eEmployee);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEventEmployeeIsNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Assignment assignment = new Assignment(eEmployee);
        EventEmployee result = assignment.getEventEmployee();
        User user2 = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventEmployee eEmployee2 = new EventEmployee(user2, 4);
        assertNotEquals(result, eEmployee2);
    }
}
