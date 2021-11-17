package twitter;


import facebook.FacebookUser;
import facebook.MyFacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    MyTwitterUser myTwitterUser;
    TwitterUser twitterUser;

    @BeforeEach
    void setUp() {
        Date date = new Date();
        myTwitterUser = new MyTwitterUser();
        twitterUser = new TwitterUser("email", "Lisabon", date);
    }

    @Test
    void getUserMail() {
        assertEquals(twitterUser.getUserMail(), myTwitterUser.getUserMail());
    }

    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), myTwitterUser.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(twitterUser.getLastActiveTime(), myTwitterUser.getLastActiveTime());
    }
}