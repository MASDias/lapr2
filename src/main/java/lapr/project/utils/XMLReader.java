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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.model.EventCenter;
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
    public XMLReader(String fileUsers, String fileStands, String fileLocations){
        
        if(!testFilepath(fileUsers)){
            filepathUsers = DEFAULT_FILENAME_USERS;
        } else{
            filepathUsers = fileUsers;
        }
        if(!testFilepath(fileStands)){
            filepathStands = DEFAULT_FILENAME_USERS;
        } else {
            filepathStands = fileStands;
        }
        if(!testFilepath(fileLocations)){
            filepathLocations = DEFAULT_FILENAME_LOCATIONS;
        } else {
            filepathLocations = fileLocations;
        }
    }
    
    /**
     *
     */
    public XMLReader(){
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
    }
    
    /**
     *
     * @param filepath
     * @return
     */
    private boolean testFilepath(String filepath){
        File file = new File(filepath);
        if(!file.exists() || (file.exists() && !file.isDirectory())) { 
            System.out.println("File not found. Using default file");
            return false;
        }
        return true;
    }
}
