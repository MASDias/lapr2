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
public class UserRegistry implements Serializable{
private static final long serialVersionUID = 1;
    private List<User> usersList;

    /**
     *
     */
    public UserRegistry() {
        this.usersList = new ArrayList<>();
    }


    private boolean validate(User user) {
        for (User u : usersList) {
            if (u.equals(user)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param user
     */
    public void addUser(User user) {
        if (validate(user)) {
            usersList.add(user);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return usersList.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public User getUser(int index){
        return usersList.get(index);
    }
}
