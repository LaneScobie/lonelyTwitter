package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by scobie on 9/15/16.
 */
public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<CurrentMood> MoodList;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }


    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public ArrayList<CurrentMood> getMoodList() {
        return MoodList;
    }

    public void setMoodList(ArrayList<CurrentMood> moodList) {
        MoodList = moodList;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
