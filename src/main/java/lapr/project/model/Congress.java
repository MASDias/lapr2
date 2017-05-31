package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Congress extends Event{

    public Congress() {
    }

    public Congress(String m_sTitle, String m_sDescription, Date m_dEventBegin, Date m_dEventEnd, Local m_lLocal) {
        super(m_sTitle, m_sDescription, m_dEventBegin, m_dEventEnd, m_lLocal);
    }
    
}
