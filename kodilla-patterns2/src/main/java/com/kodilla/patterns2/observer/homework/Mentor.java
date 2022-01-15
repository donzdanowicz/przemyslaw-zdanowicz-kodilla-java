package com.kodilla.patterns2.observer.homework;



public class Mentor implements TaskObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Tasks tasks) {
        System.out.println(username + ": New tasks in a queue of " + tasks.getName() + "\n" +
                " (total: " + tasks.getTasks().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
