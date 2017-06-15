/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeList implements Serializable {

    private static final long serialVersionUID = 1;
    private List<EventEmployee> employeeList;

    /**
     *
     */
    public EventEmployeeList() {
        this.employeeList = new ArrayList<>();
    }

    private boolean validate(EventEmployee user) {
        for (EventEmployee u : employeeList) {
            if (u.equals(user)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param employee
     */
    public void addEmployee(EventEmployee employee) {
        if (validate(employee)) {
            employeeList.add(employee);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return employeeList.size();
    }

    /**
     *
     * @param index
     * @return
     */
    public EventEmployee getEmployee(int index) {
        return employeeList.get(index);
    }

    /**
     *
     * @param e
     */
    public void removeEmployee(EventEmployee e) {
        employeeList.remove(e);
    }
}
