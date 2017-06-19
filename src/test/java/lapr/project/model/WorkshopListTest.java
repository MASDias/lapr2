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
public class WorkshopListTest {

    /**
     *
     */
    @Test
    public void EnsureAddWorkshopListMethodAddsExpertToList() {
        WorkshopList list = new WorkshopList();
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", theme);
        Workshop workshop2 = new Workshop("Gonçalo", theme);
        list.addWorkshop(workshop);
        list.addWorkshop(workshop2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsWorkshopListIsEqual() {
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", theme);
        WorkshopList result = new WorkshopList();
        result.addWorkshop(workshop);
        assertEquals(result, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsWorkshopListAreNotEqual() {
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", theme);
        WorkshopList result = new WorkshopList();
        WorkshopList expectedResult = new WorkshopList();
        result.addWorkshop(workshop);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsWorkshopListAreNotEqual() {
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", theme);
        WorkshopList result = new WorkshopList();
        result.addWorkshop(workshop);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetWorkshopListIsEqual() {
        WorkshopList list = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", null, null, null, null, null, 100);
        congress.setWorkshopList(list);
        WorkshopList result = congress.getWorkshopList();
        WorkshopList expectedResult = list;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetWorkshopListIsNotEqual() {
        WorkshopList list = new WorkshopList();
        WorkshopList list2 = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", null, null, null, null, null, 100);
        congress.setWorkshopList(list);
        WorkshopList result = congress.getWorkshopList();
        WorkshopList expectedResult = list2;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetWorkshopListIsEqual() {
        WorkshopList result = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", null, null, null, null, null, 100);

        congress.setWorkshopList(result);
        WorkshopList expectedResult = congress.getWorkshopList();
        assertEquals(expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSetWorkshopListIsNotEqual() {
        WorkshopList result = new WorkshopList();
        WorkshopList list = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", null, null, null, null, null, 100);

        congress.setWorkshopList(result);
        WorkshopList expectedResult = list;
        assertNotEquals(expectedResult, result);
    }
     @Test
    public void EnsureAddLocalMethodAddsWorkshopListNotValid() throws Exception {
         WorkshopList result = new WorkshopList();
        Workshop workshop = new Workshop("asdsdsa",null);
        result.addWorkshop(workshop);
        result.addWorkshop(workshop);
        int size = result.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }
}
