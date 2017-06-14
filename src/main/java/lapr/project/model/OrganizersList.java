/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class OrganizersList {

    private List<Organizer> organizersList;

    /**
     *
     */
    public OrganizersList() {
        this.organizersList = new ArrayList<>();
    }

    private boolean validate(Organizer organizer) {
        for (Organizer u : organizersList) {
            if (u.equals(organizer)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param organizer
     */
    public void addOrganizer(Organizer organizer) {
        if (validate(organizer)) {
            organizersList.add(organizer);
        } else {
            JOptionPane.showMessageDialog(null, "The employee already exists", "Error!", -1);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return organizersList.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public Organizer getOrganizer(int index){
        return organizersList.get(index);
    }
    
    /**
     *
     * @param o
     */
    public void removeOrganizer(Organizer o){
        organizersList.remove(o);
    }
}
