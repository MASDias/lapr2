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
 * @author Paulo Moreira <1151172@isep.ipp.pt>
 */
public class WorkshopListTest {
    @Test
    public void EnsureAddWorkshopListMethodAddsExpertToList() {
        WorkshopList list = new WorkshopList();
        ExpertsList expert = new ExpertsList();
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", expert,theme);
        Workshop workshop2 = new Workshop("Gonçalo", expert,theme);
        list.addWorkshop(workshop);
        list.addWorkshop(workshop2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    @Test
    public void EnsureSameObjectsWorkshopListIsEqual() {
        ExpertsList expert = new ExpertsList();
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", expert ,theme);
        WorkshopList result = new WorkshopList();
        result.addWorkshop(workshop);
        assertEquals(result, result);
    }

    @Test
    public void EnsureSameObjectsWorkshopListAreNotEqual() {
        ExpertsList expert = new ExpertsList();
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", expert , theme);
        WorkshopList result = new WorkshopList();
        WorkshopList expectedResult = new WorkshopList();
        result.addWorkshop(workshop);
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsWorkshopListAreNotEqual() {
        ExpertsList expert = new ExpertsList();
        Theme theme = new Theme("Formacao");
        Workshop workshop = new Workshop("Pedro Abrunhosa", expert , theme);
        WorkshopList result = new WorkshopList();
        result.addWorkshop(workshop);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetWorkshopListIsEqual() {
        WorkshopList list = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", list, null, null, null, null, null);
        WorkshopList result = congress.getWorkshopList();
        WorkshopList expectedResult = list;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetWorkshopListIsNotEqual() {
        WorkshopList list = new WorkshopList();
        WorkshopList list2 = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", list, null, null, null, null, null);

        WorkshopList result = congress.getWorkshopList();
        WorkshopList expectedResult = list2;
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetWorkshopListIsEqual() {
        WorkshopList result = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", result, null, null, null, null, null);
        
        congress.setWorkshopList(result);
        WorkshopList expectedResult = congress.getWorkshopList();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void EnsureSetWorkshopListIsNotEqual() {
        WorkshopList result = new WorkshopList();
        WorkshopList list = new WorkshopList();
        Congress congress = new Congress("blabla", "bla bla", result, null, null, null, null, null);
        
        congress.setWorkshopList(result);
        WorkshopList expectedResult = list;
        assertNotEquals(expectedResult, result);
    }
}
