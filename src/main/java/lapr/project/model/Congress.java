package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Congress extends Event {

    WorkshopList workshopList;

    public Congress(String title, String description, Date eventBegin, Date eventEnd, Local local) {
        super(title, description, eventBegin, eventEnd, local);
        this.workshopList=new WorkshopList();
    }

    public WorkshopList getWorkshopList() {
        return this.workshopList;
    }
    public void  setWorkshopList(WorkshopList workshopList) {
        this.workshopList = workshopList;
        
    }
}
