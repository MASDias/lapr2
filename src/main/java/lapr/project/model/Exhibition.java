package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Exhibition extends Event {

    /**
     *
     * @param title
     * @param description
     * @param eventBegin
     * @param eventEnd
     * @param eventSubmissionBegin
     * @param eventSubmissionEnd
     * @param local
     * @param invites
     */

    public Exhibition(String title, String description, Date eventBegin, Date eventEnd, Date eventSubmissionBegin, Date eventSubmissionEnd, Location local, int invites) {
        super(title, description, eventBegin, eventEnd, eventSubmissionBegin, eventSubmissionEnd, local, invites);
    }

}
