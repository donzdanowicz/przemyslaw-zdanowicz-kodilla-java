package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList(new ArrayList<>());

    }
}
