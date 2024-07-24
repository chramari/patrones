package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookApiClient {

    public List<FacebookUser> getFacebookUsers() {
        List<FacebookUser> facebookUsers = new ArrayList<>(4);
        facebookUsers.add(new FacebookUser("One", "One@doe.com"));
        facebookUsers.add(new FacebookUser("Two", "Two@doe.com"));
        facebookUsers.add(new FacebookUser("Three", "Three@doe.com"));
        facebookUsers.add(new FacebookUser("four", "four@doe.com"));

        return facebookUsers;
    }
}
