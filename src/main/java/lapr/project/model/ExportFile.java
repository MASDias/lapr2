/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ExportFile implements Serializable{
private static final long serialVersionUID = 1;
    private EventCenter eventCenter;
    private String fileName;

    public ExportFile(String fileName, EventCenter eventCenter) throws Exception {
        this.fileName = fileName;
        this.eventCenter = eventCenter;
        
        FileOutputStream outFile = new FileOutputStream(fileName);
        ObjectOutputStream outObject = new ObjectOutputStream(outFile);
        outObject.writeObject(eventCenter);
        outObject.close();
    }
    
}
