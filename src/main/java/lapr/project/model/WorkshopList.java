package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class WorkshopList implements Serializable {

    private static final long serialVersionUID = 1;
    private List<Workshop> workshopList;

    /**
     *
     */
    public WorkshopList() {
        this.workshopList = new ArrayList<>();
    }

    /**
     *
     * @return
     */

    private boolean validate(Workshop workshop) {
        for (Workshop a : workshopList) {
            if (a.equals(workshop)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param workshop
     */
    public void addWorkshop(Workshop workshop) {
        if (validate(workshop)) {
            workshopList.add(workshop);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return workshopList.size();
    }
}
