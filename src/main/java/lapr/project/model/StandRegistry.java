/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lapr.project.model.Stand;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class StandRegistry  {

    private ArrayList<Stand> listStands;

    public StandRegistry(){
        this.listStands=new ArrayList<>();
    }

    public ArrayList<Stand> getListStands() {
        return listStands;
    }

    public void setListaStands(ArrayList<Stand> listaStands) {
        this.listStands = listaStands;
    }
    
    public boolean validate(Stand stand){
        for (Stand s : listStands) {
            if(s.equals(stand)){
                return false;
            }
        }
        return true;
    }
    
    public void addStand(Stand stand){
        if(validate(stand)){
        listStands.add(stand);
    }else{
            JOptionPane.showMessageDialog(null, "The Stand "+stand.getName(), "Error!", -1);
        }
    }
}
