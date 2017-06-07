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
public class OrganizersListTest {

    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception {
        
        OrganizersList list = new OrganizersList();
        Organizer o1 = new Organizer("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        Organizer o2 = new Organizer("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        list.addOrganizer(o1);
        list.addOrganizer(o2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    @Test
    public void EnsureSameObjectsOrganizersListAreEqual() throws Exception {
        
        OrganizersList list = new OrganizersList();
        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        list.addOrganizer(organizer);
        assertEquals(list, list);
    }

    @Test
    public void EnsureSameObjectsApplicationsListAreNotEqual() throws Exception {

        Organizer organizer = new Organizer("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        OrganizersList list = new OrganizersList();
        OrganizersList list2 = new OrganizersList();
        list.addOrganizer(organizer);
        assertNotEquals(list, list2);
    }

}
