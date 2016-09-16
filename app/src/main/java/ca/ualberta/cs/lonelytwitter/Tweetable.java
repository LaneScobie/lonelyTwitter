package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by scobie on 9/15/16.
 */

//Why interface? often used to ensure that anything that inherits from it will be able to be
// comparably sorted

public interface Tweetable {
    public String getMessage();
    public Date getDate();


}
