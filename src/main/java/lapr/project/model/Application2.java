/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Application2 {
    
    private String description;
    private Event event;
    boolean decision;

    /**
     *
     * @param description
     * @param event
     * @param decision
     */
    public Application2(String description, Event event, boolean decision) {
        this.description = description;
        this.event = event;
        this.decision = decision;
    }
    
    @Override
    public String toString(){
        return "Description: " +description+ "\n" + event.toString() + "\nDecision: " +decision;
    }
    
    
}
