package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 
 */
public class Exhibition extends Event{

    public Exhibition() {
    }

    public Exhibition(String title, String description, Date eventBegin, Date eventEnd, Local local) {
        super(title, description, eventBegin, eventEnd, local);
    }
    
}
