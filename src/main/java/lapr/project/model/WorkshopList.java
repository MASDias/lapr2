package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class WorkshopList implements Serializable {

    private static final long serialVersionUID = 1;
    private List<Workshop> listWorkshop;

    /**
     *
     */
    public WorkshopList() {
        this.listWorkshop = new ArrayList<>();
    }

    /**
     *
     * @return
     */

    private boolean validate(Workshop workshop) {
        for (Workshop a : listWorkshop) {
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
            listWorkshop.add(workshop);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return listWorkshop.size();
    }
}
