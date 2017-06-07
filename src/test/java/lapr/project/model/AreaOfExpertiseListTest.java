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
public class AreaOfExpertiseListTest {
    @Test
    public void EnsureAddAreaOfExpertiseListMethodAddsExpertToList() {
        AreaOfExpertiseList list = new AreaOfExpertiseList();
        AreaOfExpertise areaexpertise = new AreaOfExpertise("Pedro Abrunhosa");
        AreaOfExpertise areaexpertise2 = new AreaOfExpertise("Gonçalo");
        list.addAreaOfExpertise(areaexpertise);
        list.addAreaOfExpertise(areaexpertise2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    @Test
    public void EnsureSameObjectsAreaOfExpertiseListIsEqual() {
        AreaOfExpertise areaexpertise = new AreaOfExpertise("Pedro Abrunhosa");
        AreaOfExpertiseList result = new AreaOfExpertiseList();
        result.addAreaOfExpertise(areaexpertise);
        assertEquals(result, result);
    }

    @Test
    public void EnsureSameObjectsAreaOfExpertiseListAreNotEqual() {
        AreaOfExpertise areaexpertise = new AreaOfExpertise("Pedro Abrunhosa");
        AreaOfExpertiseList result = new AreaOfExpertiseList();
        AreaOfExpertiseList expectedResult = new AreaOfExpertiseList();
        result.addAreaOfExpertise(areaexpertise);
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsAreaOfExpertiseListAreNotEqual() {
        AreaOfExpertise areaexpertise = new AreaOfExpertise("Pedro Abrunhosa");
        AreaOfExpertiseList result = new AreaOfExpertiseList();
        result.addAreaOfExpertise(areaexpertise);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetAreaOfExpertiseListIsEqual() {
        AreaOfExpertiseList list = new AreaOfExpertiseList();
        Expert expert = new Expert("miguel", list);
        AreaOfExpertiseList result = expert.getExpertiseAreas();
        AreaOfExpertiseList expectedResult = list;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetAreaOfExpertiseListIsNotEqual() {
        AreaOfExpertiseList list = new AreaOfExpertiseList();
        AreaOfExpertiseList list2 = new AreaOfExpertiseList();
        Expert expert = new Expert("miguel", list);
        AreaOfExpertiseList result = expert.getExpertiseAreas();
        AreaOfExpertiseList expectedResult = list2;
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureSetAreaOfExpertiseListIsEqual() {
        AreaOfExpertiseList result = new AreaOfExpertiseList();
        Expert expert = new Expert("miguel", result);
        
        expert.setExpertiseAreas(result);
        AreaOfExpertiseList expectedResult = expert.getExpertiseAreas();
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void EnsureSetAreaOfExpertiseListIsNotEqual() {
        AreaOfExpertiseList result = new AreaOfExpertiseList();
        AreaOfExpertiseList list = new AreaOfExpertiseList();
        Expert expert = new Expert("miguel", result);
        
        expert.setExpertiseAreas(result);
        AreaOfExpertiseList expectedResult = list;
        assertNotEquals(expectedResult, result);
    }
}
