package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Workshop implements Serializable {

    private static final long serialVersionUID = 1;
    private Theme theme;
    private String name;

    /**
     *
     * @param name
     * @param expertList
     * @param theme
     */
    public Workshop(String name, Theme theme) {
        this.theme = theme;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Workshop name: " + name + " " + theme;
    }

}
