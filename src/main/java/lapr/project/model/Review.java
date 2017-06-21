/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MarioDias
 */
public class Review implements Serializable {

    private static final long serialVersionUID = 1;
    private int knowledge;
    private int application;
    private int invitation;
    private int overall;
    private String textDescription;
    private float meanValue;
    private final int TOTALFIELDS = 4;
    private Assignment assignment;

    /**
     *
     * @param textDescription
     * @param knowledge
     * @param application
     * @param invitation
     * @param overall
     */
    public Review(String textDescription, int knowledge, int application, int invitation, int overall) {
        this.textDescription = textDescription;
        this.knowledge = knowledge;
        this.application = application;
        this.invitation = invitation;
        this.overall = overall;
        this.meanValue = (this.knowledge + this.application + this.invitation + this.overall) / (float) TOTALFIELDS;
        
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    
    public Assignment getAssignment() {
        return assignment;
    }

    
    
    public float getMeanValue() {
        return meanValue;
    }

    /**
     *
     * @return
     */
    public int getKnowledge() {
        return knowledge;
    }

    /**
     *
     * @param knowledge
     */
    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getTextDescription() {
        return textDescription;
    }

    /**
     *
     * @return
     */
    public int getApplication() {
        return application;
    }

    /**
     *
     * @param application
     */
    public void setApplication(int application) {
        this.application = application;
    }

    /**
     *
     * @return
     */
    public int getInvitation() {
        return invitation;
    }

    /**
     *
     * @param invitation
     */
    public void setInvitation(int invitation) {
        this.invitation = invitation;
    }

    /**
     *
     * @return
     */
    public int getOverall() {
        return overall;
    }

    /**
     *
     * @param overall
     */
    public void setOverall(int overall) {
        this.overall = overall;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Review other = (Review) obj;
        return Objects.equals(this.assignment, other.assignment);
    }

    @Override
    public String toString() {
        return knowledge + " " + application + " " + invitation + " " + overall + " Justification:" + textDescription;
    }

}
