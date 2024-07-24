package edu.alenasoft.principlespatterns.patterns.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CREUsersIteratorTest {
    @Test
    void functionalTest(){
        var creClient = new CREApiClient();
        var iterator = new CREAggregate().createIterator();

        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertTrue(iterator.isDone());
    }

    @Test
    void firstItemIsJhonWick(){
        var creClient = new CREApiClient();
        var iterator = new CREAggregate().createIterator();


        Assertions.assertEquals(new UserData("Jhon Wick", "Death street", 10.25) ,iterator.next());
    }

    @Test
    void getSecondItem(){
        var creClient = new CREApiClient();
        var iterator = new CREAggregate().createIterator();

        Assertions.assertNotNull(iterator.next());
        Assertions.assertEquals(new UserData("Bruce Wayne", "Gothic Street", 26.37) ,iterator.next());

    }

    void getThirdItem(){
        var creClient = new CREApiClient();
        var iterator = new CREAggregate().createIterator();

        Assertions.assertNotNull(iterator.next());
        Assertions.assertNotNull(iterator.next());
        Assertions.assertEquals(new UserData("Tony Stark", "Stark tower", 50.81) ,iterator.next());
    }

}
