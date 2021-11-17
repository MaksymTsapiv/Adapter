package facebook;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    MyFacebookUser myFacebookUser;
    FacebookUser facebookUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Date date = new Date();
        myFacebookUser = new MyFacebookUser();
        facebookUser = new FacebookUser("email", "Lisabon", date);
    }

    @org.junit.jupiter.api.Test
    void getUserMail() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getUserMail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(facebookUser.getUserCountry(), myFacebookUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActiveTime() {
        assertEquals(facebookUser.getUserActiveTime(), myFacebookUser.getLastActiveTime());
    }
}