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
public class Assignment implements Serializable{

    private static final long serialVersionUID = 1;
    private EventEmployee eventEmployee;

    public Assignment(EventEmployee eventEmployee) {
        this.eventEmployee = eventEmployee;
    }

    public EventEmployee getEventEmployee() {
        return eventEmployee;
    }

    public void setEventEmployee(EventEmployee eventEmployee) {
        this.eventEmployee = eventEmployee;
    }

    
}
