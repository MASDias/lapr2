/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Stand implements Serializable {

    private String name;
    private double area;

    public Stand() {
    }

    public Stand(String name, double area) {
        this.name = name;
        this.area = area;
    }

}
