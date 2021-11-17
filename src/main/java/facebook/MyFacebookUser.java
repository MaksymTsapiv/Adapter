package facebook;

import user.User;

import java.util.Date;

public class MyFacebookUser implements User {
    Date date = new Date();
    FacebookUser facebookUser = new FacebookUser("email", "Lisabon", date);

    @Override
    public String getUserMail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
