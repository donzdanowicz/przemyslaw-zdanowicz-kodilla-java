package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(taskList(), taskList(), taskList());
    }

    @Bean
    @Scope("prototype")
    public TaskList taskList() {
        return new TaskList(new ArrayList<>());
    }

}
