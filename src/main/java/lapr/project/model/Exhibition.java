package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Exhibition extends Event {

    private int invites;
    private StandRegistry standRegister;
    private ApplicationsList applicationsList;

    public Exhibition(String title, String description, Date eventBegin, Date eventEnd, Local local,  int invites) {
        super(title, description, eventBegin, eventEnd, local);
        this.invites = invites;
        this.applicationsList= new ApplicationsList();
        this.standRegister = new StandRegistry();
    }

    public ApplicationsList getApplicationsList() {
        return applicationsList;
    }

    public void setApplicationsList(ApplicationsList applicationsList) {
        this.applicationsList = applicationsList;
    }

    public StandRegistry getStandRegister() {
        return standRegister;
    }

    public void setStandRegister(StandRegistry standRegister) {
        this.standRegister = standRegister;
    }

}
