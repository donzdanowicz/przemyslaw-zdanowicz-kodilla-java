package com.kodilla.rps;

import java.util.Scanner;

public class MessagesAndConditions {
    private static final Scanner scan = new Scanner(System.in);
    private static final Player user = new User();
    private static final Player computer = new Computer();
    private static final Game game = new Game();
    private static boolean end = false;
    private static boolean newGame = false;
    private static final String HOW_MANY_ROUNDS = "How many rounds do you want to play?";
    private static final String WRONG_KEY_CHOOSE_A_NUMBER = "Wrong key! \n" +
            "Try again. This time choose a number between 0 and 99.";
    private static final String CHOOSE_YOUR_MOVE = "Choose your move.";
    private static final String KEY_1 = "1";
    private static final String KEY_2 = "2";
    private static final String KEY_3 = "3";
    private static final String KEY_Y = "y";
    private static final String KEY_N = "n";
    private static final String KEY_X = "x";
    private static final String EXCLAMATION_MARK = "!";
    private static final String YOUR_MOVE = "Your move: ";
    private static final String COMPUTER = "Computer : ";
    private static final String COMPUTER_2 = " Computer: ";
    private static final String ROUND_RESULT = "Result of this round is: \n";
    private static final String GAME_RESULT = "Result of the game is: \n";
    private static final String COLON = ": ";
    private static final String QUOTE = "";
    private static final String DO_YOU_WANT_TO_STOP_GAME = "Do you want to stop this game? Type in Y/N";
    private static final String GAME_CONTINUES = "Game continues.";
    private static final String YOU_WIN = "Congratulations! You win, ";
    private static final String YOU_LOSE = "You lose!";
    private static final String NEW_GAME = "\nNEW GAME";
    private static final String HELLO = "Hello! What's your name?";
    private static final String HI = "Hi, ";
    private static final String SMILE = " :)";
    private static final String INSTRUCTIONS_1 = "Instructions: \nKey 1: Rock \nKey 2: Paper \nKey 3: Scissors";
    private static final String INSTRUCTIONS_2 = "Key x: End game. \nKey n: New game.";
    private static final String WRONG_KEY = "Wrong key. Try again!";
    private static final String DO_YOU_WANT_TO_PLAY_AGAIN = "Do you want to play again (Key N) or quit (Key X) ?";
    private static final String ARE_YOU_SURE_TO_END = "Are you sure you want to end the game? Type in: Y/N";
    private static final String THE_END_OF_GAME = "\nTHE END OF GAME.";
    private static final String ARE_YOU_SURE_NEW_GAME = "Are you sure you want to start a new game? Type in: Y/N";
    private static final String STARTING_NEW_GAME = "Starting a new game.";

    public static void setNewGame(boolean newGame) {
        MessagesAndConditions.newGame = newGame;
    }

    public static Player getUser() {
        return user;
    }

    public static Player getComputer() {
        return computer;
    }

    public static Game getGame() {
        return game;
    }

    public static int getUsersMove() {
        boolean goodValue = false;
        int usersMove = 0;
        while (!goodValue) {
            System.out.println(CHOOSE_YOUR_MOVE);
            String usersKey = scan.nextLine();

            if (KEY_1.equals(usersKey) || KEY_2.equals(usersKey) || KEY_3.equals(usersKey)) {
                usersMove = Integer.parseInt(usersKey);
                goodValue = true;
            } else if (KEY_N.equalsIgnoreCase(usersKey) || KEY_X.equalsIgnoreCase(usersKey)) {
                goodValue = true;
            } else {
                System.out.println(WRONG_KEY);
            }
        }
        return usersMove;
    }

    public static void howManyRounds() {
        System.out.println(HOW_MANY_ROUNDS);
        boolean key = false;
        String setRoundsNumber;
        int rounds = 0;
        while (!key) {
            setRoundsNumber = scan.nextLine();
            key = setRoundsNumber.chars().allMatch(Character::isDigit);
            if (QUOTE.equals(setRoundsNumber) || !key) {
                System.out.println(WRONG_KEY_CHOOSE_A_NUMBER);
                key = false;
            } else {
                rounds = Integer.parseInt(setRoundsNumber);
                if (rounds < 100) {
                    game.setRounds(rounds);
                } else {
                    System.out.println(WRONG_KEY_CHOOSE_A_NUMBER);
                    key = false;
                }
            }
        }
        game.setRounds(rounds);
    }

    public static void results(int usersMove, int computersMove) {
        System.out.println(YOUR_MOVE + Shape.shape(usersMove));
        System.out.println(COMPUTER + Shape.shape(computersMove));
        System.out.println(ROUND_RESULT + user.getName() + COLON + game.getUserRoundResult()
                + COMPUTER_2 + game.getComputerRoundResult());
        System.out.println(GAME_RESULT + user.getName() + COLON + user.getPoints()
                + COMPUTER_2 + computer.getPoints());
    }

    public static boolean endGame() {
        return end;
    }

    public static boolean newGame() {
        return newGame;
    }

    public static void areYouSure() {
        System.out.println(DO_YOU_WANT_TO_STOP_GAME);
        String sure = scan.nextLine();
        if(KEY_Y.equalsIgnoreCase(sure)) {
            nOrXChosen();
        } else if (KEY_N.equalsIgnoreCase(sure)) {
            System.out.println(GAME_CONTINUES);
        }
    }

    public static void winner() {
        if (user.getPoints() == game.getRounds()) {
            System.out.println(YOU_WIN + user.getName() + EXCLAMATION_MARK);
        } else if (computer.getPoints() == game.getRounds()) {
            System.out.println(YOU_LOSE);
        }
    }

    public static void getName() {
        System.out.println(NEW_GAME);
        System.out.println(HELLO);
        user.setName(scan.nextLine());
        System.out.println(HI + user.getName() + SMILE);
    }

    public static void instructions() {
        System.out.println(INSTRUCTIONS_1);
        System.out.println(INSTRUCTIONS_2);
    }

    public static void nOrXChosen() {
        boolean nxChosen = false;

        while (!nxChosen) {
            System.out.println(DO_YOU_WANT_TO_PLAY_AGAIN);
            String nx = scan.nextLine();

            if (KEY_X.equalsIgnoreCase(nx)) {
                System.out.println(ARE_YOU_SURE_TO_END);
                String areYouSure = scan.nextLine();
                if (KEY_Y.equalsIgnoreCase(areYouSure)) {
                    System.out.println(THE_END_OF_GAME);
                    end = true;
                }
                nxChosen = true;
            } else if (KEY_N.equalsIgnoreCase(nx)) {
                System.out.println(ARE_YOU_SURE_NEW_GAME);
                String areYouSure = scan.nextLine();
                if (KEY_Y.equalsIgnoreCase(areYouSure)) {
                    System.out.println(STARTING_NEW_GAME);
                    newGame = true;
                }
                nxChosen = true;
            } else {
                System.out.println(WRONG_KEY);
            }
        }
    }
}