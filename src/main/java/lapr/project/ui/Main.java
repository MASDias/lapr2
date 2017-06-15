package lapr.project.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import lapr.project.model.CalculatorExample;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.Location;
import lapr.project.utils.XMLReader;

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
        EventCenter eventCenter = new EventCenter();
        XMLReader xmlFile = new XMLReader();
        eventCenter = xmlFile.readValuesFromXML(eventCenter);
        MainWindow mw = new MainWindow(eventCenter);
    }
}
