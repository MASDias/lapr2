package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Organizer extends User {

    public Organizer(String name, String email, String username, String password) {
        super(name, email, username, password);
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nEmail: " + super.getEmail() + "\nUsername: " + super.getUserName();
    }
}
