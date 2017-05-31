package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 
 */
public class Exposition extends Event{

    public Exposition() {
    }

    public Exposition(String m_sTitle, String m_sDescription, Date m_dEventBegin, Date m_dEventEnd, Local m_lLocal) {
        super(m_sTitle, m_sDescription, m_dEventBegin, m_dEventEnd, m_lLocal);
    }
    
}
