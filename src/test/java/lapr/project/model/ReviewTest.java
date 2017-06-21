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
public class ReviewTest {

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsResviewIsEqual() throws Exception {
        Review review = new Review("box", 3, 4, 2, 5);
        assertEquals(review, review);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureSameObjectsReviewAreNotEqual() throws Exception {
        Review review = new Review("box", 3, 4, 2, 5);
        Review review2 = new Review("pencil", 4, 1, 3, 5);
        assertNotEquals(review, review2);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsReviewIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        Object expectedResult = new Object();
        assertNotEquals(review, expectedResult);
    }

    @Test
    public void EnsureToStringIsEqual() throws Exception {
        Review review = new Review("box", 3, 4, 2, 5);
        String result = review.toString();
        String expectedResult = "3 4 2 5 Justification:box";
        assertEquals(result, expectedResult);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void EnsureToStringIsNotEqual() throws Exception {
        Review review = new Review("box", 3, 4, 2, 5);
        String result = review.toString();
        String expectedResult = "2 5 1 3 Justification:pencil";
        assertNotEquals(result, expectedResult);

    }

    /**
     *
     */
    @Test
    public void EnsureGetAssignmentIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 0);
        Assignment assignment = new Assignment(eventEmployee);
        review.setAssignment(assignment);
        Assignment result = review.getAssignment();
        assertEquals(result, assignment);
    }

    /**
     *
     */
    @Test
    public void EnsureGetAssignmentIsNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 0);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        User user2 = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventEmployee eventEmployee2 = new EventEmployee(user2, 3);
        Assignment assignment2 = new Assignment(eventEmployee2);
        review.setAssignment(assignment2);
        Assignment result = review.getAssignment();
        assertNotEquals(result, assignment);
    }

    /**
     *
     */
    @Test
    public void EnsureSetAssignmentIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 0);
        Assignment assignment = new Assignment(eventEmployee);
        review.setAssignment(assignment);
        Assignment result = review.getAssignment();
        assertEquals(result, assignment);
    }

    /**
     *
     */
    @Test
    public void EnsureSetAssignmentIsNotEqual() {
        User user = new User("Miguel", "miguel@gmail.com", "miguel4", "miguel123");
        EventEmployee eventEmployee = new EventEmployee(user, 0);
        Assignment assignment = new Assignment(eventEmployee);
        Review review = new Review("box", 3, 4, 2, 5);
        User user2 = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventEmployee eventEmployee2 = new EventEmployee(user2, 3);
        Assignment assignment2 = new Assignment(eventEmployee2);
        review.setAssignment(assignment2);
        Assignment result = review.getAssignment();
        assertNotEquals(result, assignment);
    }

    /**
     *
     */
    @Test
    public void EnsureGetKnowledgeIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getKnowledge();
        int expectedResult = 3;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetKnowledgeIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getKnowledge();
        int expectedResult = 1;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetKnowledgeIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setKnowledge(4);
        int result = review.getKnowledge();
        int expectedResult = 4;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetKnowledgeIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setKnowledge(5);
        int result = review.getKnowledge();
        int expectedResult = 3;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetTextDiscritionIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        String result = review.getTextDescription();
        String expectedResult = "box";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetTextDiscritionIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        String result = review.getTextDescription();
        String expectedResult = "pencil";
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetMeanValueIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        double result = review.getMeanValue();
        double expectedResult = (3 + 4 + 2 + 5) / 4.0;
        assertEquals(result, expectedResult, 0.0);
    }

    /**
     *
     */
    @Test
    public void EnsureGetMeanValueIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        double result = review.getMeanValue();
        double expectedResult = (2 + 4 + 2 + 5) / 4.0;
        assertNotEquals(result, expectedResult, 0.0);
    }
 /**
     *
     */
    @Test
    public void EnsureGetApplicationIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getApplication();
        int expectedResult = 4;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetApplicationIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getApplication();
        int expectedResult = 1;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetApplicationIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setApplication(2);
        int result = review.getApplication();
        int expectedResult = 2;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetApplicationIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setApplication(5);
        int result = review.getApplication();
        int expectedResult = 4;
        assertNotEquals(result, expectedResult);
    }
/**
     *
     */
    @Test
    public void EnsureGetInvitationIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getInvitation();
        int expectedResult = 2;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetInvittionIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getInvitation();
        int expectedResult = 1;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetInvitationIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setInvitation(1);
        int result = review.getInvitation();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetInvitationIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setInvitation(5);
        int result = review.getInvitation();
        int expectedResult = 2;
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureGetOverallIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getOverall();
        int expectedResult = 5;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureGetOverallIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        int result = review.getOverall();
        int expectedResult = 1;
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetOverallIsEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setOverall(2);
        int result = review.getOverall();
        int expectedResult = 2;
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureSetOverallIsNotEqual() {
        Review review = new Review("box", 3, 4, 2, 5);
        review.setOverall(4);
        int result = review.getOverall();
        int expectedResult = 5;
        assertNotEquals(result, expectedResult);
    }
    @Test
    public void ensureHashCodeIsCorrect() {
        Review firstReview = new Review("box", 3, 4, 2, 5);;
        int expected = 1933589199;
        int result = Math.abs(firstReview.hashCode());
        assertEquals(expected, result);
    }
}
