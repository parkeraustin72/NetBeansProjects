package HiLowGuessGame;

import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        // Randomly select a number which the user attempts to guess
        Scanner scanMe = new Scanner(System.in);
        final int MAX = 100;

        int target, count, guess;
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("Guess a number between 1 and " + MAX);

            target = (int) (Math.random() * MAX) + 1;

            count = 0;
            guess = 1;

            while (guess != target && guess > 0) {
                System.out.println();
                System.out.println("Please enter your guess (0 to quit): ");
                guess = Integer.parseInt(scanMe.nextLine());
                count = count +1;
                
                if (guess > 0)
                    if (guess ==target)
                        System.out.println("You got it! Guesses: " + count);
                else
                        if (guess < target)
                            System.out.println("Your guess was too LOW.");
                        else 
                            System.out.println("Your guess was too HIGH.");
            }
            System.out.println();
            System.out.println("Would you like to play again? (y/n)? : ");
            
            again = scanMe.nextLine();
        }

    }

}
