package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployee implements Serializable {

    private static final long serialVersionUID = 1;
    private int experience;
    private User eventEmployee;

    private ApplicationList applicationList;

    /**
     *
     * @param eventEmployee
     * @param experience
     */
    public EventEmployee(User eventEmployee, int experience) {
        this.eventEmployee = eventEmployee;
        this.experience = experience;
        this.applicationList = new ApplicationList();
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return eventEmployee.getEmail();
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return eventEmployee.getUserName();
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
        return eventEmployee;
    }

    @Override
    public String toString() {
        return eventEmployee.toString() + " Experience: " + experience;
    }

}
