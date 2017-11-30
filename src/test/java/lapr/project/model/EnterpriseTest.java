/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EnterpriseTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectStandIsEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        assertEquals(enterprise, enterprise);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsStandAreNotEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        Enterprise expected = new Enterprise("Paulo", null, null, 0, 0);
        assertNotEquals(enterprise, expected);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        Object expectedResult = new Object();
        assertNotEquals(enterprise, expectedResult);
    }
    @Test
   public void EnsureGetNameIsEqual() throws Exception {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        String result = enterprise.getName();
        String expectedResult = "Paulo";
        assertEquals(result, expectedResult);
    }
   @Test
   public void EnsureGetNameIsNotEqual() throws Exception {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        String result = enterprise.getName();
        String expectedResult = "enterprise1";
        assertNotEquals(result, expectedResult);
    }
     @Test
   public void EnsureSetNameIsEqual() throws Exception {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        enterprise.setName("enterprise1");
        String result = enterprise.getName();
        String expectedResult = "enterprise1";
        assertEquals(result, expectedResult);
    }
   @Test
   public void EnsureSetNameIsNotEqual() throws Exception {
        Enterprise enterprise = new Enterprise("Paulo", null, null, 0, 0);
        enterprise.setName("enterprise1");
        String result = enterprise.getName();
        String expectedResult = "Paulo";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetEmailIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        String result = enterprise.getEmail();
        String expectedResult = "e@email.com";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetEmailIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        String result = enterprise.getEmail();
        String expectedResult = "e3@email.com";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureSetEmailIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setEmail("e3@email.com");
        String result = enterprise.getEmail();
        String expectedResult = "e3@email.com";
        assertEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureSetEmailIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setEmail("e3@email.com");
        String result = enterprise.getEmail();
        String expectedResult = "e@email.com";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetAdressIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        String result = enterprise.getAddress();
        String expectedResult = "Location X";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetAdressIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        String result = enterprise.getAddress();
        String expectedResult = "Location Y";
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetAdressIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setAddress("Location Y");
        String result = enterprise.getAddress();
        String expectedResult = "Location Y";
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetAdressIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setAddress("Location Y");
        String result = enterprise.getAddress();
        String expectedResult = "Location X";
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetTaxpayerNumberIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setTaxpayerNumber(123456);
        int result = enterprise.getTaxpayerNumber();
        int expectedResult = 123456;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetTaxpayerNumberIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setTaxpayerNumber(123456);
        int result = enterprise.getTaxpayerNumber();
        int expectedResult = 123412;
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetTaxpayerNumberIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setTaxpayerNumber(123456);
        int result = enterprise.getTaxpayerNumber();
        int expectedResult = 123456;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetTaxpayerNumberIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setTaxpayerNumber(123456);
        int result = enterprise.getTaxpayerNumber();
        int expectedResult = 123412;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetContactIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setContact(939912375);
        int result = enterprise.getContact();
        int expectedResult = 939912375;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetContactIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setContact(939912375);
        int result = enterprise.getContact();
        int expectedResult = 939912975;
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetContactIsEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setContact(939912375);
        int result = enterprise.getContact();
        int expectedResult = 939912375;
        assertEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureSetContactIsNotEqual() {
        Enterprise enterprise = new Enterprise("enterprise 1", "e@email.com", "Location X", 123456789, 912645987);
        enterprise.setContact(939912375);
        int result = enterprise.getContact();
        int expectedResult = 939912975;
        assertNotEquals(result, expectedResult);
    }
}
