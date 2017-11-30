package lapr.project.controller;

import lapr.project.model.ApplicationList;
import lapr.project.model.EventCenter;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ApplicationsListController {
    private EventCenter eventCenter;

    /**
     *
     * @param eventCenter
     */
    public ApplicationsListController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationList() {
        return eventCenter.getApplicationList();
    } 
}
