/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;

/**
 *
 * @author MarioDias
 */
public class ShowEventStandsInformationController {
    EventCenter eventCenter;

    public ShowEventStandsInformationController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }
    
    public EventRegistry getEventList(){
        return eventCenter.getEventRegistry();
    }
}
