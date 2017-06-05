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
    private ApplicationsList applicationsList;

    public Event(String title, String description, Date eventBegin, Date eventEnd, Local local,ApplicationsList applicationsList ) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventEnd = eventEnd;
        this.local = local;
        this.applicationsList = applicationsList;
    }

    public ApplicationsList getApplicationsList() {
        return applicationsList;
    }
    
    
    @Override
    public String toString(){
        return "Title: " +title+"\nDescription: "+description+"\nDate Begin: "+eventBegin.toString().substring(0, 10)+"\nDate End: " +eventEnd.toString().substring(0, 10)+ "\nLocal: " +local;
    }

}
