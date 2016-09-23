package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by scobie on 9/15/16.
 */
public class Sad extends CurrentMood{

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    public String getMood(){
        return "Sad :(";
    }
}
