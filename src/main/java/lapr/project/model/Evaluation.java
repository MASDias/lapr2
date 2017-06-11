/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author MarioDias
 */
public class Evaluation {

    private int knowledge;
    private int application;
    private int invitation;
    private int overall;
    private int TOTAL_EVALUATION_AREAS = 3;

    /**
     *
     * @param knowledge
     * @param application
     * @param invitation
     */
    public Evaluation(int knowledge, int application, int invitation) {
        this.knowledge = knowledge;
        this.application = application;
        this.invitation = invitation;
        this.overall = (this.knowledge + this.application + this.invitation) / TOTAL_EVALUATION_AREAS;
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
}
