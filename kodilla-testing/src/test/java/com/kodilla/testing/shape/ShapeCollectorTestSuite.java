package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Shape Collector Testing begins.");
    }

    @AfterAll
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to test #" + testCounter);
    }

    @Test
    void testAddFigure() {
        //Given
        Triangle triangle = new Triangle("triangle", 40);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assertions.assertEquals(1, shapeCollector.listSize());
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 40);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);
        //Then
        Assertions.assertEquals(0, shapeCollector.listSize());
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 40);
        Circle circle = new Circle("circle", 30);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
    }

    @Test
    void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 40);
        Circle circle = new Circle("circle", 19);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals("triangle, circle", shapeCollector.showFigures());
    }
}




