package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTestSuite {
    @Test
    public void testUpdate() {
        // Given
        Tasks johnSmithTaskQueue = new Tasks("John Smith");
        Tasks samMendesTaskQueue = new Tasks("Sam Mendes");
        Tasks aliciaTowersTaskQueue = new Tasks("Alicia Towers");
        Mentor mattRhino = new Mentor("mrhino");
        Mentor jackJones = new Mentor("jjones");

        // When
        johnSmithTaskQueue.registerObserver(mattRhino);
        samMendesTaskQueue.registerObserver(mattRhino);
        aliciaTowersTaskQueue.registerObserver(jackJones);
        johnSmithTaskQueue.addTask("Update for loop");
        johnSmithTaskQueue.addTask("Finish documentation");
        samMendesTaskQueue.addTask("Check implementation");
        samMendesTaskQueue.addTask("Find bugs in the code");
        samMendesTaskQueue.addTask("Contact frontend developer");
        aliciaTowersTaskQueue.addTask("Check MySQL database");
        aliciaTowersTaskQueue.addTask("Correct the code");

        // Then
        assertEquals(5, mattRhino.getUpdateCount());
        assertEquals(2, jackJones.getUpdateCount());
    }
}
