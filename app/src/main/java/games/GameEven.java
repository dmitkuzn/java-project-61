package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {

    private static final int MAX_EVEN_NUM = 100;
    private static final String EVEN_GAME_GREETING = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        hexlet.code.Engine.startGame(EVEN_GAME_GREETING, getGameData());
    }

    public static String[][] getGameData() {
        String[][] arrGameData = new String[hexlet.code.Engine.GAME_QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int value = Utils.getRandomInt(1, MAX_EVEN_NUM);
            strQuestion = String.valueOf(value);
            if (isEven(value)) {
                strAnswer = "yes";
            } else {
                strAnswer = "no";
            }
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
        return arrGameData;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}
