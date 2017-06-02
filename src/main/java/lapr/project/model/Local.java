package lapr.project.model;

/**
 *
 * @author MarioDias
 */
public class Local {

    private String address;
    private double area;

    public Local(String address, double area) {
        this.address = address;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
