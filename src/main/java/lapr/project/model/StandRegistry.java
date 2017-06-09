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
public class StandRegistry {

    private List<Stand> standsList;

    /**
     *
     */
    public StandRegistry() {
        this.standsList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<Stand> getListStands() {
        return standsList;
    }

    /**
     *
     * @param listaStands
     */
    public void setListaStands(List<Stand> listaStands) {
        this.standsList = listaStands;
    }

    private boolean validate(Stand stand) {
        for (Stand s : standsList) {
            if (s.equals(stand)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param stand
     */
    public void addStand(Stand stand) {
        if (validate(stand)) {
            standsList.add(stand);
        } else {
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }
    
    /**
     *
     * @return
     */
    public int size (){
        return standsList.size();
    }
}
