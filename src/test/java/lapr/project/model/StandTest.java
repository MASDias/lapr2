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
public class StandTest {

    @Test
    public void EnsureSameObjectStandIsEqual() {
        Stand stand = new Stand("stand", 500);
        assertEquals(stand, stand);
    }

    @Test
    public void EnsureSameObjectsStandAreNotEqual() {
        Stand stand = new Stand("stand", 500);
        Stand expected = new Stand("stand", 700);
        assertNotEquals(stand, expected);
    }

    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() {
        Stand stand = new Stand("stand", 500);
        Object expectedResult = new Object();
        assertNotEquals(stand, expectedResult);
    }

    @Test
    public void EnsureToStringIsEqual() {
        Stand stand = new Stand("stand", 500);
        String result = stand.toString();
        String expectedResult = "Name: stand\nArea: 500.0";
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureToStringIsNotEqual() {
        Stand stand = new Stand("stand", 500);
        String result = stand.toString();
        String expectedResult = "Name: stand\nArea: 700";
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetAreaIsEqual() {
        Stand stand = new Stand("stand", 500);
        float expectedResult = 700;
        stand.setArea(700);
        float result = stand.getArea();
        assertEquals(result, expectedResult, 0.00);
    }

    @Test
    public void EnsureSetAreaIsNotEqual() {
        Stand stand = new Stand("stand", 500);
        float expectedResult = 700;
        stand.setArea(700);
        float result = stand.getArea();
        assertEquals(result, expectedResult, 0.00);
    }

    @Test
    public void EnsureGetAreaIsEqual() {
        Stand stand = new Stand("stand", 500);
        float expectedResult = 500;
        float result = stand.getArea();
        assertEquals(result, expectedResult, 0.00);
    }

    @Test
    public void EnsureGetAreaIsNotEqual() {
        Stand stand = new Stand("stand", 500);
        float expectedResult = 700;
        float result = stand.getArea();
        assertNotEquals(result, expectedResult, 0.00);
    }
}
