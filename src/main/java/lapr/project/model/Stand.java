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

    private String m_sName;
    private double area;

    public Stand(String m_sName, double area) {
        this.m_sName = m_sName;
        this.area = area;
    }

    public Stand() {
    }
}
