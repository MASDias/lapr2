/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class StandRegistryTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddApplicationMethodAddsStandToList() throws Exception {
        StandRegistry list = new StandRegistry();
        Stand s1 = new Stand("stand 1", 500);
        Stand s2 = new Stand("stand 2", 600);
        list.addStand(s1);
        list.addStand(s2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsStandRegistryIsEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry result = new StandRegistry();
        result.addStand(s1);
        assertEquals(result, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsStandResgistryAreNotEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry result = new StandRegistry();
        StandRegistry expectedResult = new StandRegistry();
        result.addStand(s1);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsStandResgistryAreNotEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry result = new StandRegistry();
        result.addStand(s1);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureValidate() {
        StandRegistry list = new StandRegistry();
        Stand stand = new Stand("adsda", 312312);
        list.addStand(stand);
        list.addStand(stand);
        int result = list.size();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureIndex() throws Exception {
        StandRegistry list = new StandRegistry();
        Stand result = new Stand("adsda", 312312);
        list.addStand(result);
        Stand expectedResult = list.getStand(0);
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureSort() throws Exception {
        StandRegistry list = new StandRegistry();
        Stand result = new Stand("adsda", 10);
        Stand result2 = new Stand("adsda", 20);
        Stand result3 = new Stand("adsda", 30);
        Stand result4 = new Stand("adsda", 30);
        list.addStand(result2);
        list.addStand(result4);
        list.addStand(result3);
        list.addStand(result);
        list.sort();
        StandRegistry expe = new StandRegistry();
        expe = list;
        float results = list.getStand(0).getArea();
        float expectedResult = 10;
        assertEquals(results, expectedResult, 0);
    }
}
