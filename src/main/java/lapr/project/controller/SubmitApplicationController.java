package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.ProductList;
import lapr.project.model.StandRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class SubmitApplicationController {

    EventCenter eventCenter;

    /**
     *
     * @param eventCenter
     */
    public SubmitApplicationController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    /**
     *
     * @return
     */
    public StandRegistry getStandRegistry() {
        return this.eventCenter.getStandRegistry();
    }

    /**
     *
     * @return
     */
    public ProductList getProductList() {
        return this.eventCenter.getProductList();
    }

    /**
     *
     * @return
     */
    public EventRegistry getEventRegistry() {
        return this.eventCenter.getEventRegistry();
    }
}
