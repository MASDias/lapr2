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
public class EnterpriseTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectStandIsEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        assertEquals(enterprise, enterprise);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsStandAreNotEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        Enterprise expected = new Enterprise("Paulo", null, null, 0, 0);
        assertNotEquals(enterprise, expected);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        Object expectedResult = new Object();
        assertNotEquals(enterprise, expectedResult);
    }
    @Test
   public void EnsureAddUserMethodAddsenterpriseToListIndex() throws Exception {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        String result = enterprise.getName();
        String expectedResult = "Paulo";
        assertEquals(result, expectedResult);
    }
}
