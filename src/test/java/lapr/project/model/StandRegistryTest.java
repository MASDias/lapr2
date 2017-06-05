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
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class StandRegistryTest {
    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception{
        StandRegistry list = new StandRegistry();
        Stand s1 = new Stand("stand 1", 500);
        Stand s2 = new Stand("stand 2", 600);
        list.addStand(s1);
        list.addStand(s2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
}
