package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("This is a task to do.");
        System.out.println(board.getToDoList().getTasks());
        board.getInProgressList().addTask("This is a task in progress.");
        System.out.println(board.getInProgressList().getTasks());
        board.getDoneList().addTask("This is a task done.");
        System.out.println(board.getDoneList().getTasks());

        //Then
        assertEquals("This is a task to do.", board.getToDoList().getTasks().get(0));
        assertEquals("This is a task in progress.", board.getInProgressList().getTasks().get(0));
        assertEquals("This is a task done.", board.getDoneList().getTasks().get(0));
    }
}
