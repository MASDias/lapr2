/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ShowEventAcceptanceRateTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectShowEventAcceptenceRateIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        list.addApplication(application);
        event.setApplicationsList(list);
        assertEquals(acceptenceRate, acceptenceRate);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectShowEventAcceptenceRateIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Event event2 = new Event("Model", "string", end, beginning, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        list.addApplication(application);
        event.setApplicationsList(list);
        event2.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        ShowEventAcceptanceRate acceptenceRate2 = new ShowEventAcceptanceRate(event2);
        assertNotEquals(acceptenceRate, acceptenceRate2);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsShowEventAcceptenceRateAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        Object result = new Object();
        assertNotEquals(acceptenceRate, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetAcceptenceRateIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(true);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        double result = acceptenceRate.getAcceptanceRate();
        double expectedResult = 1.0;
        assertEquals(result, expectedResult, 0.0);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetAcceptenceRateIsnotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(false);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        double result = acceptenceRate.getAcceptanceRate();
        double expectedResult = 1.0;
        assertNotEquals(result, expectedResult, 0.0);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetAcceptedIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(true);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getAccepted();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetAcceptedIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(false);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getAccepted();
        int expectedResult = 1;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetTotalIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(true);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getTotal();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetTotalIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        application.isDecision();
        application.setDecision(true);
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getTotal();
        int expectedResult = 0;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetTotalWithoutIsDecisionIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getTotal();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
     /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureGetTotalWithoutIsDecisionIsNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        ApplicationList list = new ApplicationList();
        list.addApplication(application);
        event.setApplicationsList(list);
        ShowEventAcceptanceRate acceptenceRate = new ShowEventAcceptanceRate(event);
        int result = acceptenceRate.getTotal();
        int expectedResult = 0;
        assertNotEquals(result, expectedResult);
    }
}
