package twitter;

import user.User;

import java.util.Date;

public class MyTwitterUser implements User {
    Date date = new Date();
    TwitterUser twitterUser = new TwitterUser("email", "Lisabon", date);

    @Override
    public String getUserMail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
