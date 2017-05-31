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
public class User {
    private String m_sName;
    private String m_sEmail;
    private String m_sUserName;
    private String m_sPassword;

    public User(String m_sName, String m_sEmail, String m_sUserName, String m_sPassword) {
        this.m_sName = m_sName;
        this.m_sEmail = m_sEmail;
        this.m_sUserName = m_sUserName;
        this.m_sPassword = m_sPassword;
    }

    public User() {
    }

    public String getName() {
        return m_sName;
    }

    public void setNome(String m_sName) {
        this.m_sName = m_sName;
    }

    public String getEmail() {
        return m_sEmail;
    }

    public void setEmail(String m_sEmail) {
        this.m_sEmail = m_sEmail;
    }

    public String getUserName() {
        return m_sUserName;
    }

    public void setUserName(String m_sUserName) {
        this.m_sUserName = m_sUserName;
    }

    public String getPassword() {
        return m_sPassword;
    }

    public void setPassword(String m_sPassword) {
        this.m_sPassword = m_sPassword;
    }
    
    
}
