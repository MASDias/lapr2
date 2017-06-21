/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ShowStandInformationTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectStandInformationIsEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry standRegestry = new StandRegistry();
        standRegestry.addStand(s1);
        ShowStandInformation standInformation = new ShowStandInformation(standRegestry);
        assertEquals(standInformation, standInformation);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectStandInformationIsNotEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        Stand s2 = new Stand("stand 2", 400);
        StandRegistry standRegestry = new StandRegistry();
        StandRegistry standRegestry2 = new StandRegistry();
        standRegestry.addStand(s1);
        standRegestry2.addStand(s2);
        ShowStandInformation standInformation = new ShowStandInformation(standRegestry);
        ShowStandInformation standInformation2 = new ShowStandInformation(standRegestry2);
        assertNotEquals(standInformation, standInformation2);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsShowStandInformationIsNotEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry standRegestry = new StandRegistry();
        standRegestry.addStand(s1);
        ShowStandInformation standInformation = new ShowStandInformation(standRegestry);
        Object result = new Object();
        assertNotEquals(standInformation, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureNewStandRegestryIntervalIsNotEqual() throws Exception {
        Stand s1 = new Stand("stand 1", 500);
        StandRegistry standRegistry = new StandRegistry();
        standRegistry.addStand(s1);
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        StandRegistry result = standInformation.newStandRegistryInterval(0);
        assertNotEquals(standRegistry, result);
    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetStandartDeviationIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float expectedResult = 5.1678257F;
        float result = standInformation.getStandartDeviation();
        assertEquals(expectedResult, result, 0.0);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetStandartDeviationIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float expectedResult = 0.0F;
        float result = standInformation.getStandartDeviation();
        assertNotEquals(expectedResult, result, 0.0);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetIntervalMatrixIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float[][] expectedResult = {{10.0F, 13.8F}, {13.8F, 17.6F}, {17.6F, 21.4F}, {21.4F, 25.199999F}, {25.199999F, 28.999998F}};
        float[][] result = standInformation.getIntervalMatrix();
        assertArrayEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetIntervalMatrixIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float[][] expectedResult = {{10.8F, 13.8F}, {13.8F, 17.6F}, {17.6F, 21.4F}, {21.4F, 25.199999F}, {25.199999F, 28.999998F}};
        float[][] result = standInformation.getIntervalMatrix();
        assertNotEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetIntervalIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("[ 10.00 , 13.80 ]");
        expectedResult.add("[ 13.80 , 17.60 ]");
        expectedResult.add("[ 17.60 , 21.40 ]");
        expectedResult.add("[ 21.40 , 25.20 ]");
        expectedResult.add("[ 25.20 , 29.00 ]");
        ArrayList<String> result = standInformation.getIntervals();
        assertEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetIntervalIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("[ 10.00 , 13.90 ]");
        expectedResult.add("[ 13.70 , 17.60 ]");
        expectedResult.add("[ 17.60 , 21.40 ]");
        expectedResult.add("[ 21.40 , 25.20 ]");
        expectedResult.add("[ 25.20 , 29.00 ]");
        ArrayList<String> result = standInformation.getIntervals();
        assertNotEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetFrequencyStringIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        StandRegistry n = standInformation.newStandRegistryInterval(0);
        String result = standInformation.getFrequencyString();
        String expectedResult = "20.00%";
        assertEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetFrequencyStringIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        StandRegistry n = standInformation.newStandRegistryInterval(0);
        String result = standInformation.getFrequencyString();
        String expectedResult = "10.00%";
        assertNotEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetClassMarkArreyIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<Float> expectedResult = new ArrayList<>();
        expectedResult.add(11.9F);
        expectedResult.add(15.700001F);
        expectedResult.add(19.5F);
        expectedResult.add(23.3F);
        expectedResult.add(27.099998F);
        ArrayList<Float> result = standInformation.getClassMarkArray();
        assertEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetClassMarkArreyIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<Float> expectedResult = new ArrayList<>();
        expectedResult.add(11.4F);
        expectedResult.add(15.100001F);
        expectedResult.add(19.7F);
        expectedResult.add(23.3F);
        expectedResult.add(27.099998F);
        ArrayList<Float> result = standInformation.getClassMarkArray();
        assertNotEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetMeanIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float expectedResult = 18.14499855041504F;
        float result = standInformation.getMean();
        assertEquals(expectedResult, result, 0.0);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetMeanIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        float expectedResult = 12.9855041504F;
        float result = standInformation.getMean();
        assertNotEquals(expectedResult, result, 0.0);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetFrequencyIsEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<Integer> result = standInformation.getFrequency();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(4);
        expectedResult.add(4);
        expectedResult.add(4);
        expectedResult.add(3);
        assertEquals(expectedResult, result);

    }

    /**
     * Test of getStandartDeviation method, of class ShowStandInformation.
     */
    @Test
    public void EnsureGetFrequencyIsNotEqual() {
        StandRegistry standRegistry = new StandRegistry();
        for (int i = 0; i < 20; i++) {
            standRegistry.addStand(new Stand("mmm", 10 + i));
        }
        ShowStandInformation standInformation = new ShowStandInformation(standRegistry);
        ArrayList<Integer> result = standInformation.getFrequency();
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(4);
        expectedResult.add(4);
        expectedResult.add(3);
        assertNotEquals(expectedResult, result);

    }
}
