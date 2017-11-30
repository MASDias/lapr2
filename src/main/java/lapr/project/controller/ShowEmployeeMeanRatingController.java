/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.EventRegistry;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ShowEmployeeMeanRatingController {
    private EventCenter eventCenter;
    
    public ShowEmployeeMeanRatingController(EventCenter eventCenter){
        this.eventCenter = eventCenter;
    }
    
    public EventEmployeeList getEmployeeList(){
        return eventCenter.getEventEmployeeList();
    }
    
    public EventRegistry getEventsList(){
        return eventCenter.getEventRegistry();
    }
}
