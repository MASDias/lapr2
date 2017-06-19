/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ShowEventAcceptanceRateController {

    private EventCenter eventCenter;

    public ShowEventAcceptanceRateController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventsList() {
        return this.eventCenter.getEventRegistry();
    }

    public float calcularEventAcceptanceRate(Event event) {
        int counter = 0;
        float acceptanceRate = 0;
        
        for (int i = 0; i < event.getApplicationsList().size(); i++) {
            Application application = event.getApplicationsList().getApplication(i);
            if (application.isAccepted()) {
                counter++;
            }
        }
        System.out.println(counter);
        acceptanceRate = (counter)/(float)(event.getApplicationsList().size());
        
        return acceptanceRate;
    }
}
