/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author playtard
 */
public class EventManagerListTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void ensureAddEventManagerMethodAddsEventManagerToList() throws Exception {
        EventManagerList list = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        EventManager em1 = new EventManager(u1);
        EventManager em2 = new EventManager(u2);
        list.addEventManager(em1);
        list.addEventManager(em2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void ensureAddEventManagerMethodDoesntAddEventManagerToList() throws Exception {
        EventManagerList list = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        EventManager em1 = new EventManager(u1);
        EventManager em2 = new EventManager(u2);
        list.addEventManager(em1);
        list.addEventManager(em2);
        int size = list.size();
        int expectedResult = 0;
        assertNotEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
//    @Test
//    public void ensureGetEventManagerListMethodDoesntReturnEventManagerList() throws Exception {
//        EventManagerList expectedList = new EventManagerList();
//        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
//        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
//        EventManager em1 = new EventManager(u1);
//        EventManager em2 = new EventManager(u2);
//        expectedList.addEventManager(em1);
//        expectedList.addEventManager(em2);
//        List<EventManager> list = expectedList.getEventManagersList();
//        List<EventManager> expected = new ArrayList<>();
//        assertNotEquals(list, expected);
//    }

    /**
     *
     * @throws Exception
     */
//    @Test
//    public void ensureConstructorEventManagerListWorks() throws Exception {
//        EventManagerList list = new EventManagerList();
//        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
//        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
//        EventManager em1 = new EventManager(u1);
//        EventManager em2 = new EventManager(u2);
//        list.addEventManager(em1);
//        list.addEventManager(em2);
//        EventManagerList expectedList = new EventManagerList();
//        expectedList.addEventManager(em1);
//        expectedList.addEventManager(em2);
//        assertEquals(list.getEventManagersList(), expectedList.getEventManagersList());
//
//    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void ensureConstructorEventManagerListDoesntWork() throws Exception {
        EventManagerList list = new EventManagerList();
        list.addEventManager(new EventManager(new User("O real", "Test@gmail.com", "orealzao", "arealpass")));
        EventManagerList expectedList = new EventManagerList();
        assertNotEquals(list, expectedList);
    }
    @Test
   public void EnsureAddEventMethodAddsEventToListNotValid() throws Exception {
        EventManagerList result = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em = new EventManager(u1);
        result.addEventManager(em);
        result.addEventManager(em);
        int size = result.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetEventManagerIsEqual() throws Exception {
        EventManagerList list = new EventManagerList();
        User user = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager eventManager = new EventManager(user);
        list.addEventManager(eventManager);
        EventManager result = list.getEventManager(0);
        assertEquals(result,eventManager);
    }
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetEventManagerIsNotEqual() throws Exception {
        EventManagerList list = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        EventManager eventManager = new EventManager(u1);
        EventManager eventManager2 = new EventManager(u2);
        list.addEventManager(eventManager);
        list.addEventManager(eventManager2);
        EventManager result = list.getEventManager(1);
        assertNotEquals(result,eventManager);
    }
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureRemoveEventManagerWorks() throws Exception {
        EventManagerList list = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        EventManager eventManager = new EventManager(u1);
        EventManager eventManager2 = new EventManager(u2);
        list.addEventManager(eventManager);
        list.addEventManager(eventManager2);
        list.removeEventManager(eventManager);
        int result = list.size();
        int expectedResult = 1;
        assertEquals(result,expectedResult);
        
    }
}
