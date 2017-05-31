/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManager extends User{
    private User u;
    
    public EventManager(User u){
        this.u=u;
    }

    public EventManager(String m_sName, String m_sEmail, String m_sUserName, String m_sPassword) {
        super(m_sName, m_sEmail, m_sUserName, m_sPassword);
    }

    public EventManager() {
    }

    /**
     * @return the u
     */
    public User getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(User u) {
        this.u = u;
    }
    
    
}
