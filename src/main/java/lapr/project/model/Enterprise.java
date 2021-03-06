/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Enterprise implements Serializable {

    private static final long serialVersionUID = 1;
    private String name;
    private String email;
    private String address;
    private int taxpayerNumber;
    private int contact;

    /**
     *
     * @param name
     * @param email
     * @param address
     * @param nif
     * @param contact
     */
    public Enterprise(String name, String email, String address, int nif, int contact) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.taxpayerNumber = nif;
        this.contact = contact;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getTaxpayerNumber() {
        return taxpayerNumber;
    }

    public int getContact() {
        return contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTaxpayerNumber(int taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enterprise:" + name;
    }

}
