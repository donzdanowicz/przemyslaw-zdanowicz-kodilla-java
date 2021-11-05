package com.kodilla.rps;

public class Rules {


    int[][] rules = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    public int whoWins(User user, Computer computer, int usersMove, int computersMove) {
        int result = rules[usersMove-1][computersMove-1];
        switch (result) {
        case -1:
            user.setUserRoundResult(0);
            computer.setComputerRoundResult(1);
            computer.setComputerCount(computer.getComputerCount() + 1);
            break;
        case 0:
            user.setUserRoundResult(0);
            computer.setComputerRoundResult(0);
            break;
        case 1:
            user.setUserRoundResult(1);
            computer.setComputerRoundResult(0);
            user.setUserCount(user.getUserCount() + 1);
            break;
        default:
            System.out.println("Something went wrong.");
        }

        return result;

    }
}
