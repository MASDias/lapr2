package lapr.project.model;

import java.util.Date;

/**
 *
 * @author
 */
public class Exhibition extends Event {

    private int invites;
    private Stand stand;

    public Exhibition() {
    }

    public Exhibition(int invites, Stand stand, String title, String description, Date eventBegin, Date eventEnd, Local local) {
        super(title, description, eventBegin, eventEnd, local);
        this.invites = invites;
        this.stand = stand;
    }

    

}
