package com.kodilla.rps;

import java.util.Scanner;

public class MessagesAndConditions {

    public void howManyRounds(Scanner scan, User user) {
        System.out.println("How many rounds do you want to play?");

        try {
            int setRoundsNumber = scan.nextInt();
            user.setRounds(setRoundsNumber);
        } catch (Exception e) {
            System.out.println("Wrong key! \nTry again. This time choose a number.\n");
        }
    }

    public void results(int usersMove, int computersMove, User user, Computer computer) {
        System.out.println("Your move: " + Shape.shape(usersMove));
        System.out.println("Computer : " + Shape.shape(computersMove));
        System.out.println("Result of this round is: \n" + user.getUserName() + ": " + user.getUserRoundResult()
                + ". Computer: " + computer.getComputerRoundResult());
        System.out.println("Result of the game is: \n" + user.getUserName() + ": " + user.getUserCount()
                + ". Computer: " + computer.getComputerCount());
    }

    public void areYouSure(User user, Scanner scan) {
        System.out.println("Are you sure that you want to stop this game? Type in Y/N");
        String sure = scan.nextLine();
        if(sure.equals("Y") || sure.equals("y")) {
            user.setRounds(-1);
        } else if (sure.equals("N") || sure.equals("n")) {
            System.out.println("Game continues.");
        }
    }

    public void winner(User user, Computer computer) {
        if (user.getRounds() == -1) {
            System.out.println("");
        } else if (user.getUserCount() > computer.getComputerCount()) {
            System.out.println("Congratulations! You've won, " + user.getUserName() + "!");
        } else {
            System.out.println("You lose!");
        }
    }

    public void getName(Scanner scan, User user) {
        System.out.println("\nNEW GAME");
        System.out.println("Hello! What's your name?");
        user.setUserName(scan.nextLine());
        System.out.println("Hi, " + user.getUserName() + " :)");
    }

    public void instructions() {
        System.out.println("Instructions: \nKey 1: Rock \nKey 2: Paper \nKey 3: Scissors");
        System.out.println("Key x: End game. \nKey n: New game.");
    }

    public void wrongKey() {
        System.out.println("Wrong key. Try again!");
    }

    public boolean nOrXChosen(Scanner scan) {
        boolean nxChosen = false;
        while (!nxChosen) {
            System.out.println("Do you want to play again (Key N) or quit (Key X) ?");
            String nx = scan.nextLine();
            if (nx.equals("x")) {
                System.out.println("Are you sure you want to end the game? Type in: Y/N");
                String areYouSure = scan.nextLine();
                if (areYouSure.equals("Y") || areYouSure.equals("y")) {
                    System.out.println("\nTHE END OF GAME.");
                    return true;
                }
            } else if (nx.equals("n")) {
                System.out.println("Are you sure you want to end current game and start a new one? Type in: Y/N");
                String areYouSure = scan.nextLine();
                if (areYouSure.equals("Y") || areYouSure.equals("y")) {
                    System.out.println("Starting a new game.");
                    nxChosen = true;
                }
            } else {
                wrongKey();
            }
        }
        return false;
    }
}
