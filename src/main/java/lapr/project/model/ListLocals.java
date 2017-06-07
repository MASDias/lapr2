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
 * @author MarioDias
 */
public class ListLocals {

    private List<Local> localList;

    public ListLocals() {
        this.localList = new ArrayList<>();
    }

    public List<Local> getListLocals() {
        return localList;
    }

    public void setListLocals(List<Local> localList) {
        this.localList = localList;
    }

    private boolean validate(Local local) {
        for (Local a : localList) {
            if (a.equals(local)) {
                return false;
            }
        }
        return true;
    }

    public void addLocal(Local local) {
        if (validate(local)) {
            localList.add(local);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add local to list!");
        }
    }

    public int size() {
        return localList.size();
    }
}
