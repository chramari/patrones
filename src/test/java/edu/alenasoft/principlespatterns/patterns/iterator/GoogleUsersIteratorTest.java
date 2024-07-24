package edu.alenasoft.principlespatterns.patterns.iterator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GoogleUsersIteratorTest {

    @Test
    void functional_test() {
        var googleClient = new GoogleApiClient(); // 2 users
        var iterator = new GoogleUsersIterator(googleClient.getGoogleUsers());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertTrue(iterator.isDone());

        Assertions.assertNotNull(iterator.currentItem());
    }
}
