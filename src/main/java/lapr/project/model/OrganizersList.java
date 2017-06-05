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
    
    public OrganizersList(){
        this.organizersList = new ArrayList<>();
    }
    
    public List<Organizer> getOrganizersList(){
        return organizersList;
    }
    
    public void setOrganizersList(List<Organizer> organizersList){
        this.organizersList = organizersList;
    }
    
    private boolean validate(Organizer organizer){
        for (Organizer u: organizersList){
            if(u.equals(organizer)){
                return false;
            }
        }
        return true;
    }
    
    public void addOrganizer(Organizer organizer){
        if(validate(organizer)){
            organizersList.add(organizer);
        }else{
            JOptionPane.showMessageDialog(null, "The employee "+organizer.getName(), "Error!", -1);
        }
    }
    
    public int size (){
        return organizersList.size();
    }
}
