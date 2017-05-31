package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 
 */
public class Exposition extends Event{

    public Exposition() {
    }

    public Exposition(String title, String description, Date eventBegin, Date eventEnd, Local local) {
        super(title, description, eventBegin, eventEnd, local);
    }
    
}
