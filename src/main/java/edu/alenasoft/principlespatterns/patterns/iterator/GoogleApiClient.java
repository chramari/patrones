package edu.alenasoft.principlespatterns.patterns.iterator;

public class GoogleApiClient {

    public GoogleUser[] getGoogleUsers() {
        GoogleUser[] users = new GoogleUser[2];
        users[0] = new GoogleUser("John", "john@one.com");
        users[1] = new GoogleUser("Doe", "jane@two.com");

        return users;
    }
}
