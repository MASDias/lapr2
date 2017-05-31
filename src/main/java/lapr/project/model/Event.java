package lapr.project.model;

import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Event {

    
    private String m_sTitle;
    private String m_sDescription;
    private Date m_dEventBegin;
    private Date m_dEventEnd;
    private Local m_lLocal;

    public Event() {
    }

    public Event(String m_sTitle, String m_sDescription, Date m_dEventBegin, Date m_dEventEnd, Local m_lLocal) {
        this.m_sTitle = m_sTitle;
        this.m_sDescription = m_sDescription;
        this.m_dEventBegin = m_dEventBegin;
        this.m_dEventEnd = m_dEventEnd;
        this.m_lLocal = m_lLocal;
    }

    public String getM_sTitle() {
        return m_sTitle;
    }

    public void setM_sTitle(String m_sTitle) {
        this.m_sTitle = m_sTitle;
    }

    public String getM_sDescription() {
        return m_sDescription;
    }

    public void setM_sDescription(String m_sDescription) {
        this.m_sDescription = m_sDescription;
    }

    public Date getM_dEventBegin() {
        return m_dEventBegin;
    }

    public void setM_dEventBegin(Date m_dEventBegin) {
        this.m_dEventBegin = m_dEventBegin;
    }

    public Date getM_dEventEnd() {
        return m_dEventEnd;
    }

    public void setM_dEventEnd(Date m_dEventEnd) {
        this.m_dEventEnd = m_dEventEnd;
    }

    public Local getM_lLocal() {
        return m_lLocal;
    }

    public void setM_lLocal(Local m_lLocal) {
        this.m_lLocal = m_lLocal;
    }
}
