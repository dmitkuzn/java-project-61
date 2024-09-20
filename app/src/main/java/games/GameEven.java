package hexlet.code.games;

import java.util.List;
import hexlet.code.Engine;

public class GameEven {

    private static final int MAX_EVEN_NUM = 100;

    public static String getGameGreeting() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void getGameData(List<String> gameQuestions, List<String> gameAnswers) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int value = Utils.getRandomInt(1, MAX_EVEN_NUM);
            strQuestion = String.valueOf(value);
            strAnswer = isEven(value) ? "yes" : "no";
            gameQuestions.add(strQuestion);
            gameAnswers.add(strAnswer);
        }
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
