package lapr.project.users;

/**
 *
 * @author
 */
public class EventEmployee extends User {

    private int experience;

    public EventEmployee(String m_sName, String m_sEmail, String m_sUserName, String m_sPassword, int experience) {
        super(m_sName, m_sEmail, m_sUserName, m_sPassword);
        this.experience = experience;
    }

    public EventEmployee() {

    }

}
