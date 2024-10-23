package U2Proj;

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepGoing = true;

        while (keepGoing) {
            int num1 = random.nextInt(50) + 1;
            int num2 = random.nextInt(50) + 1;

            System.out.println("Choose a operation: +, -, *, /");
            String choice = scanner.next();

            System.out.println("Solve: " + num1 + " " + choice + " " + num2);
            String userAnswer = scanner.nextLine();
            int correctAnswer = 0;

            switch (choice) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    correctAnswer = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            if(userAnswer == null){
                System.out.println("Null answer");
                return;
            }

            if (Integer.parseInt(userAnswer) == correctAnswer) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong answer. The correct answer is " + correctAnswer);
            }
            scanner.nextLine();
            System.out.println("Want to try again? (y/n)");
            keepGoing = scanner.nextLine().equals("y");
        }
    }
}
