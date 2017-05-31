/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Stand implements Serializable{
    private String m_sName;

    public Stand(String m_sName) {
        this.m_sName = m_sName;
    }

    public Stand() {
    }

    public String getName() {
        return m_sName;
    }

    public void setName(String m_sName) {
        this.m_sName = m_sName;
    }
    
    @Override
    public String toString(){
        return "Name: " + m_sName;
    }
    
    @Override
    public boolean equals(Object o){
        Stand stand = (Stand)o;
        if(this.m_sName.equals(stand.getName())){
            return true;
        }
        return false;
    }
}
