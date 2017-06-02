package lapr.project.model;

/**
 *
 * @author
 */
public class EventEmployee extends User {

    private int experience;


    public EventEmployee(String name, String email, String userName, String password, int experience) {
        super(name, email, userName, password);
        this.experience = experience;
    }

    public EventEmployee() {

    }
    
    
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nEmail: " +super.getEmail()+ "\nUserName: " +super.getUserName()+ "\nExperience: " +experience;
    }
}
