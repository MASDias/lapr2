package lapr.project.model;

import java.util.Date;

/**
 *
 * @author
 */
public class Exhibition extends Event {

    private int invites;
    private StandRegistry standRegister;

    public Exhibition(String title, String description, Date eventBegin, Date eventEnd, Local local, Keyword keywords, ApplicationsList applicationsList, int invites, StandRegistry standRegister) {
        super(title, description, eventBegin, eventEnd, local, keywords, applicationsList);
        this.invites = invites;
        this.standRegister = standRegister;
    }

}
