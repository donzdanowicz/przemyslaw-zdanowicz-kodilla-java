package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Tasks implements TaskObservable {
    private final List<TaskObserver> observers;
    private final Queue<String> tasks;
    private final String name;

    public Tasks(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
