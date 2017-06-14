/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.EventCenter;
import lapr.project.model.User;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class CreateUserController {
    private User user;
    private EventCenter eventCenter;
    
    /**
     *
     * @param eventCenter
     */
    public CreateUserController(EventCenter eventCenter){
        this.eventCenter = eventCenter;
    }
    
    /**
     *
     * @param name
     * @param username
     * @param email
     * @param password
     * @return 
     */
    public boolean newUser(String name, String username, String email, String password){
        this.user = new User(name, username, email, password);
        if (user.validateData()) {
            return true;
        }
        return false;
    }
    
    /**
     *
     */
    public void addUser(){
        this.eventCenter.getUserRegistry().addUser(user);
    }
}
