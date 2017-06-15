/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author MarioDias
 */
public class Product implements Serializable{
    String productName;
private static final long serialVersionUID = 1;
    /**
     *
     * @param productName
     */
    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product name:" + productName;
    }
}
