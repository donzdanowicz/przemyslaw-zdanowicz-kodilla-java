package com.kodilla.good.patterns.challenges;

public class User {
    private int userId;
    private String name;
    private String surname;

    public User(int userId, String name, String surname) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
