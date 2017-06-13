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
public class ProductTest {
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsProductIsEqual() throws Exception {
        Product product = new Product("box");
        assertEquals(product, product);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsProcuctAreNotEqual() throws Exception {
        Product product1 = new Product("stick");
        Product product2 = new Product("box");
        assertNotEquals(product1, product2);
    }
      /**
     *
     */
    @Test
    public void EnsureDifferentObjectsProductIsNotEqual() {
        Product product = new Product("box");
        Object expectedResult = new Object();
        assertNotEquals(product, expectedResult);
    }
}
