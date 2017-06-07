package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Congress extends Event {

    WorkshopList workshopList;

    public Congress(String title, String description, WorkshopList workshopList, Date eventBegin, Date eventEnd, Local local, Keyword keywords, ApplicationsList applicationsList) {
        super(title, description, eventBegin, eventEnd, local, keywords, applicationsList);
        this.workshopList=workshopList;
    }

    public WorkshopList getWorkshopList() {
        return this.workshopList;
    }
    public void  setWorkshopList(WorkshopList workshopList) {
        this.workshopList = workshopList;
        
    }
}
