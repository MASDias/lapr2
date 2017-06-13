/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.OrganizersList;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class DefineOrganizerController {

    private EventCenter eventCenter;

    public DefineOrganizerController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }
    
    public UserRegistry getUsersList(){
        return eventCenter.getUserRegistry();
    }
    
    public EventRegistry getEventsList(){
        return eventCenter.getEventRegistry();
    }
    
    public OrganizersList getOrganizersList(){
        return eventCenter.getOrganizersList();
    }
}
