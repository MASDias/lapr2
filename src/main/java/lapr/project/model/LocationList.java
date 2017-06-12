package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class LocationList {

    private List<Location> localList;

    /**
     *
     */
    public LocationList() {
        this.localList = new ArrayList<>();
    }

    /**
     *
     * @param index
     * @return
     */
    public Location getLocal(int index) {
        return localList.get(index);
    }

    private boolean validate(Location local) {
        for (Location a : localList) {
            if (a.equals(local)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param local
     */
    public void addLocal(Location local) {
        if (validate(local)) {
            localList.add(local);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return localList.size();
    }
}
