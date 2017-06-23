/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
import lapr.project.model.User;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author MarioDias
 */
public class UserTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectUserIsEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        assertEquals(user, user);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsUserAreNotEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User expectedResult = new User("Z", "c", "b", "a");
        assertNotEquals(user, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsUserAreNotEqual() {
        User user = new User("Z", "a", "b", "c");
        Object expectedResult = new Object();
        assertNotEquals(user, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetNameIsEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "a";
        user.setName("a");
        String result = user.getName();
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetNameIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setName("a");
        String result = user.getName();
        assertNotEquals(result, expectedResult);
    }
    
    /**
     *
     */
    @Test
    public void EnsureSetEmailIsEqual() {
        User user = new User("Z", "t", "b", "c");
        String expectedResult = "a";
        user.setEmail("a");
        String result = user.getEmail();
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetEmailIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setEmail("a");
        String result = user.getEmail();
        assertNotEquals(result, expectedResult);
    }
    
    /**
     *
     */
    @Test
    public void EnsureSetUsernameIsEqual() {
        User user = new User("Z", "t", "b", "c");
        String expectedResult = "a";
        user.setUserName("a");
        String result = user.getUserName();
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetUsernameIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String expectedResult = "b";
        user.setUserName("a");
        String result = user.getUserName();
        assertNotEquals(result, expectedResult);
    }
    
    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
        User user = new User("Z", "a", "b", "c");
        String result = user.toString();
        String expectedResult = "Name:Z; Username:b; Email:a";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        String result = user.toString();
        String expectedResult = "Name: l Username: b Email: a";
        assertNotEquals(result, expectedResult);
    }
     
    /**
     *
     */
    @Test
    public void EnsureIsUserSatusIsEqual() {
        User user = new User("Z", "a", "b", "c");
        boolean result = user.isUserStatus();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetPasswordIsEqual() {
        User user = new User("Z", "a", "b", "c");        
        String result = user.getPassword();
        String expectedResult = "n";
        assertEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureGetPasswordIsNotEqual() {
        User user = new User("Z", "a", "b", "c");        
        String result = user.getPassword();
        String expectedResult = "r";
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetPasswordIsEqual() {
        User user = new User("Z", "a", "b", "c");
        user.setPassword("r");
        String result = user.getPassword();
        String expectedResult = "}";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetPasswordIsNotEqual() {
        User user = new User("Z", "a", "b", "c");
        user.setPassword("r");
        String result = user.getPassword();
        String expectedResult = "n";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateNameIsTrue() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateNameIsNotFalse() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = false;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateNameWithNumberIsFalse() {
        User user = new User("mario2", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureValidateNameWithNumberIsNotTrue() {
        User user = new User("mario2", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureValidateNameWithSimbolIsFalse() {
        User user = new User("mario£", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureValidateNameWithSimbolIsNotTrue() {
        User user = new User("mario£", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateName();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureValidateEmailIsTrue() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateEmail();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureValidateEmailIsNotFalse() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateEmail();
        boolean expectedResult = false;
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureValidateEmailWithATIsFalse() {
        User user = new User("mario", "mgmail.com", "mario1", "m123");        
        boolean result = user.validateEmail();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateEmailWithATIsNotTrue() {
        User user = new User("mario", "mgmail.com", "mario1", "m123");        
        boolean result = user.validateEmail();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateUserNameIsTrue() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateUsername();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateUserNameIsNotFalse() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateUsername();
        boolean expectedResult = false;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateUserNameWithSimbolIsFalse() {
        User user = new User("mario", "m@gmail.com", "mario1€", "m123");        
        boolean result = user.validateUsername();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateUserNameWithSimbolIsNotTrue() {
        User user = new User("mario", "m@gmail.com", "mario1€", "m123");        
        boolean result = user.validateUsername();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
       /**
     *
     */
    @Test
    public void EnsureValidateDataIsTrue() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }
       /**
     *
     */
    @Test
    public void EnsureValidateDataIsNotFalse() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = false;
        assertNotEquals(result, expectedResult);
    }
       /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidNameIsFalse() {
        User user = new User("mario1", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidNameIsNotTrue() {
        User user = new User("mario1", "m@gmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidEmailIsFalse() {
        User user = new User("mario", "mgmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
       /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidEmailIsNotTrue() {
        User user = new User("mario", "mgmail.com", "mario1", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidUserNameIsFalse() {
        User user = new User("mario", "m@gmail.com", "mario1@", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureValidateDatawithoutValidUserNameIsNotTrue() {
        User user = new User("mario", "m@gmail.com", "mario1@", "m123");        
        boolean result = user.validateData();
        boolean expectedResult = true;
        assertNotEquals(result, expectedResult);
    }

}
