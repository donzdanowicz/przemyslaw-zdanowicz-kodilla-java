package com.kodilla.rps;

public class Rules {
    private static final Player user = MessagesAndConditions.getUser();
    private static final Player computer = MessagesAndConditions.getComputer();
    private static final Game game = MessagesAndConditions.getGame();
    private static final String SOMETHING_WRONG = "Something went wrong.";

    private static final int[][] rules = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    public void whoWins(int usersMove, int computersMove) {
        int result = rules[usersMove-1][computersMove-1];
        switch (result) {
        case -1:
            game.setUserRoundResult(0);
            game.setComputerRoundResult(1);
            computer.addPoints();
            break;
        case 0:
            game.setUserRoundResult(0);
            game.setComputerRoundResult(0);
            break;
        case 1:
            game.setUserRoundResult(1);
            game.setComputerRoundResult(0);
            user.addPoints();
            break;
        default:
            System.out.println(SOMETHING_WRONG);
        }
    }
}