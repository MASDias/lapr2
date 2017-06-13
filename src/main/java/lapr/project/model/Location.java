package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Location implements Serializable{
    private static final long serialVersionUID = 1;

    private String address;
    private double area;

    /**
     *
     * @param address
     * @param area
     */
    public Location(String address) {
        this.address = address;
        this.area = area;
    }

    @Override
    public String toString(){
        return "Address: " +address;
    }
}
