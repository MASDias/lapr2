/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeMeanRatingTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventEmployeeMeanRatingIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(list);
        assertEquals(employeeMeanRating, employeeMeanRating);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventEmployeeMeanRatingIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(list);
        EventRegistry list2 = new EventRegistry();
        list2.addEvent(event);
        EventEmployeeMeanRating employeeMeanRating2 = new EventEmployeeMeanRating(list2);
        assertNotEquals(employeeMeanRating, employeeMeanRating2);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsEventEmployeeMeanRatingIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(list);
        Object result = new Object();
        assertNotEquals(employeeMeanRating, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventEmployeeMeanRatingUserIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        String userName = eventEmployee.getUsername();
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        assertEquals(employeeMeanRating, employeeMeanRating);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventEmployeeMeanRatingUserIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        String userName = eventEmployee.getUsername();
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        EventRegistry list2 = new EventRegistry();
        list2.addEvent(event);
        User user2 = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee2 = new EventEmployee(user2, 3);
        String userName2 = eventEmployee2.getUsername();
        EventEmployeeMeanRating employeeMeanRating2 = new EventEmployeeMeanRating(userName2, list2);
        assertNotEquals(employeeMeanRating, employeeMeanRating2);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsEventEmployeeMeanRatingUserIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        String userName = eventEmployee.getUsername();
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        Object result = new Object();
        assertNotEquals(employeeMeanRating, result);
    }

    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetEmployeeEvaluationListIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        ArrayList<Float> result = employeeMeanRating.getEmployeeEvaluationList();
        ArrayList<Float> expectedResult = new ArrayList<>();
        expectedResult.add(3.5F);
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetEmployeeEvaluationListIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        ArrayList<Float> result = employeeMeanRating.getEmployeeEvaluationList();
        ArrayList<Float> expectedResult = new ArrayList<>();
        expectedResult.add(3.6F);
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureDeviationArrayIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        double[] result = employeeMeanRating.deviationArray(3.5F);
        double expectedResult = 0.0;
        assertEquals(expectedResult, result[0], 0.0);
    }
     /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureDeviationArrayIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        double[] result = employeeMeanRating.deviationArray(3.5F);
        double expectedResult = 0.1;
        assertNotEquals(expectedResult, result[0], 0.0);
    }
    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetEmployeeMeanRatingIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        double result = employeeMeanRating.getEmployeeMeanRating();
        double expectedResult = 3.5;
        assertEquals(expectedResult, result, 0.0);
    }
     /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetEmployeeMeanRatingIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        double result = employeeMeanRating.getEmployeeMeanRating();
        double expectedResult = 3.6;
        assertNotEquals(expectedResult, result, 0.0);
    }
     /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetCounterAplicationEmployeeIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        int result = employeeMeanRating.getCounterAplicationEmployee();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetCounterAplicationEmployeeIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        String userName = eventEmployee.getUsername();
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(userName, list);
        int result = employeeMeanRating.getCounterAplicationEmployee();
        int expectedResult = 0;
        assertNotEquals(expectedResult, result);
    }
    /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetGlobalMeanRatingIsEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(list);
        float result = employeeMeanRating.getGlobalMeanRating();
        float expectedResult = 3.5F;
        assertEquals(expectedResult, result,0.0);
    }
     /**
     * Test of getEmployeeEvaluationList method, of class
     * EventEmployeeMeanRating.
     */
    @Test
    public void EnsureGetGlobalMeanRatingIsNotEqual() throws Exception {
        EventRegistry list = new EventRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example965", "Explae string", beginning, end, null, null, local, 100);
        list.addEvent(event);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        ApplicationList list2 = new ApplicationList();
        list2.addApplication(application);
        event.setApplicationsList(list2);
        EventEmployeeMeanRating employeeMeanRating = new EventEmployeeMeanRating(list);
        float result = employeeMeanRating.getGlobalMeanRating();
        float expectedResult = 3.6F;
        assertNotEquals(expectedResult, result,0.0);
    }
}
