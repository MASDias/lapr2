/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManager implements Serializable {

    private static final long serialVersionUID = 1;
    private User eventManager;

    /**
     *
     * @param eventManager
     */
    public EventManager(User eventManager) {
        this.eventManager = eventManager;
    }

    /**
     *
     * @return
     */
    public User getEventManager() {
        return eventManager;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return eventManager.getUserName();
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return eventManager.getEmail();
    }

    @Override
    public String toString() {
        return eventManager.toString();
    }
}
