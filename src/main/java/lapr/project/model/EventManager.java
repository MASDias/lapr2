/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManager {

    private User eventManager;

    /**
     *
     * @param eventManager
     */
    public EventManager(User eventManager) {
        this.eventManager = eventManager;
    }

    public User getEventManager() {
        return eventManager;
    }

    public String getUsername() {
        return eventManager.getUserName();
    }
    public String getEmail() {
        return eventManager.getEmail();
    }

    @Override
    public String toString() {
        return eventManager.toString();
    }
}
