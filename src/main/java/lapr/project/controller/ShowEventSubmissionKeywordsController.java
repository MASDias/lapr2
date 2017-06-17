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
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ShowEventSubmissionKeywordsController {
    private EventCenter eventCenter;
    
    public ShowEventSubmissionKeywordsController(EventCenter eventCenter){
        this.eventCenter = eventCenter;
    }
    
    public EventRegistry getEventsList(){
        return eventCenter.getEventRegistry();
    }
}
