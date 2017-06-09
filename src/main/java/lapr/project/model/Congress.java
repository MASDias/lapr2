package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Congress extends Event {

    StandRegistry standRegistry;
    WorkshopList workshopList;
    ApplicationList applicationList;

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param local
     */
    public Congress(String title, String description, Date eventBegin, Date eventEnd, Location local) {
        super(title, description, eventBegin, eventEnd, local);
        this.workshopList = new WorkshopList();
        this.applicationList = new ApplicationList();
        this.standRegistry = new StandRegistry();
    }

    /**
     *
     * @return
     */
    public WorkshopList getWorkshopList() {
        return this.workshopList;
    }

    /**
     *
     * @param workshopList
     */
    public void setWorkshopList(WorkshopList workshopList) {
        this.workshopList = workshopList;
    }
}
