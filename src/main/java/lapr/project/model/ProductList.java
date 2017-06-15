/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarioDias
 */
public class ProductList implements Serializable{
    private List<Product> productList;
private static final long serialVersionUID = 1;
    /**
     *
     */
    public ProductList() {
        this.productList = new ArrayList<>();
    }

    
    private boolean validate(Product product) {
        for (Product u : productList) {
            if (u.equals(product)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param product
     */
    public void addProduct(Product product) {
        if (validate(product)) {
            productList.add(product);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return productList.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public Product getProduct(int index) {
        return productList.get(index);
    }
}
