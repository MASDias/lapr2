/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ApplicationTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsApplicationIsEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application( e, 10, "description", 0.0f);
        assertEquals(application, application);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsApplicationAreNotEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application result = new Application( e, 10, "description", 0.0f);
        Enterprise e2 = new Enterprise("enterprise 2", "e2@email.com", "Location y", 789456423, 951456312);
        Application expectedResult = new Application( e2, 10, "description", 0.0f);

        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsApplicationAreNotEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application result = new Application(e, 10, "description", 0.0f);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureToStringIsEqual() throws Exception {
        
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application( e, 10, "description", 0.0f);

        String result = application.toString();
        String expectedResult = "Enterprise:enterprise 1 Email:e@email.com Address:Location X Taxpayer num:123456789 Contact:912645987; Invites:10; Description:description";
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureToStringIsNotEqual() throws Exception {
        
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application( e, 10, "description", 0.0f);
        String result = application.toString();
        System.out.println(result);
        String expectedResult = "Enterprise:enterprise2 Email:e@email.com Address:Location X Taxpayer num:123456789 Contact:912645987; Invites:10; Description: description";
        assertNotEquals(result, expectedResult);

    }
}
