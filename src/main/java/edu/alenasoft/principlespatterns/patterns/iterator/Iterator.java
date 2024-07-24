package edu.alenasoft.principlespatterns.patterns.iterator;

public interface Iterator<T> {

    T next();
    boolean isDone();
    T currentItem();
}
