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
import lapr.project.model.Statistics;

/**
 *
 * @author MarioDias
 */
public class DifferenceBetweenTheMeanDeviationAndTheoreticalValueController {

    EventCenter eventCenter;

    public DifferenceBetweenTheMeanDeviationAndTheoreticalValueController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    public EventRegistry getEventRegistry() {
        return eventCenter.getEventRegistry();
    }

    public EventEmployeeList getEmployeeList(int index) {
        return eventCenter.getEventRegistry().getEvent(index).getEventEmployeeList();
    }

    public EventEmployeeMeanRating EmployeeMeanRating(String user, EventRegistry eventRegistry) {
        return new EventEmployeeMeanRating(user, eventRegistry);
    }

    public EventEmployeeMeanRating GlobalMeanRating(EventRegistry eventRegistry) {
        return new EventEmployeeMeanRating(eventRegistry);
    }

    public Statistics getStatisticsValues(float significance, float theoreticalValue, int totalApplication, double[] values) {
        return new Statistics(significance, theoreticalValue, totalApplication, values);
    }
    
    public Statistics getStatisticsValuesCompare(double significance, float firstMean, float secondMean, int totalEmployeeApplicationOne, int totalEmployeeApplicationTwo, double[] valuesOne, double[] valuesTwo) {
        return new Statistics(significance, firstMean, secondMean, totalEmployeeApplicationOne, totalEmployeeApplicationTwo, valuesOne, valuesTwo);
    }
    
    
}
