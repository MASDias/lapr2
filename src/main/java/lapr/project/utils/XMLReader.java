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
    
    public String filepathUsers = "";
    public String filepathStands = "";
    public String filepathLocations = "";
    public final String DEFAULT_FILENAME_USERS = "xml/UserList.xml";
    public final String DEFAULT_FILENAME_STANDS = "xml/StandsList.xml";
    public final String DEFAULT_FILENAME_LOCATIONS = "xml/LocationXml.xml";
    
    
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
    
    public XMLReader(){
        filepathUsers = DEFAULT_FILENAME_USERS;
        filepathStands = DEFAULT_FILENAME_STANDS;
        filepathLocations = DEFAULT_FILENAME_LOCATIONS;
    }
    
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
                User u = new User(null,null,null,null);
                String nomeStr = user.getElementsByTagName("Name").item(0).getTextContent();
                System.out.println("Nome: "+nomeStr);
                u.setName(nomeStr);
                
                String emailStr = user.getElementsByTagName("Email").item(0).getTextContent();
                System.out.println("Email: "+emailStr);
                u.setEmail(emailStr);
                
                String usernameStr = user.getElementsByTagName("Username").item(0).getTextContent();
                System.out.println("Username: "+usernameStr);
                u.setUserName(usernameStr);
                
                String passwordStr = user.getElementsByTagName("Password").item(0).getTextContent();
                System.out.println("Password: "+ passwordStr);
                u.setPassword(passwordStr);
                
                int key = Integer.parseInt(user.getElementsByTagName("Serialkey").item(0).getTextContent());
                System.out.println("Serial Key: "+ key);
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
                System.out.println("Adress: "+ addressStr);
                
                float area = Float.parseFloat(stand.getElementsByTagName("area").item(0).getTextContent());
                System.out.println("Area: "+ area);
                
                Stand s = new Stand(addressStr, area);
                standsList.addStand(s);
            }
            eventCenter.setStandRegistry(standsList);
            
            inputSource.setCharacterStream(new FileReader(xmlFileStands));
            document = documentBuilder.parse(inputSource);
            
            NodeList locations = document.getElementsByTagName("Location");
            LocationList locationsList = eventCenter.getLocationList();
            for (int i = 0; i < locations.getLength(); i++) {
                
                Element location = (Element)locations.item(i);
                Location l = new Location(null);
                
                String addressStr = location.getElementsByTagName("address").item(0).getTextContent();
                System.out.println("Adress: "+ addressStr);
                
                locationsList.addLocal(l);
            }
            eventCenter.setStandRegistry(standsList);
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
            
        } catch (IOException e){
            
        } catch (ParserConfigurationException e){
            
        } catch (SAXException e){
            
        }
        return eventCenter;
    }
    
    public boolean testFilepath(String filepath){
        File file = new File(filepath);
        if(!file.exists() || (file.exists() && !file.isDirectory())) { 
            System.out.println("File not found. Using default file");
            return false;
        }
        return true;
    }
}
