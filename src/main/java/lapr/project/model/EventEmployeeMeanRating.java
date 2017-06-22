/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;

/**
 *
 * @author MarioDias
 */
public class EventEmployeeMeanRating {
    private static final long serialVersionUID = 1;
    private String user;
    private float employeeMeanRating = 0;
    private float globalMeanRating = 0;
    private int counterAplicationEmployee = 0;
    private double[] deviation;
    private ArrayList<Float> employeeEvaluationList = new ArrayList<>();
    private EventRegistry eventRegistry;

    public EventEmployeeMeanRating(EventRegistry eventRegistry) {
        this.eventRegistry = eventRegistry;
        GlobalMeanRating();
    }

    public EventEmployeeMeanRating(String user, EventRegistry eventRegistry) {
        this.user = user;
        this.eventRegistry = eventRegistry;
        calculateMeanRatingEventEmployee();
    }

    private void calculateMeanRatingEventEmployee() {
        for (int i = 0; i < eventRegistry.size(); i++) {
            Event event = eventRegistry.getEvent(i);
            for (int j = 0; j < event.getApplicationsList().size(); j++) {
                Application application = event.getApplicationsList().getApplication(j);
                for (int k = 0; k < application.getReviewList().size(); k++) {
                    Review review = application.getReviewList().get(k);
                    if (review.getAssignment().getEventEmployee().getUsername().equals(user)) {
                        employeeEvaluationList.add(review.getMeanValue());
                        employeeMeanRating += review.getMeanValue();
                        counterAplicationEmployee++;
                    }
                }
            }
        }
        if (counterAplicationEmployee == 0) {
            counterAplicationEmployee = 1;
        }
        employeeMeanRating /= counterAplicationEmployee;
    }

    private void GlobalMeanRating() {
        int counter = 0;
        for (int i = 0; i < eventRegistry.size(); i++) {
            Event event = eventRegistry.getEvent(i);
            for (int j = 0; j < event.getApplicationsList().size(); j++) {
                Application a = event.getApplicationsList().getApplication(j);
                for (int k = 0; k < a.getReviewList().size(); k++) {
                    globalMeanRating += a.getReviewList().get(k).getMeanValue();
                    counter++;
                }
            }
        }
        if (counter == 0) {
            counter = 1;
        }
        globalMeanRating /= counter;
    }

    public ArrayList<Float> getEmployeeEvaluationList() {
        return employeeEvaluationList;
    }

    public double[] deviationArray(float mean) {
        deviation = new double[employeeEvaluationList.size()];
        for (int i = 0; i < employeeEvaluationList.size(); i++) {
            deviation[i] = Math.abs(employeeEvaluationList.get(i) - mean);
        }
        return deviation;
    }

    public float getEmployeeMeanRating() {
        return employeeMeanRating;
    }

    public int getCounterAplicationEmployee() {
        return counterAplicationEmployee;
    }

    public float getGlobalMeanRating() {
        return globalMeanRating;
    }

}
