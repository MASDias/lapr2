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
        this.organizer.setOrganizerStatus(true);
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
    
    public User getOrganizer(){
        return organizer;
    }

    @Override
    public String toString() {
        return organizer.toString();
    }
}
