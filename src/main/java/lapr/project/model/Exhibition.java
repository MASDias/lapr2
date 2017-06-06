package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
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
