package com.kodilla.rps;

public class User extends Player {

    @Override
    public int getMove() {
        return MessagesAndConditions.getUsersMove();
    }

}