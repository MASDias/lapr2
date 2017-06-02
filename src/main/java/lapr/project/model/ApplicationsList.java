/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ApplicationsList {
    private ArrayList<Application> applicationsList;
    
    public ApplicationsList(){
        this.applicationsList = new ArrayList<>();
    }
    
    public ArrayList<Application> getApplicationsList(){
        return applicationsList;
    }
    
    public void setApplicationsList(ArrayList<Application> applicationsList){
        this.applicationsList = applicationsList;
    }
    
    public boolean validate(Application application){
        for(Application a: applicationsList){
            if(a.equals(application)){
                return false;
            }
        }
        return true;
    }
    
    public void addApplication(Application application){
        if(validate(application)){
            applicationsList.add(application);
        }else{
            JOptionPane.showMessageDialog(null, "Can't add application to list!");
        }
    }
}
