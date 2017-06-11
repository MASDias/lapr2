/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Organizer;
import lapr.project.model.User;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class CreateEventController {
    
    private EventCenter eventCenter;
    private ArrayList<User> usersList;
    private ArrayList<Organizer> OrganizersList;
    
    
    public CreateEventController(EventCenter eventCenter){
        this.eventCenter = eventCenter;
    }
    
    public List<User> getUsersList(){
        return eventCenter.getUserRegistry().getUsersList();
    }
    
    
    public User getUser(int index){
        return usersList.get(index);
    }
}
