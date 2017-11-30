/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class StandRegistry implements Serializable {

    private static final long serialVersionUID = 1;
    private ArrayList<Stand> standsList;

    /**
     *
     */
    public StandRegistry() {
        this.standsList = new ArrayList<>();
    }

    /**
     *
     * @param index
     * @return
     */
    public Stand getStand(int index) {
        return standsList.get(index);
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
        }
    }

    public void sort() {
        Collections.sort(standsList, new Comparator<Stand>() {
            @Override
            public int compare(Stand o1, Stand o2) {
                return o1.getArea() < o2.getArea() ? -1 : o1.getArea() > o2.getArea() ? 1 : 0;
            }
        });
    }

    /**
     *
     * @return
     */
    public int size() {
        return standsList.size();
    }
    
    public void removeStand(Stand stand){
        standsList.remove(stand);
    }
}
