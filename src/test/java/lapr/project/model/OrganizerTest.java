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
 *  @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class OrganizerTest {
     
    /**
     *
     */
    @Test
    public void EnsureSameObjectExpertIsEqual() {
        User u1 = new User("adaad","asdasd","fafsd","adasdasa");
        Organizer organizer = new Organizer(u1);
        assertEquals(organizer, organizer);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsExpertAreNotEqual() {
        User u1 = new User("adaad","asdasd","fafsd","adasdasa");
        Organizer organizer = new Organizer(u1);
        User u2 = new User("adaaddsada","asdasd","fafsd","adasdasa");
        Organizer organizerexpectedresult = new Organizer(u1);
        assertNotEquals(organizer, organizerexpectedresult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsExpertAreNotEqual() {
        User u1 = new User("adaad","asdasd","fafsd","adasdasa");
        Organizer organizer = new Organizer(u1);
        Object expectedResult = new Object();
        assertNotEquals(organizer, expectedResult);
    }
}
