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
    public static void EnsureSameObjectEventManagerIsEqual() {
        EventManager eManager = new EventManager("Z", "a", "b", "c");
        assertEquals(eManager, eManager);
    }

    @Test
    public static void EnsureSameObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("Z", "a", "b", "c");
        EventManager expectedResult = new EventManager("Z", "c", "b", "a");
        assertNotEquals(expectedResult, eManager);
    }

    @Test
    public static void EnsureDifferentObjectsEventManagerAreNotEqual() {
        EventManager eManager = new EventManager("Z", "a", "b", "c");
        Object expectedResult = new Object();
        assertNotEquals(eManager, expectedResult);
    }
    @Test
    public static void EnsureSameObjectUserIsEqual() {
        User user = new User("Z", "a", "b", "c");
        assertEquals(user, user);
    }
    @Test
    public static void EnsureSameObjectsUserAreNotEqual() {
        User user = new User("Z", "a", "b", "c");
        User expectedResult = new User("Z", "c", "b", "a");
        assertNotEquals(expectedResult, user);
    }
    @Test
    public static void EnsureDifferentObjectsUserAreNotEqual() {
        User user = new User("Z", "a", "b", "c");
        Object expectedResult = new Object();
        assertNotEquals(user, expectedResult);
    }

}
