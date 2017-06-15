package lapr.project.controller;

import lapr.project.model.Application;
import lapr.project.model.ApplicationList;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.EventRegistry;
import lapr.project.model.UserRegistry;

/**
 *
 * @author MarioDias
 */
public class DecideApplicationController {

    EventEmployee eventEmployee;
    EventCenter eventCenter;
    /**
     *
     * @param eventEmployee
     */
    public DecideApplicationController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationList() {
        return eventCenter.getApplicationList();
    }

    public UserRegistry getUsersList(){
        return eventCenter.getUserRegistry();
    }
    /**
     *
     * @param index
     * @return
     */
    public Application getApplication(int index) {
        return eventCenter.getApplicationList().getApplication(index);
    }
    
    public EventRegistry getEventsList(){
        return eventCenter.getEventRegistry();
    }
}
