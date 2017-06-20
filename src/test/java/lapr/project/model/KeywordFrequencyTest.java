/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class KeywordFrequencyTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectKeywordFrequencyIsEqual() {
        Keyword keyword = new Keyword("bad");
        KeywordList list = new KeywordList();
        list.addKeyword(keyword);
        KeywordFrequency result = new KeywordFrequency(list);
        assertEquals(result, result);
    }

    /**
     *
     */
    @Test
    public void EnsureSameObjectsKeywordFrequencyAreNotEqual() {
        Keyword keyword = new Keyword("bad");
        KeywordList list = new KeywordList();
        list.addKeyword(keyword);
        KeywordFrequency result = new KeywordFrequency(list);
        Keyword keyword2 = new Keyword("good");
        KeywordList list2 = new KeywordList();
        list2.addKeyword(keyword);
        list2.addKeyword(keyword2);
        KeywordFrequency expectedResult = new KeywordFrequency(list2);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsKeywordFrequencyAreNotEqual() {
        Keyword keyword = new Keyword ("bad");
        KeywordList list = new KeywordList();
        list.addKeyword(keyword);
        KeywordFrequency result = new KeywordFrequency(list);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }
     /**
     *
     */
    @Test
    public void EnsureGetKeywordFrequencyIsEqual() {
        Keyword keyword = new Keyword ("bad");
        KeywordList list = new KeywordList();
        list.addKeyword(keyword);
        KeywordFrequency keywordFrequency = new KeywordFrequency(list);
        Integer result = keywordFrequency.getFrequencies().get(0);
        Integer expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetKeywordFrequencyIsNotEqual() {
        Keyword keyword = new Keyword ("bad");
        KeywordList list = new KeywordList();
        list.addKeyword(keyword);
        KeywordFrequency keywordFrequency = new KeywordFrequency(list);
        Integer result = keywordFrequency.getFrequencies().get(0);
        Integer expectedResult = 2;
        assertNotEquals(result, expectedResult);
    }
}
