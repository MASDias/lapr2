package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployee implements Serializable {

    private static final long serialVersionUID = 1;
    private int experience;
    private User employeeEvent;

    private ApplicationList applicationList;

    /**
     *
     * @param eventEmployee
     * @param experience
     */
    public EventEmployee(User eventEmployee, int experience) {
        this.employeeEvent = eventEmployee;
        this.experience = experience;
        this.applicationList = new ApplicationList();
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return employeeEvent.getEmail();
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return employeeEvent.getUserName();
    }

    /**
     *
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     *
     * @return
     */
    public int getExperience() {
        return experience;
    }

    /**
     *
     * @return
     */
    public ApplicationList getApplicationList() {
        return applicationList;
    }

    /**
     *
     * @param applicationList
     */
    public void setApplicationList(ApplicationList applicationList) {
        this.applicationList = applicationList;
    }

    /**
     *
     * @return
     */
    public User getEmployee() {
        return employeeEvent;
    }

    @Override
    public String toString() {
        return employeeEvent.toString() + " Experience: " + experience;
    }

}
