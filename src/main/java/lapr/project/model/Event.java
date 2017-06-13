package lapr.project.model;

import java.text.SimpleDateFormat;
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
    private int invites;
    private ApplicationList applicationsList;
    private EventEmployeeList eventEmployeeList;
    private Keyword keyword;
    private StandRegistry standRegister;
    private OrganizersList organizerList;

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param local
     * @param invites
     */
    public Event(String title, String description, Date eventBegin, Date eventEnd, Location local, int invites) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventEnd = eventEnd;
        this.local = local;
        this.invites = invites;
        this.standRegister = new StandRegistry();
        this.applicationsList = new ApplicationList();
        this.eventEmployeeList = new EventEmployeeList();
        this.organizerList = new OrganizersList();
    }

    public OrganizersList getOrganizerList() {
        return organizerList;
    }

    public void setOrganizerList(OrganizersList organizerList) {
        this.organizerList = organizerList;
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

    public StandRegistry getStandRegister() {
        return standRegister;
    }

    public void setStandRegister(StandRegistry standRegister) {
        this.standRegister = standRegister;
    }

    public EventEmployeeList getEventEmployeeList() {
        return eventEmployeeList;
    }

    public void setEventEmployeeList(EventEmployeeList eventEmployeeList) {
        this.eventEmployeeList = eventEmployeeList;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String eventBeginString = sdf.format(eventBegin);
        String eventEndString = sdf.format(eventEnd);
        return "Title: " + title + "\nDescription: " + description + "\nDate Begin: " + eventBeginString.substring(0, 10) + "\nDate End: " + eventEndString.substring(0, 10) + "\nLocal: " + local;
    }

}
