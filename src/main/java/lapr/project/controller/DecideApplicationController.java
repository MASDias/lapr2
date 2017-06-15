package lapr.project.controller;

import lapr.project.model.Application;
import lapr.project.model.ApplicationList;
import lapr.project.model.EventEmployee;

/**
 *
 * @author MarioDias
 */
public class DecideApplicationController {

    EventEmployee eventEmployee;

    /**
     *
     * @param eventEmployee
     */
    public DecideApplicationController(EventEmployee eventEmployee) {
        this.eventEmployee = eventEmployee;
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationList() {
        return eventEmployee.getApplicationList();
    }

    /**
     *
     * @param index
     * @return
     */
    public Application getApplication(int index) {
        return eventEmployee.getApplicationList().getApplication(index);
    }
}
