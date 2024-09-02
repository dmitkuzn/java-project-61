package hexlet.code;

import hexlet.code.games.GameData;

import java.util.Scanner;
import java.util.List;


public class Engine {

    public static final int GAME_QUESTIONS_COUNT = 3;
    private static String userName;

    public static void startGame(String gameGreeting, List<GameData> gameDataList) {
        printGreeting(gameGreeting);
        for (var gameData : gameDataList) {
            System.out.println("Question: " + gameData.getQuestion());
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine().toLowerCase();
            if (userAnswer.equals(gameData.getAnswer())) {
                System.out.println("Correct!");
            } else {
                String tempBody = "' is wrong answer ;(. Correct answer was '";
                System.out.println("'" + userAnswer + tempBody + gameData.getAnswer() + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void printGreeting(String greeting) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(greeting);
    }
}
