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
public class ExpertTest {
    
    
    @Test
    public void EnsureSameObjectExpertIsEqual() {
        AreaOfExpertiseList areasOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("gonçalo", areasOfExpertise);
        assertEquals(expert, expert);
    }

    @Test
    public void EnsureSameObjectsExpertAreNotEqual() {
        AreaOfExpertiseList areasOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("mario", areasOfExpertise);
        Expert expectedResult = new Expert("Z", areasOfExpertise);
        assertNotEquals(expert, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsExpertAreNotEqual() {
        AreaOfExpertiseList areasOfExpertise = new AreaOfExpertiseList();
        Expert expert = new Expert("Z", areasOfExpertise);
        Object expectedResult = new Object();
        assertNotEquals(expert, expectedResult);
    }
}
