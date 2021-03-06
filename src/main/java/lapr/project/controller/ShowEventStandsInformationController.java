/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.StandRegistry;

/**
 *
 * @author MarioDias
 */
public class ShowEventStandsInformationController {

    EventCenter eventCenter;

    public ShowEventStandsInformationController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public StandRegistry getStandRegistry() {
        return eventCenter.getStandRegistry();
    }

    public EventRegistry getEventRegistry() {
        return eventCenter.getEventRegistry();
    }
}
