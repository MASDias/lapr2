/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author MarioDias
 */
public class Assignment {

    private Application application;
    private EventEmployeeList eventEmployeeList;

    public Assignment(Application application) {
        this.application = application;
        eventEmployeeList = new EventEmployeeList();
    }
    
}
