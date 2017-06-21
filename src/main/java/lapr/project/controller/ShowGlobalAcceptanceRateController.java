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
public class ShowGlobalAcceptanceRateController {

    private EventCenter eventCenter;
    private int total;
    private int accepted;

    public ShowGlobalAcceptanceRateController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventList() {
        return eventCenter.getEventRegistry();
    }

    public float calculateEventAcceptanceRate(EventRegistry eventList) {
        int counterAccepted = 0;
        int counterTotal = 0;
        float acceptanceRate = 0;

        for (int i = 0; i < eventList.size(); i++) {
            Event event = eventList.getEvent(i);
            for (int j = 0; j < event.getApplicationsList().size(); j++) {
                if (event.getApplicationsList().size() > 0) {
                    Application application = event.getApplicationsList().getApplication(j);
                    counterTotal++;
                    if (application.isDecision()) {
                        counterAccepted++;
                    }
                } else {
                    counterTotal = 0;
                }
            }
        }
        if (counterTotal == 0) {
            counterTotal = 1;
        }
        acceptanceRate = ((counterAccepted) / (float) (counterTotal)) * 100;
        total = counterTotal;
        accepted = counterAccepted;

        return acceptanceRate;
    }

    public int getTotal() {
        return total;
    }

    public int getAccepted() {
        return accepted;
    }

}
