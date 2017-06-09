/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Enterprise {
    private String name;
    private String email;
    private String adress;
    private int nif;
    private int contact;

    /**
     *
     * @param name
     * @param email
     * @param adress
     * @param nif
     * @param contact
     */
    public Enterprise(String name, String email, String adress, int nif, int contact) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.nif = nif;
        this.contact = contact;
    }
    
    
}
