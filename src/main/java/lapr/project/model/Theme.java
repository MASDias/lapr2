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
public class Theme implements Serializable {

    private static final long serialVersionUID = 1;
    private String theme;

    /**
     *
     * @param theme
     */
    public Theme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Theme: " + theme;
    }

}
