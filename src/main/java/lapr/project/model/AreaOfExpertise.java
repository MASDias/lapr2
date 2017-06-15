package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author MarioDias
 */
public class AreaOfExpertise implements Serializable{
private static final long serialVersionUID = 1;
    private String areaExpertise;

    /**
     *
     * @param areaExpertise
     */
    public AreaOfExpertise(String areaExpertise) {
        this.areaExpertise = areaExpertise;
    }

}
