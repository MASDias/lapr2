/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lapr.project.model.ApplicationList;
import lapr.project.model.Event;
import lapr.project.model.EventEmployee;
import lapr.project.model.Location;
import lapr.project.model.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectEventEmployeeIsEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        assertEquals(eEmployee, eEmployee);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsEventEmployeeAreNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        User user2 = new User("Z", "c", "b", "a");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        EventEmployee expectedResult = new EventEmployee(user2, 3);
        assertNotEquals(eEmployee, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsEventEmployeeAreNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eEmployee = new EventEmployee(user, 3);
        Object expectedResult = new Object();
        assertNotEquals(eEmployee, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employeeResult = new EventEmployee(user, 1);
        String result = employeeResult.toString();
        String expectedResult = "Name:Z; Username:b; Email:c Experience: 1";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employeeResult = new EventEmployee(user, 1);
        String result = employeeResult.toString();
        String expectedResult = "Name: l Username: b Email: c Experience: 1";
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetExperienceIsEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        int expectedResult = 3;
        employee.setExperience(3);
        int result = employee.getExperience();
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetExperienceIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        int expectedResult = 1;
        employee.setExperience(3);
        int result = employee.getExperience();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetExperienceIsEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        int expectedResult = 1;
        int result = employee.getExperience();
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetExperienceIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        int expectedResult = 2;
        int result = employee.getExperience();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEmployeeIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        User user2 = employee.getEmployee();
        EventEmployee result = new EventEmployee(user2, 4);
        assertNotEquals(result, employee);
    }

    /**
     *
     */
    @Test
    public void EnsureGetUserNameIsEqual() {
        User user = new User("Z", "c", "b", "a");
        User user2 = new User("T", "a", "o", "q");
        EventEmployee employee = new EventEmployee(user, 1);
        String result = employee.getUsername();
        assertNotEquals(result, user2);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEmailIsEqual() {
        User user = new User("Z", "c", "b", "a");
        EventEmployee employee = new EventEmployee(user, 1);
        String result = user.getEmail();
        String expectedResult = employee.getEmail();
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetEmailIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        User user2 = new User ("T", "a", "o", "q");
        EventEmployee employee = new EventEmployee(user2, 1);
        String result = user.getEmail();
        String expectedResult = employee.getEmail();
        assertNotEquals(result, expectedResult);
    }
     @Test
    public void EnsureSetApplicationsListIsEqual() throws Exception {
        ApplicationList result = new ApplicationList();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);

        event.setApplicationsList(result);
        ApplicationList expectedResult = event.getApplicationsList();
        assertEquals(expectedResult, result);
    }
}
