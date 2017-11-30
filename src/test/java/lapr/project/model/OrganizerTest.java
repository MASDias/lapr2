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
public class OrganizerTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectExpertIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        assertEquals(organizer, organizer);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsExpertAreNotEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        User u2 = new User("adaaddsada", "asdasd", "fafsd", "adasdasa");
        Organizer organizerexpectedresult = new Organizer(u1);
        assertNotEquals(organizer, organizerexpectedresult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsExpertAreNotEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        Object expectedResult = new Object();
        assertNotEquals(organizer, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetOrganizersIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        User result = organizer.getOrganizer();
        assertEquals(u1, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetOrganizersIsNotEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        User u2 = new User("adad", "asdad", "fafs", "adassa");
        Organizer organizer = new Organizer(u1);
        User result = organizer.getOrganizer();
        assertNotEquals(u2, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEventRegestryIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        EventRegistry expectedResult = new EventRegistry();
        organizer.setEventRegistry(expectedResult);
        EventRegistry result = organizer.getEventRegistry();
        assertEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSetEventRegestryIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        EventRegistry expectedResult = new EventRegistry();
        organizer.setEventRegistry(expectedResult);
        EventRegistry result = organizer.getEventRegistry();
        assertEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEmailIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        String result = organizer.getEmail();
        String expectedResult = "asdasd";
        assertEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEmailIsNotEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        String result = organizer.getEmail();
        String expectedResult = "asdd";
        assertNotEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetUsernameIsEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        String result = organizer.getUsername();
        String expectedResult = "fafsd";
        assertEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureGetUsernameIsNotEqual() {
        User u1 = new User("adaad", "asdasd", "fafsd", "adasdasa");
        Organizer organizer = new Organizer(u1);
        String result = organizer.getUsername();
        String expectedResult = "asdd";
        assertNotEquals(expectedResult, result);
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
