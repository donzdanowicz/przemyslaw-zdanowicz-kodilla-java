package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertTrue(shopping.isTaskExecuted());
        assertEquals("Shopping", shopping.getTaskName());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertTrue(painting.isTaskExecuted());
        assertEquals("Painting", painting.getTaskName());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertTrue(driving.isTaskExecuted());
        assertEquals("Driving", driving.getTaskName());
    }
}
