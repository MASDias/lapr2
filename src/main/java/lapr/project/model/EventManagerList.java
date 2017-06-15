/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManagerList implements Serializable{
private static final long serialVersionUID = 1;
    private List<EventManager> managerList;

    /**
     *
     */
    public EventManagerList() {
        this.managerList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    private boolean validate(EventManager eventManager) {
        for (EventManager u : managerList) {
            if (u.equals(eventManager)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param eventManager
     */
    public void addEventManager(EventManager eventManager) {
        if (validate(eventManager)) {
            managerList.add(eventManager);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return managerList.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public EventManager getEventManager(int index){
        return managerList.get(index);
    }
    
    /**
     *
     * @param eventManager
     */
    public void removeEventManager(EventManager eventManager){
        managerList.remove(eventManager);
    }
}
