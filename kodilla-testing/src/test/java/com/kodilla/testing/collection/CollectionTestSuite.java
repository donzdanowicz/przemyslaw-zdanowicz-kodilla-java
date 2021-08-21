package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Collection Test Case begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Collection Test Case end");
    }



    @DisplayName("when created empty evenNumbers list"
            + "then evenNumbers list should equal to an empty noNumbers list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = exterminator.exterminate(numbers);
        List<Integer> noNumbers = new ArrayList<>();
        //Then
        Assertions.assertEquals(noNumbers, evenNumbers);
    }

    @DisplayName("when created new numbers List" + "then class prints out only even numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        for (int n = 0; n < 6; n++) {
            numbers.add(n+1);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = exterminator.exterminate(numbers);
        List<Integer> testedNumbers = new ArrayList<>();
        testedNumbers.add(2);
        testedNumbers.add(4);
        testedNumbers.add(6);
        //Then
        Assertions.assertEquals(testedNumbers,evenNumbers);

        }
}
