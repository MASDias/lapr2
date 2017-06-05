package lapr.project.model;

import java.util.Date;

/**
 *
 * @author
 */
public class Exhibition extends Event {

    private int invites;
    private StandRegistry standRegister;

    public Exhibition(int invites, StandRegistry standList, String title, String description, Date eventBegin, Date eventEnd, Local local, ApplicationsList applicationsList) {
        super(title, description, eventBegin, eventEnd, local, applicationsList);
        this.invites = invites;
        this.standRegister = standList;
    }

}
