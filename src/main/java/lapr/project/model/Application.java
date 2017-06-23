/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Application implements Serializable {

    private static final long serialVersionUID = 1;
    private Enterprise enterprise;
    private ArrayList<Review> reviewList;
    private String description;
    private int invites;
    private float area;
    private boolean decision;
    private boolean evaluated;
    private Event event;
    private EventEmployeeList eventEmployeeList;
    private KeywordList keywordList;
    private String user;
    private ProductList productList;
    private Stand stand;

    /**
     *
     * @param enterprise
     * @param invites
     * @param area
     * @param description
     */
    public Application(Enterprise enterprise, int invites, String description, float area) {
        this.enterprise = enterprise;
        this.description = description;
        this.invites = invites;
        this.area = area;
        this.evaluated = false;
        this.reviewList = new ArrayList<>();
        this.eventEmployeeList = new EventEmployeeList();
        this.keywordList = new KeywordList();
        this.productList = new ProductList();

    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setInvites(int invites) {
        this.invites = invites;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setKeywordList(KeywordList keywordList) {
        this.keywordList = keywordList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public float getArea() {
        return area;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isEvaluated() {
        return evaluated;
    }

    public void setEvaluated(boolean evaluated) {
        this.evaluated = evaluated;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public KeywordList getKeywordList() {
        return keywordList;
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    /**
     *
     * @return
     */
    public int getInvites() {
        return invites;
    }

    /**
     *
     * @return
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param index
     * @return
     */
    public Review getEvaluation(int index) {
        return reviewList.get(index);
    }

    /**
     *
     * @param evaluation
     */
    public void addEvaluation(Review evaluation) {
        reviewList.add(evaluation);
    }

    @Override
    public String toString() {
        return enterprise.toString() + "; Invites:" + invites + "; Description:" + description;
    }

}
