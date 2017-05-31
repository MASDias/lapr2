/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
import static org.junit.Assert.*;
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u1 = new User("Abilio Madureira", "abiliom", "abiliomadureira@gmail.com", "123abc123");
        User u2 = new User("Gonçalo Fonseca", "goncalof", "goncalofonseca@hotmail.com", "abc123abc");
        User u3 = new User("Emilio Carvalhosa", "emilioc", "emiliocarvalhosa@sapo.pt", "qwerty");

        System.out.println(u1);
        System.out.println("");
        System.out.println(u2);
        System.out.println("");
        System.out.println(u3);

    }

    public static void EventManagerCreatorTest() {
        EventManager eManager = new EventManager("Mario Dias", "", "", "");
        EventManager expectedResult = new EventManager("Mario Dias","","","");
        assertEquals(expectedResult, eManager);
    }

}
