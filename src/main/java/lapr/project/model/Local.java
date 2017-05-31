package lapr.project.model;

/**
 *
 * @author MarioDias
 */
public class Local {

    private String m_sAddress;
    private double m_dArea;

    public Local() {
        
    }

    public Local(String m_sAddress, double m_dArea) {
        this.m_sAddress = m_sAddress;
        this.m_dArea = m_dArea;
    }

    public String getM_sAddress() {
        return m_sAddress;
    }

    public void setM_sAddress(String m_sAddress) {
        this.m_sAddress = m_sAddress;
    }

    public double getM_dArea() {
        return m_dArea;
    }

    public void setM_dArea(double m_dArea) {
        this.m_dArea = m_dArea;
    }
    
}
