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
    
    @Test
    public void ensureAddEventManagerMethodAddsEventManagerToList() throws Exception{
        EventManagerList list = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        list.addEventManager(em1);
        list.addEventManager(em2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
    
    @Test
    public void ensureAddEventManagerMethodDoesntAddEventManagerToList() throws Exception{
        EventManagerList list = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        list.addEventManager(em1);
        list.addEventManager(em2);
        int size = list.size();
        int expectedResult = 0;
        assertNotEquals(size,expectedResult);
    }
    
    @Test
    public void ensureSetEventManagerListMethodSetsEventManagerList()throws Exception{
        EventManagerList expectedList = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        expectedList.addEventManager(em1);
        expectedList.addEventManager(em2);
        EventManagerList list = new EventManagerList();
        List<EventManager> gotList = expectedList.getEventManagersList();
        list.setEventManagersList(gotList);
        assertEquals(list.getEventManagersList(),gotList);
    }
    
    @Test
    public void ensureSetEventManagerListMethodDoesntSetEventManagerList()throws Exception{
        EventManagerList expectedList = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        expectedList.addEventManager(em1);
        expectedList.addEventManager(em2);
        EventManagerList list = new EventManagerList();
        list.setEventManagersList(expectedList.getEventManagersList());
        expectedList.getEventManagersList().clear();
        assertNotEquals(list,expectedList);
    }
    
    @Test
    public void ensureGetEventManagerListMethodReturnsEventManagerList() throws Exception{
        EventManagerList expectedList = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        List<EventManager> list = expectedList.getEventManagersList();
        expectedList.setEventManagersList(new ArrayList<EventManager>());
        assertEquals(list,expectedList.getEventManagersList());
    }
    
    @Test
    public void ensureGetEventManagerListMethodDoesntReturnEventManagerList() throws Exception{
        EventManagerList expectedList = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        expectedList.addEventManager(em1);
        expectedList.addEventManager(em2);
        List<EventManager> list = expectedList.getEventManagersList();
        List<EventManager> expected = new ArrayList<>();
        assertNotEquals(list,expected);
    }
    @Test
    public void ensureConstructorEventManagerListWorks() throws Exception{
        EventManagerList list = new EventManagerList();
        EventManager em1 = new EventManager("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager em2 = new EventManager("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        list.addEventManager(em1);
        list.addEventManager(em2);
        EventManagerList expectedList = new EventManagerList();
        expectedList.addEventManager(em1);
        expectedList.addEventManager(em2);
        assertEquals(list.getEventManagersList(),expectedList.getEventManagersList());
        
    }
    
    @Test
    public void ensureConstructorEventManagerLisDoesntWork() throws Exception{
        EventManagerList list = new EventManagerList();
        list.addEventManager(new EventManager("O real","Test@gmail.com","orealzao","arealpass"));
        EventManagerList expectedList = new EventManagerList();
        assertNotEquals(list,expectedList);
    }
}
