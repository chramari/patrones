package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.List;

public class FacebookUserIterator implements Iterator<FacebookUser> {

    private final List<FacebookUser> users;
    private int currentPosition = 0;

    public FacebookUserIterator(List<FacebookUser> users) {
        this.users = users;
    }

    @Override
    public FacebookUser next() {
        return this.users.get(currentPosition++);
    }

    @Override
    public boolean isDone() {
        return this.currentPosition >= this.users.size();
    }

    @Override
    public FacebookUser currentItem() {
        return this.users.get(currentPosition);
    }
}
