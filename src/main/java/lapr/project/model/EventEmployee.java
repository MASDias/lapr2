package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployee {

    private int experience;
    private User eventEmployee;

    public EventEmployee(User eventEmployee, int experience) {
        this.experience = experience;
        this.eventEmployee = eventEmployee;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return eventEmployee.toString() + "\nExperience: " + experience;
    }
}
