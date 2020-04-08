package UserSystem;

import java.util.Date;

public class Ban{
    private String Nick;
    private boolean isBanned;
    private Date beginDate;
    private Date endDate;

    public Ban(String Nick, boolean isBanned, Date beginDate, Date endDate) {
        this.Nick = Nick;
        this.isBanned = isBanned;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }     

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        Nick = nick;
    }
    
}