package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_QUESTIONS_COUNT = 3;
    private static String userName;

    public static void startGame(String gameGreeting, String[][] arrGameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameGreeting);
        for (int i = 0; i < arrGameData.length; i++) {
            System.out.println("Question: " + arrGameData[i][0]);
            String userAnswer = sc.nextLine().toLowerCase();
            if (userAnswer.equals(arrGameData[i][1])) {
                System.out.println("Correct!");
            } else {
                String tempBody = "' is wrong answer ;(. Correct answer was '";
                System.out.println("'" + userAnswer + tempBody + arrGameData[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
