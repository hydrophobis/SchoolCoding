package U2Proj;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int guesses = 0;
        int guess = -1;
        int randomNum = rand.nextInt(100);
        int high = 100;
        int low = 0;
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Duration in milliseconds
        System.out.println("Game init in " + duration + " ms");

        while(guess != randomNum) {
            System.out.println("Guess a number from " + low + " and " + high + ".");
            guess = scanner.nextInt();

            // Data Validation
            if(guess > high) {
                System.out.println("Number entered exceeds to maximum");
                guess = high + 1;
            } else if(guess < low) {
                System.out.println("Number entered smaller than minimum");
                guess = low- 1;
            } else { //  Actual guessing stuff
                if(guess != randomNum) {
                    System.out.println("Incorrect.");
                    if(guess > randomNum) {
                        high = guess - 1;
                        System.out.println("The number is lower than " + guess + ".");
                    } else {
                        low = guess + 1;
                        System.out.println("Your number is higher than " + guess + ".");
                    }
                }
                guesses++;
            }

        }
        System.out.println("You guessed the number correctly with " + guess + " in " + guesses + " guesses.\nPlay again? 'y' or 'n'.");
        if(new Scanner(System.in).nextLine().charAt(0) == 'y') {
            main(args);
        } else {
            return;
        }
    }
}
