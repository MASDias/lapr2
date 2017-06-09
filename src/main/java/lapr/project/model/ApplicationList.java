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
public class ApplicationList {
    private List<Application2> applicationsList;
    
    /**
     *
     */
    public ApplicationList(){
        this.applicationsList = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public List<Application2> getApplicationsList(){
        return applicationsList;
    }
    
    /**
     *
     * @param applicationsList
     */
    public void setApplicationsList(List<Application2> applicationsList){
        this.applicationsList = applicationsList;
    }
    
    private boolean validate(Application2 application){
        for(Application2 a: applicationsList){
            if(a.equals(application)){
                return false;
            }
        }
        return true;
    }
    
    /**
     *
     * @param application
     */
    public void addApplication(Application2 application){
        if(validate(application)){
            applicationsList.add(application);
        }else{
            JOptionPane.showMessageDialog(null, "Can't add application to list!");
        }
    }
    
    /**
     *
     * @return
     */
    public int size (){
        return applicationsList.size();
    }
}
