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
 * @author xxtia
 */
public class AreaOfExpertiseList {

    private List<AreaOfExpertise> areaOfExpertiseList;

    public AreaOfExpertiseList() {
        this.areaOfExpertiseList = new ArrayList<>();
    }

    public List<AreaOfExpertise> getApplicationsList() {
        return areaOfExpertiseList;
    }

    public void setApplicationsList(List<AreaOfExpertise> areaOfExpertiseList) {
        this.areaOfExpertiseList = areaOfExpertiseList;
    }

    private boolean validate(AreaOfExpertise areaOfExpertise) {
        for (AreaOfExpertise a : areaOfExpertiseList) {
            if (a.equals(areaOfExpertise)) {
                return false;
            }
        }
        return true;
    }

    public void addApplication(AreaOfExpertise areaOfExpertise) {
        if (validate(areaOfExpertise)) {
            areaOfExpertiseList.add(areaOfExpertise);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add application to list!");
        }
    }

    public int size() {
        return areaOfExpertiseList.size();
    }
}
