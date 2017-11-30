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
public class ApplicationTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsApplicationIsEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        assertEquals(application, application);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsApplicationAreNotEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application result = new Application(e, 10, "description", 0.0f);
        Enterprise e2 = new Enterprise("enterprise 2", "e2@email.com", "Location y", 789456423, 951456312);
        Application expectedResult = new Application(e2, 10, "description", 0.0f);
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
        Application application = new Application(e, 10, "description", 0.0f);
        String result = application.toString();
        String expectedResult = "Enterprise:enterprise 1; Invites:10; Description:description";
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureToStringIsNotEqual() throws Exception {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        String result = application.toString();
        System.out.println(result);
        String expectedResult = "Enterprise:enterprise2";
        assertNotEquals(result, expectedResult);

    }

    @Test
    public void EnsureisEvalueated() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        boolean result = application.isEvaluated();
        boolean expectedResult = false;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetEvalueted() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setEvaluated(true);
        boolean result = application.isEvaluated();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }

    @Test
    public void EnsureisDecision() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setDecision(true);
        application.setEvaluated(true);
        boolean result = application.isDecision();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetDecision() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setDecision(true);
        boolean result = application.isDecision();
        boolean expectedResult = true;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetStandIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Stand stand = new Stand("stand", 500);
        application.setStand(stand);
        Stand result = application.getStand();
        assertEquals(result, stand);
    }

    /**
     *
     */
    @Test
    public void EnsureGetStandIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Stand stand = new Stand("stand", 500);
        application.setStand(stand);
        Stand result = application.getStand();
        Stand expectedResult = new Stand("ftft", 789);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetStandIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Stand stand = new Stand("stand", 500);
        application.setStand(stand);
        Stand result = application.getStand();
        assertEquals(result, stand);
    }

    /**
     *
     */
    @Test
    public void EnsureSetStandIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Stand stand = new Stand("stand", 500);
        application.setStand(stand);
        Stand result = application.getStand();
        Stand expectedResult = new Stand("ftft", 789);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetProductListIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Product product = new Product("box");
        ProductList list = new ProductList();
        list.addProduct(product);
        application.setProductList(list);
        ProductList result = application.getProductList();
        assertEquals(result, list);
    }

    /**
     *
     */
    @Test
    public void EnsureGetProductListIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Product product = new Product("box");
        ProductList list = new ProductList();
        list.addProduct(product);
        Product product2 = new Product("Stick");
        ProductList list2 = new ProductList();
        list2.addProduct(product2);
        application.setProductList(list);
        ProductList result = application.getProductList();
        assertNotEquals(result, list2);
    }

    /**
     *
     */
    @Test
    public void EnsureGetInvitesIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        int result = application.getInvites();
        int expectedResult = 10;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetInvitesIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        int result = application.getInvites();
        int expectedResult = 14;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetInvitesIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setInvites(14);
        int result = application.getInvites();
        int expectedResult = 14;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetInvitesIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setInvites(14);
        int result = application.getInvites();
        int expectedResult = 10;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetAreaIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 10.0f);
        float result = application.getArea();
        float expectedResult = 10.0f;
        assertEquals(result, expectedResult, 0.0);
    }

    /**
     *
     */
    @Test
    public void EnsureGetAreaIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 10.0f);
        float result = application.getArea();
        float expectedResult = 0.1f;
        assertNotEquals(result, expectedResult, 0.0);
    }

    /**
     *
     */
    @Test
    public void EnsureSetAreaIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 10.0f);
        application.setArea(20.0f);
        float result = application.getArea();
        float expectedResult = 20.0f;
        assertEquals(result, expectedResult, 0.0);
    }

    /**
     *
     */
    @Test
    public void EnsureSetAreaIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 10.0f);
        application.setArea(20.0f);
        float result = application.getArea();
        float expectedResult = 10.0f;
        assertNotEquals(result, expectedResult, 0.0);
    }

    /**
     *
     */
    @Test
    public void EnsureGetKeywordListListIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        KeywordList list = new KeywordList();
        Keyword keyword = new Keyword("123456789");
        list.addKeyword(keyword);
        application.setKeywordList(list);
        KeywordList result = application.getKeywordList();
        assertEquals(result, list);
    }

    /**
     *
     */
    @Test
    public void EnsureGetKeywordListListIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        KeywordList list = new KeywordList();
        KeywordList list2 = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list2.addKeyword(k2);
        application.setKeywordList(list);
        KeywordList result = application.getKeywordList();
        assertNotEquals(result, list2);
    }
 /**
     *
     */
    @Test
    public void EnsureSetKeywordListListIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        KeywordList list = new KeywordList();
        Keyword keyword = new Keyword("123456789");
        list.addKeyword(keyword);
        application.setKeywordList(list);
        KeywordList result = application.getKeywordList();
        assertEquals(result, list);
    }

    /**
     *
     */
    @Test
    public void EnsureSetKeywordListListIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        KeywordList list = new KeywordList();
        KeywordList list2 = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list2.addKeyword(k2);
        application.setKeywordList(list);
        KeywordList result = application.getKeywordList();
        assertNotEquals(result, list2);
    }
    /**
     *
     */
    @Test
    public void EnsureGetUserIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        String userName = user.getUserName();
        application.setUser(userName);
        String result = application.getUser();
        assertEquals(result, userName);
    }
    /**
     *
     */
    @Test
    public void EnsureGetUserIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User user2 = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        String userName = user.getUserName();
        String expectedResult = user2.getUserName();
        application.setUser(userName);
        String result = application.getUser();
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetUserIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        String userName = user.getUserName();
        application.setUser(userName);
        String result = application.getUser();
        assertEquals(result, userName);
    }
    /**
     *
     */
    @Test
    public void EnsureSetUserIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User user2 = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        String userName = user.getUserName();
        String expectedResult = user2.getUserName();
        application.setUser(userName);
        String result = application.getUser();
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetEventIsEqual() throws Exception{
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        application.setEvent(event);
        Event result = application.getEvent();
        assertEquals(result, event);
    }
      /**
     *
     */
    @Test
    public void EnsureGetEventIsNotEqual() throws Exception{
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Event expectedResult = new Event("Model", "string", end, beginning, null, null, local, 100);
        application.setEvent(event);
        Event result = application.getEvent();
        assertNotEquals(result, expectedResult);
    }
      /**
     *
     */
    @Test
    public void EnsureSetEventIsEqual() throws Exception{
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        application.setEvent(event);
        Event result = application.getEvent();
        assertEquals(result, event);
    }
      /**
     *
     */
    @Test
    public void EnsureSetEventIsNotEqual() throws Exception{
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street");
        Event event = new Event("Model Example", "Explae string", beginning, end, null, null, local, 100);
        Event expectedResult = new Event("Model", "string", end, beginning, null, null, local, 100);
        application.setEvent(event);
        Event result = application.getEvent();
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetEnterpriseIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        Enterprise result = application.getEnterprise();
        assertEquals(result, e);
    }
    /**
     *
     */
    @Test
    public void EnsureGetEnterpriseIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Enterprise e2 = new Enterprise("enterprise 2", "e2@email.com", "Location y", 987654321, 595323141);
        Application application = new Application(e, 10, "description", 0.0f);
        Enterprise result = application.getEnterprise();
        assertNotEquals(result, e2);
    }
    /**
     *
     */
    @Test
    public void EnsureGetDecriptionIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        String result = application.getDescription();
        String expectedResult = "description";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetDecriptionIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        String result = application.getDescription();
        String expectedResult = "something";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureSetDecriptionIsEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setDescription("something");
        String result = application.getDescription();
        String expectedResult = "something";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetDecriptionIsNotEqual() {
        Enterprise e = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(e, 10, "description", 0.0f);
        application.setDescription("something");
        String result = application.getDescription();
        String expectedResult = "description";
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetEvaluationIsEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        Review result = application.getEvaluation(0);
        assertEquals(result, review);
    }
     /**
     *
     */
    @Test
    public void EnsureGetEvaluationIsNotEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventEmployee eventEmployee = new EventEmployee(user, 3);
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        Application application = new Application(enterprise, 10, "description", 0.0f);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        Review review2 = new Review("Stick", 2, 3, 5, 1);
        review.setAssignment(assignment);
        application.addEvaluation(review);
        Review result = application.getEvaluation(0);
        assertNotEquals(result, review2);
    }
}
