package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;
}
