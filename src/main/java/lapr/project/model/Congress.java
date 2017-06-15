package lapr.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Congress extends Event implements Serializable {

    private static final long serialVersionUID = 1;
    private WorkshopList workshopList;

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param eventSubmissionBegin
     * @param eventSubmissionEnd
     * @param local
     * @param invites
     */
    public Congress(String title, String description, Date eventBegin, Date eventEnd, Date eventSubmissionBegin, Date eventSubmissionEnd, Location local, int invites) {
        super(title, description, eventBegin, eventEnd, eventSubmissionBegin, eventSubmissionEnd, local, invites);
        this.workshopList = new WorkshopList();
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
