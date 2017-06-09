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
public class ExhibitionTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectStandIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        assertEquals(exhibition, exhibition);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsStandAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        Exhibition exhibition2 = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 10);
        assertNotEquals(exhibition, exhibition2);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        assertEquals(exhibition, exhibition);
        Object expectedResult = new Object();
        assertNotEquals(exhibition, expectedResult);
    }
}
