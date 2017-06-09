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
public class ExpertsList {

    private List<Expert> expertsList;

    /**
     *
     */
    public ExpertsList() {
        this.expertsList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<Expert> getExpertsList() {
        return expertsList;
    }

    private boolean validate(Expert expert) {
        for (Expert a : expertsList) {
            if (a.equals(expert)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param expert
     */
    public void addExpert(Expert expert) {
        if (validate(expert)) {
            expertsList.add(expert);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add expert to list!");
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return expertsList.size();
    }
}
