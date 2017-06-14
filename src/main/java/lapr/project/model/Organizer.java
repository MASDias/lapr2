package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Organizer {

    private EventRegistry eventRegistry;
    private User organizer;

    /**
     *
     * @param organizer
     */
    public Organizer(User organizer) {
        this.organizer = organizer;
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
        return organizer;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return organizer.getEmail();
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return organizer.getUserName();
    }

    @Override
    public String toString() {
        return organizer.toString();
    }

}
