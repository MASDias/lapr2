/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Application2 {

    private String description;
    private Event event;
    private Evaluation evaluation;
    private Enterprise enterprise;

    public Application2(Enterprise enterprise, Event event) {
        this.enterprise = enterprise;
        this.event = event;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return enterprise.toString() + "\n" + event.toString();
    }

}
