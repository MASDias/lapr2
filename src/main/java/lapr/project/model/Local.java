package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Local implements Serializable{
    private static final long serialVersionUID = 1;

    private String address;
    private double area;

    public Local(String address, double area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public String toString(){
        return "Address: " +address;
    }
}
