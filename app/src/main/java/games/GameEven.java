package hexlet.code.games;

import hexlet.code.Engine;

public class GameEven {

    private static final int MAX_EVEN_NUM = 100;

    public static String getGameGreeting() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void getGameData(String[][] arrGameData) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int value = Utils.getRandomInt(1, MAX_EVEN_NUM);
            strQuestion = String.valueOf(value);
            strAnswer = (value % 2 == 0) ? "yes" : "no";
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
    }

}
