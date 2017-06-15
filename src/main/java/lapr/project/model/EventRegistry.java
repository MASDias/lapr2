/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventRegistry implements Serializable {

    private static final long serialVersionUID = 1;
    private ArrayList<Event> eventsList;

    /**
     *
     */
    public EventRegistry() {
        this.eventsList = new ArrayList<>();
    }

    private boolean validate(Event event) {
        for (Event e : eventsList) {
            if (e.equals(event)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param event
     */
    public void addEvent(Event event) {
        if (validate(event)) {
            eventsList.add(event);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return eventsList.size();
    }

    /**
     *
     * @param index
     * @return
     */
    public Event getEvent(int index) {
        return eventsList.get(index);
    }

}
