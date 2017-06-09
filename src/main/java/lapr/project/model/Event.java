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
    private Location local;
    private ApplicationList applicationsList;
    private Keyword keyword;

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param local
     */
    public Event(String title, String description, Date eventBegin, Date eventEnd, Location local) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventEnd = eventEnd;
        this.local = local;
        this.applicationsList = new ApplicationList();
    }

    /**
     *
     * @return
     */
    public Keyword getKeyword() {
        return keyword;
    }

    /**
     *
     * @param keyword
     */
    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }
 
    /**
     *
     * @return
     */
    public ApplicationList getApplicationsList() {
        return applicationsList;
    }

    /**
     *
     * @param applicationsList
     */
    public void setApplicationsList(ApplicationList applicationsList) {
        this.applicationsList = applicationsList;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDate Begin: " + eventBegin.toString().substring(0, 10) + "\nDate End: " + eventEnd.toString().substring(0, 10) + "\nLocal: " + local;
    }

}
