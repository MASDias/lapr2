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
public class WorkshopTests {

    /**
     *
     */
    @Test
    public void EnsureSameObjectWorkshopIsEqual() {
        Theme theme = new Theme("Test Theme");
        Workshop result = new Workshop("Test", null, theme);
        assertEquals(result, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsWorkshopAreNotEqual() {
        Theme theme = new Theme("Test Theme");
        Workshop result = new Workshop("Test", null, theme);
        Workshop expectedResult = new Workshop("Test2", null, null);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsWorkshopAreNotEqual() {
        Theme theme = new Theme("Test Theme");
        Workshop result = new Workshop("Test", null, theme);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
        Theme theme = new Theme("Test Theme");
        Workshop workshop = new Workshop("Test", null, theme);
        String result = workshop.toString();
        String expectedResult = "Workshop name: Test Theme: Test Theme";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        Theme theme = new Theme("Test Theme");
        Workshop workshop = new Workshop("Test", null, theme);
        String result = workshop.toString();
        String expectedResult = "Workshop name: Error Theme: Test Theme";
        assertNotEquals(result, expectedResult);
    }
}
