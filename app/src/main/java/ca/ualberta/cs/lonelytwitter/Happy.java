package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by scobie on 9/15/16.
 */
public class Happy extends CurrentMood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }


    public String getMood(){
        return "Happy :)";
    }
}
