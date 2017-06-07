/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Expert {
    
    private String name;
    private AreaOfExpertiseList expertiseAreas;

        public Expert(String name, AreaOfExpertiseList expertiseArea) {
            this.name = name;
            this.expertiseAreas = expertiseArea;
        }

    public AreaOfExpertiseList getExpertiseAreas() {
        return expertiseAreas;
    }

    public void setExpertiseAreas(AreaOfExpertiseList expertiseAreas) {
        this.expertiseAreas = expertiseAreas;
    }
    

}
