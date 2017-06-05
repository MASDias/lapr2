package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployee extends User {

    private int experience;

    public EventEmployee(String name, String email, String userName, String password, int experience) {
        super(name, email, userName, password);
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nEmail: " + super.getEmail() + "\nUserName: " + super.getUserName() + "\nExperience: " + experience;
    }
}
