package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User bob = new Millenials("Bob Marley");
        User stephen = new YGeneration("Stephen King");
        User roland = new ZGeneration("Roland Deschain");

        //When
        String bobWouldUse = bob.sharePost();
        System.out.println("Bob would use: " + bobWouldUse);
        String stephenWouldUse = stephen.sharePost();
        System.out.println("Stephen would use: " + stephenWouldUse);
        String rolandWouldUse = roland.sharePost();
        System.out.println("Roland would use: " + rolandWouldUse);

        //Then
        assertEquals("[Facebook]", bobWouldUse);
        assertEquals("[Twitter]", stephenWouldUse);
        assertEquals("[Snapchat]", rolandWouldUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User bob = new Millenials("Bob Marley");

        //When
        String bobWouldUse = bob.sharePost();
        System.out.println("Bob would use: " + bobWouldUse);
        bob.setSharingStrategy(new TwitterPublisher());
        bobWouldUse = bob.sharePost();
        System.out.println("Bob would now use: " + bobWouldUse);

        //Then
        assertEquals("[Twitter]", bobWouldUse);
    }
}
