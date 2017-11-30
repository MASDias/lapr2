/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.EventEmployeeMeanRating;
import lapr.project.model.EventRegistry;

/**
 *
 * @author MarioDias
 */
public class MeanDeviationBetweenEventEmployeesAverageRatingsController {

    private EventCenter eventCenter;

    public MeanDeviationBetweenEventEmployeesAverageRatingsController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventRegistry() {
        return eventCenter.getEventRegistry();
    }

    public EventEmployeeList getEventEmployeeList(int index) {
        return eventCenter.getEventRegistry().getEvent(index).getEventEmployeeList();
    }

    public EventEmployeeMeanRating getGlobalMeanRating(EventRegistry eventRegistry) {
        return new EventEmployeeMeanRating(eventRegistry);
    }

    public EventEmployeeMeanRating getEmployeeMeanRating(EventRegistry eventRegistry, String user) {
        return new EventEmployeeMeanRating(user, eventRegistry);
    }

    
}
