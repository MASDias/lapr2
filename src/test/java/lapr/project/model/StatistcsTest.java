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
 * @author Utilizador
 */
public class StatistcsTest {

    @Test
    public void EnsureGetZCriticalEqual() throws Exception {
        int total = 30;
        double significance = 0.05;
        float acceptanceRate = 0.40f;
        Statistics st = new Statistics(significance, total, acceptanceRate);
        double result = st.getzCritical();
        double expectedResult = 1.6448536269514724;
        assertEquals(result, expectedResult,0.0);
    }
    @Test
    public void EnsureGetObsValue() throws Exception {
        int total = 30;
        double significance = 0.05;
        float acceptanceRate = 0.40f;
        Statistics st = new Statistics(significance, total, acceptanceRate);
        double result = st.getObsValue();
        double expectedResult = -1.0954450211507607;
        assertEquals(result, expectedResult,0.0);
    }
}
