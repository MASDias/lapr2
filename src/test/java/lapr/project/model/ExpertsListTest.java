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
public class ExpertsListTest {

    /**
     *
     */
    @Test
    public void EnsureAddExpertMethodAddsExpertToList() {
        ExpertsList list = new ExpertsList();
        AreaOfExpertiseList areaOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("Pedro Abrunhosa", areaOfExpertise);
        Expert expert2 = new Expert("Gonçalo", areaOfExpertise);
        list.addExpert(expert);
        list.addExpert(expert2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsExpertsListIsEqual() {
        AreaOfExpertiseList areaOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("Pedro Abrunhosa", areaOfExpertise);
        ExpertsList result = new ExpertsList();
        result.addExpert(expert);
        assertEquals(result, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsExpertsListAreNotEqual() {
        AreaOfExpertiseList areaOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("Pedro Abrunhosa", areaOfExpertise);
        ExpertsList result = new ExpertsList();
        ExpertsList expectedResult = new ExpertsList();
        result.addExpert(expert);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsExpertsListAreNotEqual() {
        AreaOfExpertiseList areaOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("Pedro Abrunhosa", areaOfExpertise);
        ExpertsList result = new ExpertsList();
        result.addExpert(expert);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetExpertsListIsEqual() {
        ExpertsList list = new ExpertsList();
        Workshop workshop = new Workshop("Workshop", list, null);

        ExpertsList result = workshop.getExpertsList();
        ExpertsList expectedResult = list;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetExpertsListIsNotEqual() {
        ExpertsList list = new ExpertsList();
        ExpertsList list2 = new ExpertsList();
        Workshop workshop = new Workshop("Workshop", list, null);

        ExpertsList result = workshop.getExpertsList();
        ExpertsList expectedResult = list2;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetExpertsListIsEqual() {
        ExpertsList result = new ExpertsList();
        Workshop workshop = new Workshop("Workshop", null, null);
        
        workshop.setExpertsList(result);
        ExpertsList expectedResult = workshop.getExpertsList();
        assertEquals(expectedResult, result);
    }
    
    /**
     *
     */
    @Test
    public void EnsureSetExpertsListIsNotEqual() {
        ExpertsList result = new ExpertsList();
        ExpertsList list = new ExpertsList();
        Workshop workshop = new Workshop("Workshop", null, null);
        
        workshop.setExpertsList(result);
        ExpertsList expectedResult = list;
        assertNotEquals(expectedResult, result);
    }
}
