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

    
    @Test
    public void EnsureSetNameIsEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "a";
        user.setName("a");
        String result = user.getName();
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetNameIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setName("a");
        String result = user.getName();
        assertNotEquals(result, expectedResult);
    }
    
    @Test
    public void EnsureSetEmailIsEqual() {
        User user = new User("Z", "t", "b", "c");
        String expectedResult = "a";
        user.setEmail("a");
        String result = user.getEmail();
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetEmailIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setEmail("a");
        String result = user.getEmail();
        assertNotEquals(result, expectedResult);
    }
    
    @Test
    public void EnsureSetUsernameIsEqual() {
        User user = new User("Z", "t", "b", "c");
        String expectedResult = "a";
        user.setUserName("a");
        String result = user.getUserName();
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetUsernameIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setUserName("a");
        String result = user.getUserName();
        assertNotEquals(result, expectedResult);
    }
    
    @Test
    public void EnsureToStringIsEqual() {
        User user = new User("Z", "a", "b", "c");
        String result = user.toString();
        String expectedResult = "Name: Z\nUsername: b\nEmail: a";
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureToStringIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String result = user.toString();
        String expectedResult = "Name: l\nUsername: b\nEmail: a";
        assertNotEquals(result, expectedResult);
    }
    
    
}
