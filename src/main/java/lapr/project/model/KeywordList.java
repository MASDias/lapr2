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
public class KeywordList implements Serializable{
private static final long serialVersionUID = 1;
    private List<Keyword> keywordList;

    /**
     *
     */
    public KeywordList() {
        this.keywordList = new ArrayList<>();
    }

    
    private boolean validate(Keyword keyword) {
        for (Keyword u : keywordList) {
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
        if (validate(keyword)) {
            keywordList.add(keyword);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return keywordList.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public Keyword getKeyword(int index) {
        return keywordList.get(index);
    }
}
