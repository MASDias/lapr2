/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

/**
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
import lapr.project.Users.EventManager;
import lapr.project.Users.User;
import static org.junit.Assert.*;
import org.junit.Test;

public class UsersTest {

    @Test
    public static void EnsureSameObjectUserIsEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(user, user);
    }

    @Test
    public static void EnsureSameObjectsUserAreNotEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User expectedResult = new User("Z", "c", "b", "a");
        assertNotEquals(user, expectedResult);
    }

    @Test
    public static void EnsureDifferentObjectsUserAreNotEqual() {
        User user = new User("Z", "a", "b", "c");
        Object expectedResult = new Object();
        assertNotEquals(user, expectedResult);
    }

    @Test
    public static void EnsureSameObjectEventManagerIsEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(eManager, eManager);
    }

    @Test
    public static void EnsureSameObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        EventManager expectedResult = new EventManager("Z", "c", "b", "a");
        assertNotEquals(expectedResult, eManager);
    }

    @Test
    public static void EnsureDifferentObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("mario", "m@gmail.com", "mario1", "m123");
        Object expectedResult = new Object();
        assertNotEquals(eManager, expectedResult);
    }

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
    @Test
    public static void EnsureSameObjectOrganizerIsEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        assertEquals(organizer, organizer);
    }

    @Test
    public static void EnsureSameObjectsOrganizerAreNotEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer expectedResult = new Organizer("Z", "c", "b", "a");
        assertNotEquals(organizer, expectedResult);
    }

    @Test
    public static void EnsureDifferentObjectsOrganizerAreNotEqual() {
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Object expectedResult = new Object();
        assertNotEquals(organizer, expectedResult);
    }

}
