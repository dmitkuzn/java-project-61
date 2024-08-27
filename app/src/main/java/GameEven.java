package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven implements Game {

    private String userName;

    public void  startGame() {
        printGreeting();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int value = random.nextInt(100) + 1;
            System.out.println("Question: " + value);
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine().toLowerCase();
            switch (userAnswer) {
                case "yes":
                    if (value % 2 == 0) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                        return;
                    }
                    break;
                case "no":
                    if (value % 2 != 0) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Answer 'no' if the number is even, otherwise answer 'yes'.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Incorrect input! Must be 'yes' or 'no'.");
                    return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public void printGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

}
