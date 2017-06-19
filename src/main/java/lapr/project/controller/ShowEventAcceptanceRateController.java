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
    private int accepted;
    private int total;

    public ShowEventAcceptanceRateController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventsList() {
        return this.eventCenter.getEventRegistry();
    }

    public float calculateEventAcceptanceRate(Event event) {
        int acceptedCounter = 0;
        int totalCounter = 0;
        float acceptanceRate = 0;

        for (int i = 0; i < event.getApplicationsList().size(); i++) {
            Application application = event.getApplicationsList().getApplication(i);
            totalCounter++;
            if (application.isAccepted()) {
                acceptedCounter++;
            }
        }
        total = totalCounter;
        accepted = acceptedCounter;
        acceptanceRate = ((acceptedCounter) / (float) (totalCounter)) * 100;
        return acceptanceRate;
    }

    public int getAccepted() {
        return accepted;
    }

    public int getTotal() {
        return total;
    }
    
    
}
