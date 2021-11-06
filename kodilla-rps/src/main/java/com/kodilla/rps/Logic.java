package com.kodilla.rps;

public class Logic {
    private final Player user = MessagesAndConditions.getUser();
    private final Player computer = MessagesAndConditions.getComputer();
    private final Game game = MessagesAndConditions.getGame();
    private final Rules rules = new Rules();
    private boolean end = false;
    private boolean newGame = false;

    public void getLogic() {

        MessagesAndConditions.getName();

        while (!end) {
            MessagesAndConditions.howManyRounds();
            MessagesAndConditions.instructions();

            user.setPoints(0);
            computer.setPoints(0);

            while (user.getPoints() < game.getRounds() && computer.getPoints() < game.getRounds() && !end && !newGame) {
                int usersMove = user.getMove();
                int computersMove = computer.getMove();

                if (usersMove != 0) {
                    rules.whoWins(usersMove, computersMove);
                    MessagesAndConditions.results(usersMove, computersMove);
                } else {
                    MessagesAndConditions.areYouSure();
                    end = MessagesAndConditions.endGame();
                    newGame = MessagesAndConditions.newGame();
                }
            }
            MessagesAndConditions.setNewGame(false);
            MessagesAndConditions.winner();
        }
    }
}