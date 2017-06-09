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
 * @author MarioDias
 */
public class LocationList {

    private List<Location> localList;

    /**
     *
     */
    public LocationList() {
        this.localList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<Location> getListLocals() {
        return localList;
    }

    /**
     *
     * @param localList
     */
    public void setListLocals(List<Location> localList) {
        this.localList = localList;
    }

    /**
     *
     * @param index
     * @return
     */
    public Location getLocal(int index) {
        return localList.get(index);
    }

    private boolean validate(Location local) {
        for (Location a : localList) {
            if (a.equals(local)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param local
     */
    public void addLocal(Location local) {
        if (validate(local)) {
            localList.add(local);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add local to list!");
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return localList.size();
    }
}
