
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class WorkshopList {
    private List<Workshop> workshopList;

    public WorkshopList() {
        this.workshopList = new ArrayList<>();
    }

    public List<Workshop> getWorkshopList() {
        return workshopList;
    }

    public void setWorkshopList(List<Workshop> workshopList) {
        this.workshopList = workshopList;
    }

    private boolean validate(Workshop workshop) {
        for (Workshop a : workshopList) {
            if (a.equals(workshop)) {
                return false;
            }
        }
        return true;
    }

    public void addWorkshop(Workshop workshop) {
        if (validate(workshop)) {
            workshopList.add(workshop);
        } else {
            JOptionPane.showMessageDialog(null, "Can't add Workshop to the list!");
        }
    }

    public int size() {
        return workshopList.size();
    }
}
