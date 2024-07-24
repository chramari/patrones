package edu.alenasoft.principlespatterns.patterns.iterator;

public class FacebookAggregate implements Aggregate {

    private final FacebookApiClient facebookApiClient;

    public FacebookAggregate() {
        facebookApiClient = new FacebookApiClient();
    }

    @Override
    public Iterator createIterator() {
        return new FacebookUserIterator(facebookApiClient.getFacebookUsers());
    }
}
