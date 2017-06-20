package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Organizer implements Serializable {

    private static final long serialVersionUID = 1;
    private EventRegistry eventRegistry;
    private User eventOrganizer;

    /**
     *
     * @param organizer
     */
    public Organizer(User organizer) {
        this.eventOrganizer = organizer;
    }

    /**
     *
     * @return
     */
    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }

    /**
     *
     * @param eventRegistry
     */
    public void setEventRegistry(EventRegistry eventRegistry) {
        this.eventRegistry = eventRegistry;
    }

    /**
     *
     * @return
     */
    public User getOrganizer() {
        return eventOrganizer;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return eventOrganizer.getEmail();
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return eventOrganizer.getUserName();
    }

    @Override
    public String toString() {
        return eventOrganizer.toString();
    }

}
