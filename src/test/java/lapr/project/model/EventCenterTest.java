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
public class EventCenterTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectIsEqual() {
        EventCenter eventCenter = new EventCenter();
        assertEquals(eventCenter, eventCenter);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsAreNotEqual() {
        EventCenter eventCenter = new EventCenter();
        EventCenter expected = new EventCenter();
        
        assertNotEquals(eventCenter, expected);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsAreNotEqual() {
       EventCenter eventCenter = new EventCenter();
        Object expectedResult = new Object();
        assertNotEquals(eventCenter, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetEmployeeListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventEmployeeList result = new EventEmployeeList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventEmployee ee = new EventEmployee(u1, 3);
        result.addEmployee(ee);
        ec.setEventEmployeeList(result);
        EventEmployeeList expectedResult = ec.getEventEmployeeList();

        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetEmployeeListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventEmployeeList result = new EventEmployeeList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventEmployee ee = new EventEmployee(u1, 3);
        result.addEmployee(ee);
        ec.setEventEmployeeList(result);
        EventEmployeeList expectedResult = ec.getEventEmployeeList();

        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetApplicationListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        ApplicationList result = new ApplicationList();
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application ee = new Application(true, e, 100, "description", 0.0f);
        result.addApplication(ee);
        ec.setApplicationList(result);
        ApplicationList expectedResult = ec.getApplicationList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetApplicationListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        ApplicationList result = new ApplicationList();
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application ee = new Application(true, e, 100, "description", 0.0f);
        result.addApplication(ee);
        ec.setApplicationList(result);
        ApplicationList expectedResult = ec.getApplicationList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetEventManagerListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventManagerList result = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager ee = new EventManager(u1);
        result.addEventManager(ee);
        ec.setEventManagerList(result);
        EventManagerList expectedResult = ec.getEventManagerList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetEventManagerListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventManagerList result = new EventManagerList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        EventManager ee = new EventManager(u1);
        result.addEventManager(ee);
        ec.setEventManagerList(result);
        EventManagerList expectedResult = ec.getEventManagerList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetEventRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventRegistry result = new EventRegistry();
        Event ee = new Event("Miguel", "miguel@gmail.com,", null, null, null, null, null, 100);
        result.addEvent(ee);
        ec.setEventRegistry(result);
        EventRegistry expectedResult = ec.getEventRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetEventRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        EventRegistry result = new EventRegistry();
        Event ee = new Event("Miguel", "miguel@gmail.com,", null, null, null, null, null, 100);
        result.addEvent(ee);
        ec.setEventRegistry(result);
        EventRegistry expectedResult = ec.getEventRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetLocationListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        LocationList result = new LocationList();
        Location u1 = new Location("Miguel");
        result.addLocal(u1);
        ec.setLocationList(result);
        LocationList expectedResult = ec.getLocationList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetLocationListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        LocationList result = new LocationList();
        Location u1 = new Location("Miguel");
        result.addLocal(u1);
        ec.setLocationList(result);
        LocationList expectedResult = ec.getLocationList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetOrganizersListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        OrganizersList result = new OrganizersList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        Organizer u2 = new Organizer(u1);
        result.addOrganizer(u2);
        ec.setOrganizersList(result);
        OrganizersList expectedResult = ec.getOrganizersList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetOrganizersListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        OrganizersList result = new OrganizersList();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        Organizer u2 = new Organizer(u1);
        result.addOrganizer(u2);
        ec.setOrganizersList(result);
        OrganizersList expectedResult = ec.getOrganizersList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetStandRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        StandRegistry result = new StandRegistry();
        Stand ee = new Stand("Miguel", 546);
        result.addStand(ee);
        ec.setStandRegistry(result);
        StandRegistry expectedResult = ec.getStandRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetStandRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        StandRegistry result = new StandRegistry();
        Stand ee = new Stand("Miguel", 546);
        result.addStand(ee);
        ec.setStandRegistry(result);
        StandRegistry expectedResult = ec.getStandRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetUserRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        UserRegistry result = new UserRegistry();
        User ee = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        result.addUser(ee);
        ec.setUserRegistry(result);
        UserRegistry expectedResult = ec.getUserRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetUserRegistryListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        UserRegistry result = new UserRegistry();
        User ee = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        result.addUser(ee);
        ec.setUserRegistry(result);
        UserRegistry expectedResult = ec.getUserRegistry();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetProductListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        ProductList result = new ProductList();
        Product product = new Product("box");
        result.addProduct(product);
        ec.setProductList(result);
        ProductList expectedResult = ec.getProductList();

        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetProductListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        ProductList result = new ProductList();
        Product product = new Product("box");
        result.addProduct(product);
        ec.setProductList(result);
        ProductList expectedResult = ec.getProductList();

        assertEquals(result, expectedResult);
    }
     @Test
    public void EnsureSetWorkshopListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        WorkshopList result = new WorkshopList();
        Theme theme = new Theme("theme");
        Workshop workshop = new Workshop("workshop",theme);
         result.addWorkshop(workshop);
        ec.setWorkshopList(result);
        WorkshopList expectedResult = ec.getWorkshopList();
        assertEquals(result, expectedResult);
       
    }
     @Test
    public void EnsureGetWorkshopListEventCenterListMethod() {
        EventCenter ec = new EventCenter();
        Theme theme = new Theme("theme");
        Workshop workshop = new Workshop("workshop",theme);
        WorkshopList result = new WorkshopList();        
        result.addWorkshop(workshop);
        ec.setWorkshopList(result);
        WorkshopList expectedResult = ec.getWorkshopList();
        assertEquals(result, expectedResult);
    }
}
