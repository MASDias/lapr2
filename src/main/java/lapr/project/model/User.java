package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class User {

    private int key;
    private String name;
    private String email;
    private String userName;
    private String password;

    public User(String name, String email, String userName, String password) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.key = (int) (0 + Math.random() * 9);
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nUsername: " + userName + "\nEmail: " + email;
    }
}
