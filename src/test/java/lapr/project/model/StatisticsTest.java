package lapr.project.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarioDias
 */
public class StatisticsTest {

    /**
     * Test of getVarianceFirstDeviation method, of class Statistics.
     */
    @Test
    public void testGetVarianceFirstDeviation() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.27943983448275866;
        double result = statistics.getVarianceFirstDeviation();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetVarianceFirstDeviationNotEquals() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.33305698474;
        double result = statistics.getVarianceFirstDeviation();
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of getAverageFirstDeviation method, of class Statistics.
     */
    @Test
    public void testGetAverageFirstDeviation() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.6096;
        double result = statistics.getAverageFirstDeviation();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetAverageFirstDeviationNotEquals() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.780;
        double result = statistics.getAverageFirstDeviation();
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of deviationVariance method, of class Statistics.
     */
    @Test
    public void testDeviationVariance() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.27943983448275866;
        double result = statistics.deviationVariance(values);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDeviationVarianceNotEquals() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.0222648;
        double result = statistics.deviationVariance(values);
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of deviationAverage method, of class Statistics.
     */
    @Test
    public void testDeviationAverage() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.6096;
        double result = statistics.deviationAverage(values);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of deviationAverage method, of class Statistics.
     */
    @Test
    public void testDeviationAverageNotEquals() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 0.3012;
        double result = statistics.deviationAverage(values);
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of getzCritical method, of class Statistics.
     */
    @Test
    public void testGetzCritical() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 2.326347874040841;
        double result = statistics.getzCritical();
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of getzCritical method, of class Statistics.
     */
    @Test
    public void testGetzCriticalNotEqual() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = 1.096;
        double result = statistics.getzCritical();
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Test of getObsValue method, of class Statistics.
     */
    @Test
    public void testGetObsValue() {
        double[] values = {0.798, 0.202, 0.202, 0.048, 0.798, 0.298, 0.048, 1.952, 0.952, 0.298, 0.048, 0.202, 0.048, 0.798, 0.048, 0.048, 0.548, 0.298, 1.548, 0.452, 1.048, 0.452, 0.702, 0.702, 0.702, 1.952, 0.952, 0.798, 1.048, 0.298};
        Statistics statistics = new Statistics(0.01, 1, values.length, values);
        double expResult = -4.045072209064469;
        double result = statistics.getObsValue();
        assertEquals(expResult, result, 0.0);
    }

}
