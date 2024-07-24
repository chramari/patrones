package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

// Client
public class UsersPanelV2 {

  private final List<Aggregate> aggregates;

    public UsersPanelV2() {
      aggregates = new ArrayList<>();
    }

    public void addAggregate(Aggregate aggregate) {
      this.aggregates.add(aggregate);
    }

    public void show() {
      aggregates.forEach(a -> this.showItems(a.createIterator()));
    }

    private void showItems(Iterator iterator) {
      while (!iterator.isDone()) {
        System.out.println(iterator.next());
      }
    }
}
