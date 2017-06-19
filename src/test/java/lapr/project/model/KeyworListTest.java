/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class KeyworListTest {

    @Test
    public void EnsureAddKeywordMethodAddsLocalToList() throws Exception {
        KeywordList list = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list.addKeyword(k2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size, expectedResult);
    }
    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddKeywordMethodAddsUserToListIsValid() throws Exception {
        KeywordList list1 = new KeywordList();
        Keyword keyword = new Keyword("123456789");
        list1.addKeyword(keyword);
        boolean expectedResult = true;
        boolean result=list1.validate(keyword);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddKeywordMethodAddsUserToListNotValid() throws Exception {
        KeywordList list1 = new KeywordList();
        Keyword keyword = new Keyword("123456789");
        list1.addKeyword(keyword);
        boolean expectedResult = false;
        boolean result=list1.validate(keyword);
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureAddKeywordMethodAddsUserToListIndex() throws Exception {
        KeywordList list = new KeywordList();
        Keyword result = new Keyword("123456789");
        list.addKeyword(result);
        Keyword expectedResult = list.getKeyword(0);
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsKeywordListAreEqual() throws Exception {

        KeywordList list = new KeywordList();
        Keyword keyword = new Keyword("123456789");

        list.addKeyword(keyword);
        assertEquals(list, list);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsKeywordListAreNotEqual() throws Exception {
        Keyword keyword = new Keyword ("123456789");
        KeywordList k1 = new KeywordList();
        KeywordList k2 = new KeywordList();
        k1.addKeyword(keyword);
        assertNotEquals(k1, k2);
    }
    public void EnsureValidate() {
        KeywordList list = new KeywordList();
        Keyword keyword = new Keyword ("123456789");
        list.addKeyword(keyword);
        list.addKeyword(keyword);
        int result = list.size();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
    @Test
    public void EnsureGetKeywordIsEqual() throws Exception {
        KeywordList list = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list.addKeyword(k2);
        list.setKeyword(0, k2);
        Keyword result = list.getKeyword(0);
        assertEquals(k2, result);
    }
     @Test
    public void EnsureGetKeywordIsNotEqual() throws Exception {
        KeywordList list = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list.addKeyword(k2);
        list.setKeyword(0, k2);
        Keyword result = list.getKeyword(0);
        assertNotEquals(k1, result);
    }
     @Test
    public void EnsureSetKeywordIsEqual() throws Exception {
        KeywordList list = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list.addKeyword(k2);
        list.setKeyword(0, k2);
        Keyword result = list.getKeyword(0);
        assertEquals(k2, result);
    }
     @Test
    public void EnsureSetKeywordIsNotEqual() throws Exception {
        KeywordList list = new KeywordList();
        Keyword k1 = new Keyword("123456789");
        Keyword k2 = new Keyword("qwerty");
        list.addKeyword(k1);
        list.addKeyword(k2);
        list.setKeyword(0, k2);
        Keyword result = list.getKeyword(0);
        assertNotEquals(k1, result);
    }
}
