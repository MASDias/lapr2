package lapr.project.users;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class User {

    private String name;
    private String email;
    private String userName;
    private String password;

    public User(String name, String email, String userName, String password) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User: " + name + "\nUserName: " + userName + "\nEmail: " + email;
    }
}
