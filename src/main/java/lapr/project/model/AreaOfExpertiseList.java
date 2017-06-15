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
public class AreaOfExpertiseList implements Serializable{
private static final long serialVersionUID = 1;
    private List<AreaOfExpertise> areaOfExpertiseList;

    /**
     *
     */
    public AreaOfExpertiseList() {
        this.areaOfExpertiseList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<AreaOfExpertise> getAreaOfExpertiseList() {
        return areaOfExpertiseList;
    }

    private boolean validate(AreaOfExpertise areaOfExpertise) {
        for (AreaOfExpertise a : areaOfExpertiseList) {
            if (a.equals(areaOfExpertise)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param areaOfExpertise
     */
    public void addAreaOfExpertise(AreaOfExpertise areaOfExpertise) {
        if (validate(areaOfExpertise)) {
            areaOfExpertiseList.add(areaOfExpertise);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add expert to list!");
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return areaOfExpertiseList.size();
    }
}
