package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Event {
    
    private String title;
    private String description;
    private Date eventBegin;
    private Date eventEnd;
    private Local local;

    public Event() {
        
    }

    public Event(String title, String description, Date eventBegin, Date eventEnd, Local local) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventEnd = eventEnd;
        this.local = local;
    }

}
