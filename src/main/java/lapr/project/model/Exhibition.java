package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Exhibition extends Event {

    private int invites;
    private StandRegistry standRegister;
    private ApplicationList applicationsList;

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param local
     * @param invites
     */
    public Exhibition(String title, String description, Date eventBegin, Date eventEnd, Location local,  int invites) {
        super(title, description, eventBegin, eventEnd, local);
        this.invites = invites;
        this.applicationsList= new ApplicationList();
        this.standRegister = new StandRegistry();
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationsList() {
        return applicationsList;
    }

    /**
     *
     * @param applicationsList
     */
    public void setApplicationsList(ApplicationList applicationsList) {
        this.applicationsList = applicationsList;
    }

    /**
     *
     * @return
     */
    public StandRegistry getStandRegister() {
        return standRegister;
    }

    /**
     *
     * @param standRegister
     */
    public void setStandRegister(StandRegistry standRegister) {
        this.standRegister = standRegister;
    }

}
