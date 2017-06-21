/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.Statistics;

/**
 *
 * @author MarioDias
 */
public class EventClassAcceptanceRateController {

    EventCenter eventCenter;

    public EventClassAcceptanceRateController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventRegistry() {
        return eventCenter.getEventRegistry();
    }

    public Statistics setStatistics(double significance, int total, float AcceptanceRate) {
        return new Statistics(significance, total, AcceptanceRate);
    }

    public Statistics setStatisticsCompare(double significance, int firsTotal, int secontTotal, float firstProporcion, float secondProporcion) {
        return new Statistics(significance, firsTotal, secontTotal, firstProporcion, secondProporcion);
    }

}
