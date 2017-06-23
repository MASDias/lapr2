package lapr.project.ui;

import lapr.project.model.EventCenter;
import lapr.project.model.EventManager;
import lapr.project.model.User;
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
        EventCenter eventCenter = new EventCenter();
//        XMLReader xmlFile = new XMLReader();
//        eventCenter = xmlFile.readValuesFromXML(eventCenter);

        User user = new User("manager", "manager@email.com", "manager", "password");
        EventManager eventManager = new EventManager(user);
        eventCenter.getUserRegistry().addUser(user);
        eventCenter.getEventManagerList().addEventManager(eventManager);

        MainWindow mw = new MainWindow(eventCenter);

    }
}
