package RockPaperScissor;

import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        final int OPTIONS = 3;
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int COMPUTER = 1, PLAYER = 2, TIE = 3;

        int computerChoice, playerChoice, winner = 0;
        int wins = 0, losses = 0, ties = 0;
        String again;

        again = "y";
        while (again.equalsIgnoreCase("y")) {
            computerChoice = (int) (Math.random() * OPTIONS) + 1;

            System.out.println();
            System.out.println("Please enter your choice"
                    + "1 for Rock\n\t 2 for Paper \n\t 3 for Scissors:");
            playerChoice = scanMe.nextInt();
            scanMe.nextLine();

            System.out.println("My choice was ");
            // Determine the winner
            if (computerChoice == ROCK) {
                System.out.println("Rock.");
                if (playerChoice == SCISSORS) {
                    winner = COMPUTER;
                } else if (playerChoice == PAPER) {
                    winner = PLAYER;
                } else {
                    winner = TIE;
                }
            } else if (computerChoice == PAPER) {
                System.out.println("Paper.");
                if (playerChoice == ROCK) {
                    winner = COMPUTER;
                } else if (playerChoice == SCISSORS) {
                    winner = PLAYER;
                } else {
                    winner = TIE;
                }

            } else // computerChoice must be scissors
            {
                System.out.println(" Scissors.");
                if (playerChoice == PAPER) {
                    winner = COMPUTER;
                } else if (playerChoice == ROCK) {
                    winner = PLAYER;
                } else {
                    winner = TIE;
                }
            }

            // Print results and increment appropriate counter
            if (winner == COMPUTER) {
                System.out.println(" Computer Wins!!");

            } else if (winner == PLAYER) {
                System.out.println("Player Wins!!");
            } else {
                System.out.println("We are Tied!");
                ties++;
            }
            System.out.println();
            System.out.println("Would you like to play again? (y/n)?");
            again = scanMe.nextLine();

        }
        
        // Print final results
        System.out.println("You won: " + wins + " times.");
        System.out.println("You lost: " + losses + " times.");
        System.out.println("We tied: " + ties + " times.");
        
        // 8.3, 8.4 

    }

}
