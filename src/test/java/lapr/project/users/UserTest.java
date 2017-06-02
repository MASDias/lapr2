/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

/**
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
import lapr.project.model.User;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void EnsureSameObjectUserIsEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(user, user);
    }

    @Test
    public void EnsureSameObjectsUserAreNotEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User expectedResult = new User("Z", "c", "b", "a");
        assertNotEquals(user, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsUserAreNotEqual() {
        User user = new User("Z", "a", "b", "c");
        Object expectedResult = new Object();
        assertNotEquals(user, expectedResult);
    }

}
