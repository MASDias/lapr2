package lapr.project.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lapr.project.model.CalculatorExample;
import lapr.project.model.EventEmployee;
import lapr.project.model.User;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        CalculatorExample calculatorExample = new CalculatorExample();
        System.out.println(calculatorExample.sum(3, 13));
        MainWindow mw = new MainWindow();
        User u = new User("Miguel", "miguelazeredo@gmail.com", "miguelazeredo", "123456789");
        EventEmployee e  = new EventEmployee(u,0);
        System.out.println(e);
//        CreateEvent cr = new CreateEvent();
    }   

}
