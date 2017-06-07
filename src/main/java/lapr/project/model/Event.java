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
    private Keyword keyword;

    public Event(String title, String description, Date eventBegin, Date eventEnd, Local local) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventEnd = eventEnd;
        this.local = local;
        this.applicationsList = new ApplicationsList();
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public ApplicationsList getApplicationsList() {
        return applicationsList;
    }

    public void setApplicationsList(ApplicationsList applicationsList) {
        this.applicationsList = applicationsList;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDate Begin: " + eventBegin.toString().substring(0, 10) + "\nDate End: " + eventEnd.toString().substring(0, 10) + "\nLocal: " + local;
    }

}
