package com.kodilla.rps;

import java.util.Scanner;


public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        while (!end) {
            User user = new User();
            Scanner scan = new Scanner(System.in);
            System.out.println("");
            System.out.println("NEW GAME");
            System.out.println("Hello! What's your name?");
            user.setUserName(scan.nextLine());
            System.out.println("Hi, " + user.getUserName() + " :)");
            System.out.println("How many rounds do you want to play?");


            try {
                int setRoundsNumber = scan.nextInt();
                user.setRounds(setRoundsNumber);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Wrong key! \nTry again. This time choose a number.");
                System.out.println("");
            }


            int rounds = user.getRounds();
            scan.nextLine();
            System.out.println("Instructions: \nKey 1: Rock \nKey 2: Paper \nKey 3: Scissors");
            System.out.println("Key x: End game. \nKey n: New game.");

            int userCount = 0;
            int computerCount = 0;
            for (int i = 0; userCount < rounds && computerCount < rounds; i++) {

                System.out.println("Choose your move.");
                Computer computer = new Computer();
                ShapeRecognizer recognizer = new ShapeRecognizer();
                int computersMove = computer.getComputersMove();

                String usersKey = scan.nextLine();

                if (usersKey.equals("1") || usersKey.equals("2") || usersKey.equals("3")) {

                    Shape shape = recognizer.recognize(usersKey);
                    System.out.println("Your move is: " + shape.getName());
                    System.out.println("Computer's move is: " + computersMove + "- " + computer.shape());
                    WinnerSelector winnerSelector = new WinnerSelector();
                    winnerSelector.whoWins(shape, computersMove);

                    userCount += winnerSelector.getUserCount();
                    computerCount += winnerSelector.getComputerCount();
                    System.out.println("User's move: " + shape.getName() + ". Computer's move: " + computer.shape() + ".");
                    System.out.println("Result of this round is: " + "User: " + winnerSelector.getUserCount() + ". Computer: " + winnerSelector.getComputerCount());
                    System.out.println("Result of the game is: " + "User: " + userCount + ". Computer: " + computerCount);

                } else if (usersKey.equals("n") || usersKey.equals("x")) {
                    System.out.println("Are you sure that you want to stop this game? Type in Y/N");
                    String sure = scan.nextLine();
                    if(sure.equals("Y") || sure.equals("y")) {
                        rounds = -1;
                    } else if (sure.equals("N") || sure.equals("n")) {
                        System.out.println("Game continues.");
                    }
                } else {
                    System.out.println("Wrong key. Try again!");
                }
            }

            if (rounds == -1) {
                System.out.println("");
            } else if (userCount > computerCount) {
                System.out.println("Congratulations! You've won, " + user.getUserName() + "!");
            } else if (computerCount > userCount) {
                System.out.println("You lose!");
            }

                boolean nxChosen = false;
                while (!nxChosen) {
                    System.out.println("Do you want to play again (Key N) or quit (Key X) ?");
                    String nx = scan.nextLine();
                    if (nx.equals("x")) {
                        System.out.println("Are you sure you want to end the game? Type in: Y/N");
                        String areYouSure = scan.nextLine();
                        if (areYouSure.equals("Yes") || areYouSure.equals("yes") || areYouSure.equals("YES")
                                || areYouSure.equals("Y") || areYouSure.equals("y")) {
                            System.out.println("\nTHE END OF GAME.");
                            nxChosen = true;
                            end = true;
                        } else if (areYouSure.equals("No") || areYouSure.equals("no") || areYouSure.equals("NO")
                                || areYouSure.equals("N") || areYouSure.equals("n")) {
                            System.out.println("Game continues.");
                        }
                    } else if (nx.equals("n")) {
                        System.out.println("Are you sure you want to end current game and start a new one? Type in: Y/N");
                        String areYouSure = scan.nextLine();
                        if (areYouSure.equals("Yes") || areYouSure.equals("yes") || areYouSure.equals("YES")
                                || areYouSure.equals("Y") || areYouSure.equals("y")) {
                            System.out.println("Starting a new game.");
                            nxChosen = true;
                        } else if (areYouSure.equals("No") || areYouSure.equals("no") || areYouSure.equals("NO")
                                || areYouSure.equals("N") || areYouSure.equals("n")) {
                        }
                    } else {
                        System.out.println("Wrong key. Try again!");

                    }
                }
            }
        }
}