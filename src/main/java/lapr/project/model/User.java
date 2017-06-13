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
    private boolean userStatus = false;
    private boolean organizerStatus = false;
    private boolean eventEmployeeStatus = false;
    private boolean eventManagerStatus = false;

    /**
     *
     * @param name
     * @param email
     * @param userName
     * @param password
     */
    public User(String name, String email, String userName, String password) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.key = (int) (0 + Math.random() * 9);
        this.password = password;
        this.userStatus = true;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public boolean isOrganizerStatus() {
        return organizerStatus;
    }

    public void setOrganizerStatus(boolean organizerStatus) {
        this.organizerStatus = organizerStatus;
    }

    public boolean isEventEmployeeStatus() {
        return eventEmployeeStatus;
    }

    public void setEventEmployeeStatus(boolean eventEmployeeStatus) {
        this.eventEmployeeStatus = eventEmployeeStatus;
    }

    public boolean isEventManagerStatus() {
        return eventManagerStatus;
    }

    public void setEventManagerStatus(boolean eventManagerStatus) {
        this.eventManagerStatus = eventManagerStatus;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setKey(int key) {
        this.key = key;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Name:" + name + "; Username:" + userName + "; Email:" + email;
    }
}
