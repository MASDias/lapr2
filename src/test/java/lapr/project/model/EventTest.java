/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectEventIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");

        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        assertEquals(event, event);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");

        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Event result = new Event("Model", "string", end, beginning, null, null, local, 100);
        assertNotEquals(event, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsEventAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");

        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Object result = new Object();
        assertNotEquals(event, result);
    }
      @Test
    public void EnsureGetKeywordListIsNotEqual() throws Exception {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");      
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local,100);
        KeywordList keywordList = event.getKeywordsList();
        KeywordList result = new KeywordList();
        assertNotEquals(result, keywordList);
    }

    @Test
    public void EnsureGetTitleIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        String result = event.getTitle();
        String expectedResult = "Model Example";
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetTitleIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        String result = event.getTitle();
        String expectedResult = "Model";
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetLocalIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Location result = event.getLocal();
        assertEquals(result, local);
    }

    @Test
    public void EnsureGetLocalIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Location result = event.getLocal();
        Location expectedResult = new Location("street");
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureGetEventBeginIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Date result = event.getEventBegin();
        assertEquals(result, beginning);
    }

    @Test
    public void EnsureGetEventBeginIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Date result = event.getEventBegin();
        assertNotEquals(result, end);
    }

    @Test
    public void EnsureGetEventEndIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Date result = event.getEventEnd();
        assertEquals(result, end);
    }

    @Test
    public void EnsureGetEventEndIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        Date result = event.getEventEnd();
        assertNotEquals(result, beginning);
    }

    @Test
    public void EnsureGetOrganizerListIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        OrganizersList list = new OrganizersList();
        list.addOrganizer(organizer);
        event.setOrganizerList(list);
        OrganizersList result = event.getOrganizerList();
        assertEquals(result, list);
    }

    @Test
    public void EnsureGetOrganizerListIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        OrganizersList list = new OrganizersList();
        OrganizersList list2 = new OrganizersList();
        list.addOrganizer(organizer);
        event.setOrganizerList(list);
        OrganizersList result = event.getOrganizerList();
        assertNotEquals(result, list2);
    }

    @Test
    public void EnsureSetOrganizerListIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        OrganizersList list = new OrganizersList();
        list.addOrganizer(organizer);
        event.setOrganizerList(list);
        OrganizersList result = event.getOrganizerList();
        assertEquals(result, list);
    }

    @Test
    public void EnsureSetOrganizerListIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        Organizer organizer = new Organizer(user);
        OrganizersList list = new OrganizersList();
        OrganizersList list2 = new OrganizersList();
        list.addOrganizer(organizer);
        event.setOrganizerList(list);
        OrganizersList result = event.getOrganizerList();
        assertNotEquals(result, list2);
    }

    @Test
    public void EnsureGetEventEmployeeListIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        EventEmployeeList list = new EventEmployeeList();
        list.addEmployee(eventEmployee);
        event.setEventEmployeeList(list);
        EventEmployeeList result = event.getEventEmployeeList();
        assertEquals(result, list);
    }

    @Test
    public void EnsureGetEventEmployeeListIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        EventEmployeeList list = new EventEmployeeList();
        EventEmployeeList list2 = new EventEmployeeList();
        list.addEmployee(eventEmployee);
        event.setEventEmployeeList(list);
        EventEmployeeList result = event.getEventEmployeeList();
        assertNotEquals(result, list2);
    }

    @Test
    public void EnsureSetEventEmployeeListIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        EventEmployeeList list = new EventEmployeeList();
        list.addEmployee(eventEmployee);
        event.setEventEmployeeList(list);
        EventEmployeeList result = event.getEventEmployeeList();
        assertEquals(result, list);
    }

    @Test
    public void EnsureSetEventEmployeeListIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        EventEmployeeList list = new EventEmployeeList();
        EventEmployeeList list2 = new EventEmployeeList();
        list.addEmployee(eventEmployee);
        event.setEventEmployeeList(list);
        EventEmployeeList result = event.getEventEmployeeList();
        assertNotEquals(result, list2);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        String result = event.toString();
        String expectedResult = "Title: Model Example";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        String result = event.toString();
        String expectedResult = "Title: Model";
        assertNotEquals(result, expectedResult);
    }

    @Test
    public void EnsureValidateDateIsValid() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        boolean result = event.validateDate();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureValidateDateIsNotValid() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("10-10-2017");
        Date end = sdf.parse("01-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, null, null, local, 100);
        boolean result = event.validateDate();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureValidateSubmissionDateIsValid() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Date submissionBegin = sdf.parse("31-09-2017");
        Date submissionEnd = sdf.parse("09-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, submissionBegin, submissionEnd, local, 100);
        boolean result = event.validateSubmissionDate();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureValidateSubmissionDateIsNotValid() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Date submissionBegin = sdf.parse("31-09-2017");
        Date submissionEnd = sdf.parse("11-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Example string", beginning, end, submissionBegin, submissionEnd, local, 100);
        boolean result = event.validateSubmissionDate();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }
}
