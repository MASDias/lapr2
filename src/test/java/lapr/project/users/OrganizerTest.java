/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import lapr.project.model.Organizer;
import lapr.project.model.OrganizersList;
import lapr.project.model.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class OrganizerTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectOrganizerIsEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        assertEquals(organizer, organizer);
    }
    

    /**
     *
     */
    @Test
    public void EnsureSameObjectsOrganizerAreNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        User user2 = new User("Z", "c", "b", "a");
        Organizer result = new Organizer(user);
        Organizer expectedResult = new Organizer(user2);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsOrganizerAreNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer result = new Organizer(user);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
        User user = new User("James", "james@gmail.com", "juanjames", "123456789");
        Organizer organizer = new Organizer(user);
        String result = organizer.toString();
        String expectedResult = "Name:James; Username:juanjames; Email:james@gmail.com";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        User user = new User("James", "james@gmail.com", "juanjames", "123456789");
        Organizer organizer = new Organizer(user);
        String result = organizer.toString();
        String expectedResult = "Name: Jame Username: juanjames Email: james@gmail.com";
        assertNotEquals(result, expectedResult);
    }
    @Test
    public void EnsureValidate() {
        OrganizersList list = new OrganizersList();
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        list.addOrganizer(organizer);
        list.addOrganizer(organizer);
        int result = list.size();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
    
}
