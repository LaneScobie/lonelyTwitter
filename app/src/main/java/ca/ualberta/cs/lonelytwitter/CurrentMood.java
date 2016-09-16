package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by scobie on 9/15/16.
 */
public abstract class CurrentMood{
    private Date date;
    private String mood;

    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String getMood();

}
