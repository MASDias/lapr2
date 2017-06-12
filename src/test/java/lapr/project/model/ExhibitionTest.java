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
    
    @Test
    public void EnsureGetApplicationsListIsEqual() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        ApplicationList list = new ApplicationList();
        ApplicationList expectedList = list;
        assertEquals(list,expectedList);
    }

    @Test
    public void EnsureGetApplicationsListIsNotEqual() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        ApplicationList list = new ApplicationList();
        ApplicationList expectedList = exhibition.getApplicationsList();
        list.addApplication(new Application2(null,null,true));
        assertNotEquals(list,expectedList);
    }
    
    @Test
    public void EnsureSetApplicationListIsEqual() throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        Exhibition expectedResult = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        exhibition.setApplicationsList(expectedResult.getApplicationsList());
        assertEquals(exhibition.getApplicationsList(),expectedResult.getApplicationsList());
    }
    
    @Test
    public void EnsureSetApplicationListIsNotEqual() throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        Exhibition exhibition2 = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        ApplicationList list = new ApplicationList();
        list.addApplication(new Application2(null,null,true));
        assertNotEquals(exhibition.getApplicationsList(),list);
    }
    
    @Test
    public void EnsureGetStandRegistryIsEqual() throws Exception{
        StandRegistry standRegistry = new StandRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        assertEquals(exhibition.getStandRegister(), exhibition.getStandRegister());
    }
    
    @Test
    public void EnsureGetStandRegistryIsNotEqual() throws Exception{
        StandRegistry standRegistry = new StandRegistry();
        standRegistry.addStand(new Stand("",0.0f));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        assertNotEquals(exhibition.getStandRegister(), standRegistry);
    }
    
    @Test
    public void EnsureSetStandRegistryIsEqual() throws Exception{
        StandRegistry standRegistry = new StandRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        exhibition.setStandRegister(standRegistry);
        assertEquals(exhibition.getStandRegister(), standRegistry);
    }
    
    @Test
    public void EnsureSetStandRegistryIsNotEqual() throws Exception{
        StandRegistry standRegistry = new StandRegistry();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date beginning = sdf.parse("01-10-2017");
        Date end = sdf.parse("10-10-2017");
        Location local = new Location("Example Street", 500);
        Exhibition exhibition = new Exhibition("Exhibition", "Cool Exhibition", beginning, end, local, 20);
        exhibition.setStandRegister(standRegistry);
        StandRegistry expectedStandRegistry = new StandRegistry();
        expectedStandRegistry.addStand(new Stand("",0.0f));
        assertNotEquals(exhibition.getStandRegister(), expectedStandRegistry);
    }
}
