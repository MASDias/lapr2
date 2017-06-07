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
public class AreaOfExpertiseTests {
     @Test
    public void EnsureSameObjectStandIsEqual() {
        AreaOfExpertise areaofexpertise = new AreaOfExpertise("dasda");
        assertEquals(areaofexpertise, areaofexpertise);
    }

    @Test
    public void EnsureSameObjectsStandAreNotEqual() {
        AreaOfExpertise areaofexpertise = new AreaOfExpertise("Paulo");
        AreaOfExpertise expected = new AreaOfExpertise("Paulo");
        assertNotEquals(areaofexpertise, expected);
    }

    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() {
        AreaOfExpertise areaofexpertise = new AreaOfExpertise("Paulo");
        Object expectedResult = new Object();
        assertNotEquals(areaofexpertise, expectedResult);
    }
}
