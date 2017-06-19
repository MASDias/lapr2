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
public class KeywordFrequency implements Serializable {

    private static final long serialVersionUID = 1;
    private KeywordList keywordList, newKeyWordList;
    private int counter = 1;
    private ArrayList<Integer> frequencies = new ArrayList<>();

    public KeywordFrequency(KeywordList keywordList) {
        this.keywordList = keywordList;
        calculateFrequency();
    }

    private void calculateFrequency() {
        newKeyWordList = new KeywordList();
        KeywordList keyworldListNew = new KeywordList();
        for( int i = 0; i < keywordList.size(); i++){
            keyworldListNew.addKeyword(keywordList.getKeyword(i));
        }
        for (int i = 0; i < keyworldListNew.size(); i++) {
            if (!keyworldListNew.getKeyword(i).toString().equals("")) {
                if (newKeyWordList.validate(keyworldListNew.getKeyword(i))) {
                    newKeyWordList.addKeyword(keyworldListNew.getKeyword(i));
                }
                for (int j = i + 1; j < keyworldListNew.size(); j++) {
                    if (keyworldListNew.getKeyword(i).toString().equals(keyworldListNew.getKeyword(j).toString())) {
                        counter++;
                        keyworldListNew.setKeyword(j, new Keyword());
                    }
                }
                frequencies.add(counter);
                counter = 1;
            }
        }

    }

    public ArrayList<Integer> getFrequencies() {
        return frequencies;
    }

    public KeywordList getNewKeyWordList() {
        return newKeyWordList;
    }

}
