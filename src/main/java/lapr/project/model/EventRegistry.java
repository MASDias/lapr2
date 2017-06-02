/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import lapr.project.model.Event;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventRegistry {
    
    private ArrayList<Event> eventsList;
    
    public EventRegistry(){
        this.eventsList = new ArrayList<>();
    }
    
    public ArrayList<Event> getEventsList(){
        return eventsList;
    }
    
    public void setEventsList(ArrayList<Event> eventsList){
        this.eventsList = eventsList;
    }
    
    public boolean validate(Event event){
        for(Event e: eventsList){
        if(e.equals(event)){
            return false;
        }
    }
        return true;
    }
    
    public void addEvent(Event event){
        if(validate(event)){
            eventsList.add(event);
        }else{
            JOptionPane.showMessageDialog(null, "The Event "+event.getTitle(), "Error!", -1);
        }
    }
}
