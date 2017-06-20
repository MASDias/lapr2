package lapr.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Event implements Serializable {

    private static final long serialVersionUID = 1;
    private String title;
    private String description;
    private Date eventBegin;
    private Date eventEnd;
    private Date eventSubmissionBegin;
    private Date eventSubmissionEnd;
    private Location local;
    private int invites;
    private ApplicationList applicationsList;
    private EventEmployeeList eventEmployeeList;
    private StandRegistry standList;
    private OrganizersList organizerList;
    private KeywordList keywordsList;
    
    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param eventSubmissionBegin
     * @param local
     * @param eventSubmissionEnd
     * @param invites
     */
    
    public Event(String title, String description, Date eventBegin, Date eventEnd, Date eventSubmissionBegin, Date eventSubmissionEnd, Location local, int invites) {
        this.title = title;
        this.description = description;
        this.eventBegin = eventBegin;
        this.eventSubmissionBegin = eventSubmissionBegin;
        this.eventSubmissionEnd = eventSubmissionEnd;
        this.eventEnd = eventEnd;
        this.local = local;
        this.invites = invites;
        this.standList = new StandRegistry();
        this.applicationsList = new ApplicationList();
        this.eventEmployeeList = new EventEmployeeList();
        this.organizerList = new OrganizersList();
        this.keywordsList = new KeywordList();
    }

    public KeywordList getKeywordsList() {
        return keywordsList;
    }

    public void setLocal(Location local) {
        this.local = local;
    }

    
    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public Location getLocal() {
        return local;
    
    
    }

    public void setEventBegin(Date eventBegin) {
        this.eventBegin = eventBegin;
    }

    public void setEventEnd(Date eventEnd) {
        this.eventEnd = eventEnd;
    }

    public void setEventSubmissionBegin(Date eventSubmissionBegin) {
        this.eventSubmissionBegin = eventSubmissionBegin;
    }

    public void setEventSubmissionEnd(Date eventSubmissionEnd) {
        this.eventSubmissionEnd = eventSubmissionEnd;
    }

    /**
     *
     * @return
     */
    public Date getEventBegin() {
        return eventBegin;
    }

    /**
     *
     * @return
     */
    public Date getEventEnd() {
        return eventEnd;
    }

    /**
     *
     * @return
     */
    public boolean validateDate() {
        if (!eventBegin.after(eventEnd) || !eventEnd.before(eventBegin)) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean validateSubmissionDate() {
        if (!eventSubmissionBegin.after(eventSubmissionEnd) && !eventSubmissionEnd.before(eventSubmissionBegin)) {
            if (!eventSubmissionBegin.after(eventEnd) && !eventSubmissionEnd.after(eventEnd)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public OrganizersList getOrganizerList() {
        return organizerList;
    }

    /**
     *
     * @param organizerList
     */
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

    /**
     *
     * @return
     */
    public StandRegistry getStandRegister() {
        return standList;
    }

    /**
     *
     * @param standRegister
     */
    public void setStandRegister(StandRegistry standRegister) {
        this.standList = standRegister;
    }

    /**
     *
     * @return
     */
    public EventEmployeeList getEventEmployeeList() {
        return eventEmployeeList;
    }

    /**
     *
     * @param eventEmployeeList
     */
    public void setEventEmployeeList(EventEmployeeList eventEmployeeList) {
        this.eventEmployeeList = eventEmployeeList;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title;
    }

}
