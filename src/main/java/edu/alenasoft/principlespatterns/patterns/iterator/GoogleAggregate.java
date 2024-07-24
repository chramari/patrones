package edu.alenasoft.principlespatterns.patterns.iterator;

public class GoogleAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    var client = new GoogleApiClient();
    return new GoogleUsersIterator(client.getGoogleUsers());
  }
}
