package com.kodilla.spring.portfolio;

import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList(List<String> tasks)
    {
        this.tasks = tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
