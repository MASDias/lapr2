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
import lapr.project.model.EventRegistry;
import lapr.project.model.LocationList;
import lapr.project.model.Organizer;
import lapr.project.model.OrganizersList;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class CreateEventController {

    private EventCenter eventCenter;

    /**
     *
     * @param eventCenter
     */
    public CreateEventController(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
    }

    /**
     *
     * @return
     */
    public UserRegistry getUsersList() {
        return eventCenter.getUserRegistry();
    }

    /**
     *
     * @return
     */
    public OrganizersList getOrganizersList() {
        return eventCenter.getOrganizersList();
    }

    /**
     *
     * @return
     */
    public EventRegistry getEventsList() {
        return eventCenter.getEventRegistry();
    }

    /**
     *
     * @return
     */
    public LocationList getLocationList() {
        return eventCenter.getLocationList();
    }
}
