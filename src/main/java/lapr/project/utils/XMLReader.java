/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.model.Application;
import lapr.project.model.ApplicationList;
import lapr.project.model.Review;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.EventRegistry;
import lapr.project.model.Location;
import lapr.project.model.LocationList;
import lapr.project.model.Stand;
import lapr.project.model.StandRegistry;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.nio.charset.StandardCharsets;
import lapr.project.model.Organizer;


/**
 *
 * @author playtard
 */
public class XMLReader {
    /**
     *
     */
    private String filepathUsers = "";

    /**
     *
     */
    private String filepathStands = "";

    /**
     *
     */
    private String filepathLocations = "";

    /**
     *
     */
    private final String DEFAULT_FILENAME_USERS = "xml/UserList.xml";

    /**
     *
     */
    private final String DEFAULT_FILENAME_STANDS = "xml/StandsList.xml";

    /**
     *
     */
    private final String DEFAULT_FILENAME_LOCATIONS = "xml/LocationXml.xml";

    /**
     *
     * @param fileUsers
     * @param fileStands
     * @param fileLocations
     */
    public XMLReader(String fileUsers, String fileStands, String fileLocations) {

        if (!testFilepath(fileUsers)) {
            filepathUsers = DEFAULT_FILENAME_USERS;
        } else {
            filepathUsers = fileUsers;
        }
        if (!testFilepath(fileStands)) {
            filepathStands = DEFAULT_FILENAME_USERS;
        } else {
            filepathStands = fileStands;
        }
        if (!testFilepath(fileLocations)) {
            filepathLocations = DEFAULT_FILENAME_LOCATIONS;
        } else {
            filepathLocations = fileLocations;
        }
    }

    /**
     *
     */
    public XMLReader() {
        filepathUsers = DEFAULT_FILENAME_USERS;
        filepathStands = DEFAULT_FILENAME_STANDS;
        filepathLocations = DEFAULT_FILENAME_LOCATIONS;
    }

    /**
     *
     * @param eventCenter
     * @return
     * @throws FileNotFoundException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    
    /*
     public EventCenter readValuesFromXML(EventCenter eventCenter) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException{
     try{
            
     File xmlFileUsers = new File(filepathUsers);
     File xmlFileStands = new File(filepathStands);
     File xmlFileLocations = new File(filepathLocations);
            
            
     DocumentBuilderFactory documentBuilderFactory
     = DocumentBuilderFactory.newInstance();
     DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
     InputSource inputSource = new InputSource();
     inputSource.setCharacterStream(new FileReader(xmlFileUsers));
     Document document = documentBuilder.parse(inputSource);
            
     NodeList users = document.getElementsByTagName("User");
     UserRegistry userList = eventCenter.getUserRegistry();
     for (int i = 0; i < users.getLength(); i++) {
                
     Element user = (Element)users.item(i);
                
     String nomeStr = user.getElementsByTagName("Name").item(0).getTextContent();
                
     String emailStr = user.getElementsByTagName("Email").item(0).getTextContent();
                
     String usernameStr = user.getElementsByTagName("Username").item(0).getTextContent();
                
     String passwordStr = user.getElementsByTagName("Password").item(0).getTextContent();
                
     int key = Integer.parseInt(user.getElementsByTagName("Serialkey").item(0).getTextContent());
                
     User u = new User(nomeStr,emailStr,usernameStr,passwordStr);  
     u.setKey(key);
     userList.addUser(u);
     }
     eventCenter.setUserRegistry(userList);
            
     inputSource.setCharacterStream(new FileReader(xmlFileStands));
     document = documentBuilder.parse(inputSource);
            
     NodeList stands = document.getElementsByTagName("Stand");
     StandRegistry standsList = eventCenter.getStandRegistry();
     for (int i = 0; i < stands.getLength(); i++) {                
     Element stand = (Element)stands.item(i);
                
     String addressStr = stand.getElementsByTagName("address").item(0).getTextContent();
                
     float area = Float.parseFloat(stand.getElementsByTagName("area").item(0).getTextContent());
                
     Stand s = new Stand(addressStr, area);
     standsList.addStand(s);
     }
     eventCenter.setStandRegistry(standsList);
            
     inputSource.setCharacterStream(new FileReader(xmlFileLocations));
     document = documentBuilder.parse(inputSource);
            
     NodeList locations = document.getElementsByTagName("Location");
     LocationList locationsList = eventCenter.getLocationList();
     for (int i = 0; i < locations.getLength(); i++) {
                
     Element location = (Element)locations.item(i);
                
     String addressStr = location.getElementsByTagName("address").item(0).getTextContent();
     Location l = new Location(addressStr);
     locationsList.addLocal(l);
     }
     eventCenter.setLocationList(locationsList);
            
            
     } catch (FileNotFoundException e) {
     System.out.println("Ficheiro não encontrado");
            
     } catch (IOException e){
            
     } catch (ParserConfigurationException e){
            
     } catch (SAXException e){
            
     }
     return eventCenter;
     }*/

