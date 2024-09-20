package hexlet.code;

import java.util.Scanner;
import java.util.List;


public class Engine {

    public static final int GAME_QUESTIONS_COUNT = 3;
    private static String userName;

    public static void startGame(String gameGreeting, List<String> gameQuestions, List<String> gameAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameGreeting);
        for (int i = 0; i < gameQuestions.size(); i++) {
            System.out.println("Question: " + gameQuestions.get(i));
            String userAnswer = sc.nextLine().toLowerCase();
            if (userAnswer.equals(gameAnswers.get(i))) {
                System.out.println("Correct!");
            } else {
                String tempBody = "' is wrong answer ;(. Correct answer was '";
                System.out.println("'" + userAnswer + tempBody + gameAnswers.get(i) + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
