package lapr.project.ui;

import lapr.project.model.CalculatorExample;
import lapr.project.model.Review;
import lapr.project.model.EventCenter;
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
        Review r = new Review("", 0, 0, 0, 0);
    }
}
