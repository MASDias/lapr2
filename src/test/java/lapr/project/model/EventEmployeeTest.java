/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployeeTest {
    
    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception{
        EventEmployeeList list = new EventEmployeeList();
        EventEmployee e1 = new EventEmployee("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789", 1);
        EventEmployee e2 = new EventEmployee("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321", 3);
        list.addEmployee(e1);
        list.addEmployee(e2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
}
