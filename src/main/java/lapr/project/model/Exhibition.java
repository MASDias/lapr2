package lapr.project.model;

import java.util.Date;
import lapr.project.registers.StandRegister;

/**
 *
 * @author
 */
public class Exhibition extends Event {

    private int invites;
    private StandRegister standRegister;

    public Exhibition() {
    }

    public Exhibition(int invites, StandRegister standList, String title, String description, Date eventBegin, Date eventEnd, Local local) {
        super(title, description, eventBegin, eventEnd, local);
        this.invites = invites;
        this.standRegister = standList;
    }

    

}
