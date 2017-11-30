/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarioDias
 */
public class KeywordList implements Serializable {

    private static final long serialVersionUID = 1;
    private List<Keyword> listKeywords;

    /**
     *
     */
    public KeywordList() {
        this.listKeywords = new ArrayList<>();
    }
    
    public void setKeyword(int index, Keyword keyword){
        this.listKeywords.set(index, keyword);
    }
    public boolean validate(Keyword keyword) {
        for (Keyword u : listKeywords) {
            if (u.equals(keyword)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param keyword
     */
    public void addKeyword(Keyword keyword) {
        listKeywords.add(keyword);
    }

    /**
     *
     * @return
     */
    public int size() {
        return listKeywords.size();
    }

    /**
     *
     * @param index
     * @return
     */
    public Keyword getKeyword(int index) {
        return listKeywords.get(index);
    }
}
