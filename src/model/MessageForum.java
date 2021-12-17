package model;

import java.util.Date;

public class MessageForum {
    public MessageForum (String text, String loginUser, Date date){
        this.text = text;
        this.loginUser = loginUser;
        this.date = date;
    }

    public String text;
    public String loginUser;
    public Date date;

    public MessageForum() {

    }

    public String getText() {
        return text;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public Date getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
