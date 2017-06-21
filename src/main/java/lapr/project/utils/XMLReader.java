package lapr.project.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.model.Application;
import lapr.project.model.Review;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.Location;
import lapr.project.model.Stand;
import lapr.project.model.StandRegistry;
import lapr.project.model.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import lapr.project.model.Assignment;
import lapr.project.model.Enterprise;
import lapr.project.model.EventManager;
import lapr.project.model.Keyword;
import lapr.project.model.Organizer;
import lapr.project.ui.MainWindow;
import org.xml.sax.SAXParseException;

/**
 *
 * @author playtard
 */
public class XMLReader {

    /**
     *
     */
    private String filepathXML = "";

    /**
     *
     */
    private static final String DEFAULTFILENAMEXML = "xml/exposicao1_v0.1.xml";

    /**
     *
     * @param fileXML
     */
    public XMLReader(String fileXML) {

        if (!testFilepath(fileXML)) {
            filepathXML = DEFAULTFILENAMEXML;
        } else {
            filepathXML = fileXML;
        }
    }

    /**
     *
     */
    public XMLReader() {
        filepathXML = DEFAULTFILENAMEXML;
    }

    public EventCenter readValuesFromXML(EventCenter eventCenter) throws ParseException, SAXParseException {
        try {

            File xmlFile = new File(filepathXML);

            DocumentBuilderFactory documentBuilderFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new FileReader(xmlFile));
            Document document = documentBuilder.parse(inputSource);
            NodeList eventList = document.getElementsByTagName("event");
            eventCenter = getEventCenterFromXML(eventList, document, eventCenter);

        } catch (FileNotFoundException e) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Ficheiro nÃ£o encontrado");
        } catch (IOException | ParserConfigurationException | SAXException e) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, e);
        }
        return eventCenter;
    }

    private EventCenter getEventCenterFromXML(NodeList eventList, Document document, EventCenter eventCenter) throws ParseException {
        for (int b = 0; b < eventList.getLength(); b++) {
            Event exposicao1 = new Event("", "", null, null, null, null, null, 0);
            int cont = 0;
            Element title = (Element) eventList.item(b);
            String eventTitle = title.getElementsByTagName("title").item(0).getTextContent();

            NodeList eventManagerList = title.getElementsByTagName("eventmanager");
            eventCenter = getEventManagersFromList(eventCenter, eventManagerList);

            NodeList locations = title.getElementsByTagName("location");
            String local;
            if (locations.getLength() == 0) {
                local = "No location set";
            } else {
                local = title.getElementsByTagName("location").item(0).getTextContent();
            }

            for (int i = 0; i < eventCenter.getLocationList().size(); i++) {
                if (eventCenter.getLocationList().getLocal(i).toString().equals(local)) {
                    cont++;
                }
            }
            if (cont == 0) {
                eventCenter.getLocationList().addLocal(new Location(local));
            }
            exposicao1.setLocal(new Location(local));
            exposicao1.setTitle(eventTitle);
            NodeList stands = document.getElementsByTagName("stand");
            Object[] objects = getStandsFromXMLFile(eventCenter, exposicao1, stands);
            eventCenter = (EventCenter) objects[0];
            exposicao1 = (Event) objects[1];

            NodeList FAEset = document.getElementsByTagName("FAESet");
            objects = getFAEsFromXMLFile(eventCenter, exposicao1, FAEset);
            eventCenter = (EventCenter) objects[0];
            exposicao1 = (Event) objects[1];

            NodeList applicationSetList = document.getElementsByTagName("applicationSet");
            for (int i = 0; i < applicationSetList.getLength(); i++) {
                Element applicationSet = (Element) applicationSetList.item(i);
                NodeList applicationList = applicationSet.getElementsByTagName("application");
                exposicao1 = getApplicationFromXMLFile(applicationList, exposicao1);
            }

            NodeList organizerSet = document.getElementsByTagName("OrganizerSet");
            objects = getOrganizersFromXMLFile(eventCenter, exposicao1, organizerSet);
            eventCenter = (EventCenter) objects[0];
            exposicao1 = (Event) objects[1];
            NodeList dateSet = document.getElementsByTagName("dates");
            objects = getDatesFromXMLFile(exposicao1, eventCenter, dateSet);
            eventCenter = (EventCenter) objects[0];
            exposicao1 = (Event) objects[1];
            eventCenter.getEventRegistry().addEvent(exposicao1);
            
        }

        return eventCenter;
    }

    private Object[] getDatesFromXMLFile(Event exposicao1, EventCenter eventCenter, NodeList dateSet) throws ParseException {
        String eventBegin = "";
        String eventEnd = "";
        String eventSubBeg = "";
        String eventSubEnd = "";
        if (dateSet.getLength() == 0) {
            Date date = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            eventBegin = day + "-" + month + "-" + year;
            eventEnd = (day + 21) + "-" + month + "-" + year;
            eventSubBeg = (day + 1) + "-" + month + "-" + year;
            eventSubEnd = (day + 5) + "-" + month + "-" + year;
        } else {
            for (int t = 0; t < dateSet.getLength(); t++) {
                Element date = (Element) dateSet.item(t);
                eventBegin = date.getElementsByTagName("eventBegin").item(0).getTextContent();
                eventEnd = date.getElementsByTagName("eventEnd").item(0).getTextContent();
                eventSubBeg = date.getElementsByTagName("eventSubBeg").item(0).getTextContent();
                eventSubEnd = date.getElementsByTagName("eventSubEnd").item(0).getTextContent();
            }
        }
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        exposicao1.setEventBegin(f.parse(eventBegin));
        exposicao1.setEventEnd(f.parse(eventEnd));
        exposicao1.setEventSubmissionBegin(f.parse(eventSubBeg));
        exposicao1.setEventSubmissionEnd(f.parse(eventSubEnd));
        
        return new Object[]{eventCenter,exposicao1};
    }

    /**
     *
     * @param eventCenter
     * @param eventManagerList
     * @return
     */
    private EventCenter getEventManagersFromList(EventCenter eventCenter, NodeList eventManagerList) {
        if (eventManagerList.getLength() == 0) {
            User eventManager = createNewUser("eventManager", "eventManager@management.pt", "eventManager", "management");
            if (!userExists(eventCenter, eventManager)) {
                eventCenter.getUserRegistry().addUser(eventManager);
            } else if (eventCenter.getUserRegistry().size() == 0) {
                eventCenter.getUserRegistry().addUser(eventManager);
            }
            eventCenter.getEventManagerList().addEventManager(new EventManager(eventManager));
        } else {
            for (int i = 0; i < eventManagerList.getLength(); i++) {
                Element eventManagerElement = (Element) eventManagerList.item(i);
                String nomeStr = eventManagerElement.getElementsByTagName("name").item(0).getTextContent();
                String emailStr = eventManagerElement.getElementsByTagName("email").item(0).getTextContent();
                String usernameStr = eventManagerElement.getElementsByTagName("username").item(0).getTextContent();
                String passwordStr = eventManagerElement.getElementsByTagName("password").item(0).getTextContent();
                User eventManager = createNewUser(nomeStr, emailStr, usernameStr, passwordStr);
                if (!userExists(eventCenter, eventManager)) {
                    eventCenter.getUserRegistry().addUser(eventManager);
                } else if (eventCenter.getUserRegistry().size() == 0) {
                    eventCenter.getUserRegistry().addUser(eventManager);
                }

                eventCenter.getEventManagerList().addEventManager(new EventManager(eventManager));
            }
        }
        return eventCenter;
    }

    private Event getApplicationFromXMLFile(NodeList applicationList, Event exposicao1) {
        for (int j = 0; j < applicationList.getLength(); j++) {
            Element application = (Element) applicationList.item(j);
            boolean accepted = application.getElementsByTagName("accepted").item(0).getTextContent().equals("true");
            String description = application.getElementsByTagName("description").item(0).getTextContent();
            float area = Float.parseFloat(application.getElementsByTagName("boothArea").item(0).getTextContent());
            int invitesQuantity = Integer.parseInt(application.getElementsByTagName("invitesQuantity").item(0).getTextContent());
            Application app = new Application(new Enterprise(null, null, null, 0, 0), invitesQuantity, description, area);
            app.setDecision(accepted);
            app.setEvaluated(true);
            NodeList reviewsList = application.getElementsByTagName("reviews");
            app = getReviewsFromXMLFile(app, reviewsList);
            NodeList keywords = application.getElementsByTagName("keywords");
            for (int l = 0; l < keywords.getLength(); l++) {
                Element keywordValue = (Element) keywords.item(l);
                NodeList keywordSet = keywordValue.getElementsByTagName("keyword");
                for (int p = 0; p < keywordSet.getLength(); p++) {
                    String keyword = keywordValue.getElementsByTagName("keyword").item(p).getTextContent();
                    app.getKeywordList().addKeyword(new Keyword(keyword));
                }
            }
            exposicao1.getApplicationsList().addApplication(app);
        }
        return exposicao1;
    }

    private Object[] getOrganizer(EventCenter eventCenter, Event exposicao1, NodeList users) {
        for (int j = 0; j < users.getLength(); j++) {
            Element user = (Element) users.item(j);
            String nomeStr = user.getElementsByTagName("name").item(0).getTextContent();
            String emailStr = user.getElementsByTagName("email").item(0).getTextContent();
            String usernameStr = user.getElementsByTagName("username").item(0).getTextContent();
            String passwordStr = user.getElementsByTagName("password").item(0).getTextContent();
            User organizerU = createNewUser(nomeStr, emailStr, usernameStr, passwordStr);
            if (!userExists(eventCenter, organizerU)) {
                eventCenter.getUserRegistry().addUser(organizerU);
            } else if (eventCenter.getUserRegistry().size() == 0) {
                eventCenter.getUserRegistry().addUser(organizerU);
            }

            Organizer organizerO = new Organizer(organizerU);
            exposicao1.getOrganizerList().addOrganizer(organizerO);
        }
        Object[] objects = {eventCenter, exposicao1};
        return objects;
    }

    private Object[] getOrganizersFromXMLFile(EventCenter eventCenter, Event exposicao1, NodeList organizerSet) {
        if (organizerSet.getLength() > 0) {
            for (int a = 0; a < organizerSet.getLength(); a++) {
                Element organizerSetElement = (Element) organizerSet.item(a);
                NodeList organizers = organizerSetElement.getElementsByTagName("Organizer");
                for (int t = 0; t < organizers.getLength(); t++) {
                    Element organizer = (Element) organizers.item(t);
                    NodeList users = organizer.getElementsByTagName("user");
                    Object[] objects = getOrganizer(eventCenter, exposicao1, users);
                    eventCenter = (EventCenter) objects[0];
                    exposicao1 = (Event) objects[1];
                }
            }
        } else {
            User organizerU = createNewUser("Organizer 1", "organizer1@event.pt", "organizer1", "organizer1");
            if (!userExists(eventCenter, organizerU)) {
                eventCenter.getUserRegistry().addUser(organizerU);
            } else if (eventCenter.getUserRegistry().size() == 0) {
                eventCenter.getUserRegistry().addUser(organizerU);
            }
            Organizer organizerO = new Organizer(organizerU);
            exposicao1.getOrganizerList().addOrganizer(organizerO);
            organizerU = createNewUser("Organizer 2", "organizer2@event.pt", "organizer2", "organizer2");
            if (!userExists(eventCenter, organizerU)) {
                eventCenter.getUserRegistry().addUser(organizerU);
            } else if (eventCenter.getUserRegistry().size() == 0) {
                eventCenter.getUserRegistry().addUser(organizerU);
            }

            organizerO = new Organizer(organizerU);
            exposicao1.getOrganizerList().addOrganizer(organizerO);
        }

        return new Object[]{eventCenter, exposicao1};
    }

    /**
     *
     * @param nomeStr
     * @param emailStr
     * @param usernameStr
     * @param passwordStr
     * @return
     */
    private User createNewUser(String nomeStr, String emailStr, String usernameStr, String passwordStr) {
        return new User(nomeStr, emailStr, usernameStr, passwordStr);
    }

    private Application getReviewsFromXMLFile(Application app, NodeList reviewsList) {
        for (int k = 0; k < reviewsList.getLength(); k++) {
            Element reviews = (Element) reviewsList.item(k);
            NodeList reviewSet = reviews.getElementsByTagName("review");
            for (int l = 0; l < reviewSet.getLength(); l++) {
                Element review = (Element) reviewSet.item(l);
                String justificationText = review.getElementsByTagName("text").item(0).getTextContent();
                int faeTopicKnowledge = Integer.parseInt(review.getElementsByTagName("faeTopicKnowledge").item(0).getTextContent());
                int eventAdequacy = Integer.parseInt(review.getElementsByTagName("eventAdequacy").item(0).getTextContent());
                int inviteAdequacy = Integer.parseInt(review.getElementsByTagName("inviteAdequacy").item(0).getTextContent());
                int recommendation = Integer.parseInt(review.getElementsByTagName("recommendation").item(0).getTextContent());
                Review reviewO = new Review(justificationText, faeTopicKnowledge, eventAdequacy, inviteAdequacy, recommendation);
                NodeList faesAssignment = review.getElementsByTagName("assignment");

                ArrayList<EventEmployee> eventEmployeeArrayList = getAssignments(faesAssignment);
                for (int m = 0; m < eventEmployeeArrayList.size(); m++) {
                    reviewO.setAssignment(new Assignment(eventEmployeeArrayList.get(m)));
                }
                app.addEvaluation(reviewO);
            }
        }
        return app;
    }

    private ArrayList<EventEmployee> getAssignments(NodeList faesAssignment) {
        ArrayList<EventEmployee> eventEmployeeArrayList = new ArrayList<>();
        for (int m = 0; m < faesAssignment.getLength(); m++) {
            Element faeSet = (Element) faesAssignment.item(m);
            NodeList faesAssignElement = faeSet.getElementsByTagName("fae");
            for (int n = 0; n < faesAssignElement.getLength(); n++) {
                Element faeX = (Element) faesAssignElement.item(n);
                NodeList userList = faeX.getElementsByTagName("user");
                for (int o = 0; o < userList.getLength(); o++) {
                    Element userElement = (Element) userList.item(o);
                    String nomeStr = userElement.getElementsByTagName("name").item(0).getTextContent();
                    String emailStr = userElement.getElementsByTagName("email").item(0).getTextContent();
                    String usernameStr = userElement.getElementsByTagName("username").item(0).getTextContent();
                    String passwordStr = userElement.getElementsByTagName("password").item(0).getTextContent();
                    eventEmployeeArrayList.add(new EventEmployee(createNewUser(nomeStr, emailStr, usernameStr, passwordStr), 0));
                }
            }
        }
        return eventEmployeeArrayList;
    }

    private Object[] getStandsFromXMLFile(EventCenter eventCenter, Event exposicao1, NodeList stands) {
        StandRegistry standsList = eventCenter.getStandRegistry();
        for (int i = 0; i < stands.getLength(); i++) {
            Element stand = (Element) stands.item(i);
            String description = stand.getElementsByTagName("description").item(0).getTextContent();
            float area = Float.parseFloat(stand.getElementsByTagName("area").item(0).getTextContent());
            Stand s = new Stand(description, area);
            standsList.addStand(s);
            exposicao1.getStandRegister().addStand(s);
        }
        eventCenter.setStandRegistry(standsList);
        Object[] objects = {eventCenter, exposicao1};
        return objects;
    }

    private Object[] getFAEsFromXMLFile(EventCenter eventCenter, Event exposicao1, NodeList FAEset) {
        for (int a = 0; a < FAEset.getLength(); a++) {
            Element FAEsetemplyee = (Element) FAEset.item(a);
            NodeList faes = FAEsetemplyee.getElementsByTagName("fae");
            for (int i = 0; i < faes.getLength(); i++) {
                Element fae = (Element) faes.item(i);
                NodeList users = fae.getElementsByTagName("user");
                for (int j = 0; j < users.getLength(); j++) {
                    Element user = (Element) users.item(j);
                    String nomeStr = user.getElementsByTagName("name").item(0).getTextContent();
                    String emailStr = user.getElementsByTagName("email").item(0).getTextContent();
                    String usernameStr = user.getElementsByTagName("username").item(0).getTextContent();
                    String passwordStr = user.getElementsByTagName("password").item(0).getTextContent();
                    User eventEmployee = createNewUser(nomeStr, emailStr, usernameStr, passwordStr);
                    if (!userExists(eventCenter, eventEmployee)) {
                        eventCenter.getUserRegistry().addUser(eventEmployee);
                    } else if (eventCenter.getUserRegistry().size() == 0) {
                        eventCenter.getUserRegistry().addUser(eventEmployee);
                    }
                    EventEmployee employee = new EventEmployee(eventEmployee, 0);
                    exposicao1.getEventEmployeeList().addEmployee(employee);
                }
            }
        }
        Object[] objects = {eventCenter, exposicao1};
        return objects;
    }

    /**
     *
     * @param eventCenter
     * @param user
     * @return
     */
    private boolean userExists(EventCenter eventCenter, User user) {
        int cont = 0;
        if (eventCenter.getUserRegistry().size() > 0) {
            for (int k = 0; k < eventCenter.getUserRegistry().size(); k++) {
                if (eventCenter.getUserRegistry().getUser(k).equals(user)) {
                    cont++;
                }
                if (cont > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param filepath
     * @return
     */
    public boolean testFilepath(String filepath) {
        File file = new File(filepath);
        if (!file.exists() || (file.exists() && file.isDirectory())) {
            System.out.println("File not found. Using default file");
            return false;
        }
        return true;
    }
}
