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
        Expert expert = new Expert("gonçalo", null);
        assertEquals(expert, expert);
    }

    @Test
    public void EnsureSameObjectsExpertAreNotEqual() {
        Expert expert = new Expert("mario", null);
        User expectedResult = new User("Z", "c", "b", "a");
        assertNotEquals(expert, expectedResult);
    }

    @Test
    public void EnsureDifferentObjectsExpertAreNotEqual() {
        Expert expert = new Expert("Z", null);
        Object expectedResult = new Object();
        assertNotEquals(expert, expectedResult);
    }
}
