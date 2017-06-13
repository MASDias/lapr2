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
public class ProjectListTest {
      @Test
    public void EnsureAddProjectMethodAddsLocalToList() throws Exception {

        ProductList list = new ProductList();
        Product p1 = new Product ("box");
        Product p2 = new Product ("stick");
        list.addProduct(p1);
        list.addProduct (p2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddProductMethodAddsUserToListNotValid() throws Exception {
        ProductList result = new ProductList();
        Product product = new Product ("box");
        result.addProduct (product);
        result.addProduct (product);
        int size = result.size();
        int expectedResult = 1;
        assertEquals(size, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddProductMethodAddsUserToListIndex() throws Exception {
        ProductList list = new ProductList();
        Product result = new Product ("box");
        list.addProduct(result);
        Product expectedResult = list.getProduct(0);
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsProductListAreEqual() throws Exception {

        ProductList list = new ProductList();
        Product product = new Product ("box");

        list.addProduct (product);
        assertEquals(list, list);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsProductListAreNotEqual() throws Exception {
        Product location = new Product ("box");
        ProductList p1 = new ProductList();
        ProductList p2 = new ProductList();
        p1.addProduct(location);
        assertNotEquals(p1, p2);
    }

}
