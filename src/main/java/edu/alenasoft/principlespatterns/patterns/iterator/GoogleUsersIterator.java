package edu.alenasoft.principlespatterns.patterns.iterator;

public class GoogleUsersIterator implements Iterator<GoogleUser> {

    private final GoogleUser[] users;
    private int currentPosition = 0;

    public GoogleUsersIterator(GoogleUser[] users) {
        this.users = users;
    }

    @Override
    public GoogleUser next() {
        return users[currentPosition++];
    }

    @Override
    public boolean isDone() {
        return currentPosition >= users.length;
    }

    @Override
    public GoogleUser currentItem() {
        if (isDone()) {
            return users[users.length - 1];
        }

        return users[currentPosition];
    }
}
