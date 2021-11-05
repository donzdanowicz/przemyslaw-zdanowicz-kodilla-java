package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        User user = new User();
        Computer computer = new Computer();
        Rules rules = new Rules();
        Scanner scan = new Scanner(System.in);
        MessagesAndConditions messagesAndConditions = new MessagesAndConditions();
        boolean end = false;

        messagesAndConditions.getName(scan, user);

        while (!end) {

            messagesAndConditions.howManyRounds(scan, user);
            messagesAndConditions.instructions();

            user.setUserCount(0);
            computer.setComputerCount(0);

            scan.nextLine();

            while (user.getUserCount() < user.getRounds() && computer.getComputerCount() < user.getRounds()) {

                System.out.println("Choose your move.");
                String usersKey = scan.nextLine();

                if (usersKey.equals("1") || usersKey.equals("2") || usersKey.equals("3")) {
                    int usersMove = Integer.parseInt(usersKey);
                    user.setUsersMove(usersMove);
                    int computersMove = computer.computersMove();
                    rules.whoWins(user, computer, usersMove, computersMove);

                    messagesAndConditions.results(usersMove, computersMove, user, computer);

                } else if (usersKey.equals("n") || usersKey.equals("x")) {
                    messagesAndConditions.areYouSure(user, scan);
                } else {
                    messagesAndConditions.wrongKey();
                }
            }

            messagesAndConditions.winner(user, computer);

            if (messagesAndConditions.nOrXChosen(scan)) {
                end = true;
            }
        }
    }
}