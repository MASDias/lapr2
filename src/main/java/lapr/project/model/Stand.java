/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Stand implements Serializable {

    private static final long serialVersionUID = 1;
    private String name;
    private float area;

    /**
     *
     * @param name
     * @param area
     */
    public Stand(String name, float area) {
        this.name = name;
        this.area = area;
    }

    /**
     *
     * @return
     */
    public float getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nArea: " + area;
    }

}
