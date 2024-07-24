package edu.alenasoft.principlespatterns.patterns.iterator;

public class CREAggregate implements Aggregate{
    private final CREApiClient creApiClient;

    public CREAggregate() {

        this.creApiClient = new  CREApiClient();
    }
    @Override
    public Iterator createIterator() {
        return new CREUserIterator(creApiClient.getCREinfo());
    }
}