        public EventCenter readValuesFromXML(EventCenter eventCenter) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        try {

            File xmlFile = new File("xml/exposicao1_v0.1.xml");
            Event exposicao1 = new Event("", "", null, null, null, null, null, 0);

            DocumentBuilderFactory documentBuilderFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new FileReader(xmlFile));
            Document document = documentBuilder.parse(inputSource);

            NodeList eventList = document.getElementsByTagName("event");
            for (int b = 0; b < eventList.getLength(); b++) {
                NodeList stands = document.getElementsByTagName("stand");
                StandRegistry standsList = eventCenter.getStandRegistry();
                for (int i = 0; i < stands.getLength(); i++) {
                    Element stand = (Element) stands.item(i);
                    String description = stand.getElementsByTagName("description").item(0).getTextContent();
                    System.out.println("Description: " + description);

                    float area = Float.parseFloat(stand.getElementsByTagName("area").item(0).getTextContent());
                    System.out.println("Area: " + area);

                    Stand s = new Stand(description, area);
                    standsList.addStand(s);
                }
                eventCenter.setStandRegistry(standsList);

                NodeList FAEset = document.getElementsByTagName("FAESet");
                for (int a = 0; a < FAEset.getLength(); a++) {
                    Element FAEsetemplyee = (Element) FAEset.item(a);
                    NodeList faes = FAEsetemplyee.getElementsByTagName("fae");

                    for (int i = 0; i < faes.getLength(); i++) {

                        Element fae = (Element) faes.item(i);
                        NodeList users = fae.getElementsByTagName("user");
                        for (int j = 0; j < users.getLength(); j++) {
                            Element user = (Element) users.item(j);

                            String nomeStr = user.getElementsByTagName("name").item(0).getTextContent();
                            System.out.println(nomeStr);

                            String emailStr = user.getElementsByTagName("email").item(0).getTextContent();
                            System.out.println(emailStr);

                            String usernameStr = user.getElementsByTagName("username").item(0).getTextContent();
                            System.out.println(usernameStr);

                            String passwordStr = user.getElementsByTagName("password").item(0).getTextContent();
                            System.out.println(passwordStr);

                            User eventEmployee = new User(nomeStr, emailStr, usernameStr, passwordStr);
                            int cont = 0;
                            if (eventCenter.getUserRegistry().size() > 0) {
                                for (int k = 0; k < eventCenter.getUserRegistry().size(); k++) {
                                    if (eventCenter.getUserRegistry().getUser(k).equals(eventEmployee)) {
                                        cont++;
                                    }
                                    if (cont == 0) {
                                        eventCenter.getUserRegistry().addUser(eventEmployee);
                                    } else {
                                        System.out.println("User already exists.");
                                    }

                                }
                            } else {
                                eventCenter.getUserRegistry().addUser(eventEmployee);
                            }
                            EventEmployee employee = new EventEmployee(eventEmployee, 0);
                            exposicao1.getEventEmployeeList().addEmployee(employee);

                        }
                    }
                }

                ApplicationList applicationArrayList = exposicao1.getApplicationsList();
                NodeList applicationSetList = document.getElementsByTagName("applicationSet");
                for (int i = 0; i < applicationSetList.getLength(); i++) {
                    Element applicationSet = (Element) applicationSetList.item(i);
                    NodeList applicationList = applicationSet.getElementsByTagName("application");
                    for (int j = 0; j < applicationList.getLength(); j++) {
                        Element application = (Element) applicationList.item(j);

                        boolean accepted = Boolean.getBoolean(application.getElementsByTagName("accepted").item(0).getTextContent());
                        System.out.println(accepted);

                        String description = application.getElementsByTagName("description").item(0).getTextContent();
                        System.out.println(description);

                        float area = Float.parseFloat(application.getElementsByTagName("boothArea").item(0).getTextContent());
                        System.out.println(area);

                        int invitesQuantity = Integer.parseInt(application.getElementsByTagName("invitesQuantity").item(0).getTextContent());
                        System.out.println(invitesQuantity);

                        Application app = new Application(accepted, null, invitesQuantity, description, area);
                        NodeList reviewsList = application.getElementsByTagName("reviews");
                        for (int k = 0; k < reviewsList.getLength(); k++) {
                            Element reviews = (Element) applicationList.item(k);
                            NodeList reviewSet = reviews.getElementsByTagName("review");
                            for (int l = 0; l < reviewSet.getLength(); l++) {
                                Element review = (Element) reviewSet.item(l);

                                String justificationText = review.getElementsByTagName("text").item(0).getTextContent();
                                int faeTopicKnowledge = Integer.parseInt(review.getElementsByTagName("faeTopicKnowledge").item(0).getTextContent());
                                int eventAdequacy = Integer.parseInt(review.getElementsByTagName("eventAdequacy").item(0).getTextContent());
                                int inviteAdequacy = Integer.parseInt(review.getElementsByTagName("inviteAdequacy").item(0).getTextContent());
                                int recommendation = Integer.parseInt(review.getElementsByTagName("recommendation").item(0).getTextContent());

                                app.addEvaluation(new Review(justificationText, faeTopicKnowledge, eventAdequacy, inviteAdequacy, recommendation));
                            }
                        }
                        applicationArrayList.addApplication(app);
                    }
                    eventCenter.setApplicationList(applicationArrayList);

                    NodeList OrganizerSet = document.getElementsByTagName("OrganizerSet");
                    for (int a = 0; a < OrganizerSet.getLength(); a++) {
                        Element organizerSet = (Element) OrganizerSet.item(a);
                        NodeList organizers = organizerSet.getElementsByTagName("Organizer");

                        for (i = 0; i < organizers.getLength(); i++) {

                            Element organizer = (Element) organizers.item(i);
                            NodeList users = organizer.getElementsByTagName("user");
                            for (int j = 0; j < users.getLength(); j++) {
                                Element user = (Element) users.item(j);

                                String nomeStr = user.getElementsByTagName("name").item(0).getTextContent();
                                System.out.println(nomeStr);

                                String emailStr = user.getElementsByTagName("email").item(0).getTextContent();
                                System.out.println(emailStr);

                                String usernameStr = user.getElementsByTagName("username").item(0).getTextContent();
                                System.out.println(usernameStr);

                                String passwordStr = user.getElementsByTagName("password").item(0).getTextContent();
                                System.out.println(passwordStr);
                                
                                User organizerU = new User(nomeStr, emailStr, usernameStr, passwordStr);

                                int cont = 0;
                                if (eventCenter.getUserRegistry().size() > 0) {
                                    for (int k = 0; k < eventCenter.getUserRegistry().size(); k++) {
                                        if (eventCenter.getUserRegistry().getUser(k).equals(organizerU)) {
                                            cont++;
                                        }
                                        if (cont == 0) {
                                            eventCenter.getUserRegistry().addUser(organizerU);
                                        } else {
                                            System.out.println("User already exists.");
                                        }

                                    }
                                } else {
                                    eventCenter.getUserRegistry().addUser(organizerU);
                                }
                                if(exposicao1.getOrganizerList().size() != 0){
                                    Organizer organizerO = new Organizer(organizerU);
                                    exposicao1.getOrganizerList().addOrganizer(organizerO);
                                } else exposicao1.getOrganizerList().addOrganizer(new Organizer(new User("admin", "admin@expo.pt", "admin", "admin")));
                            }

                        }
                    }
                    eventCenter.getEventRegistry().addEvent(exposicao1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");

        } catch (IOException e) {

        } catch (ParserConfigurationException e) {

        } catch (SAXException e) {

        }
        return eventCenter;
    }


    /**
     *
     * @param filepath
     * @return
     */
    private boolean testFilepath(String filepath) {
        File file = new File(filepath);
        if (!file.exists() || (file.exists() && !file.isDirectory())) {
            System.out.println("File not found. Using default file");
            return false;
        }
        return true;
    }
}
