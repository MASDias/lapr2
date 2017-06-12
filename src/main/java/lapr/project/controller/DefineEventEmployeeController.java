/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;


import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.EventRegistry;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class DefineEventEmployeeController {
    private EventCenter eventCenter;
    
    public DefineEventEmployeeController(EventCenter eventCenter){
        this.eventCenter = eventCenter;
    }
    
    public UserRegistry getUsersList(){
        return eventCenter.getUserRegistry();
    }
    
    public EventEmployeeList getEmployeesList(){
        return eventCenter.getEventEmployeeList();
    }
    
    public EventRegistry getEventList(){
        return eventCenter.getEventRegistry();
    }
}
