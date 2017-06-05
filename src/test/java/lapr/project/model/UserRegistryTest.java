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
public class UserRegistryTest {
    
    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception{
        UserRegistry list = new UserRegistry();
        User u1 = new User("Miguel", "miguel@gmail.com,", "miguelSantos", "123456789");
        User u2 = new User("Ricardo", "ricardoReis@gmail.com", "ricardoReis", "987654321");
        list.addUser(u1);
        list.addUser(u2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
    
}
