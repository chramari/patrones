package edu.alenasoft.principlespatterns.patterns.iterator;
import java.util.Map;
import java.util.Set;

public class CREUserIterator implements  Iterator{
    private final Map<Integer, UserData> users;
    private int currentPosition = 0;

    public CREUserIterator(Map<Integer, UserData> users) {
        this.users = users;
    }

    @Override
    public UserData next() {
        Integer[] keys = users.keySet().toArray(new Integer[0]);
        var user = users.get(keys[currentPosition]);
        currentPosition++;
        return user;
    }

    @Override
    public boolean isDone() {
        return currentPosition >= users.keySet().size();
    }

    @Override
    public UserData currentItem() {
        Integer[] keys = users.keySet().toArray(new Integer[0]);
        if(isDone()){
            currentPosition = users.keySet().size() -1;
        }
        return users.get(keys[currentPosition]);
    }
}
