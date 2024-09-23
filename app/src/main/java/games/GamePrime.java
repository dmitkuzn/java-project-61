package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrime {

    private static final int MAX_PRIME_NUM = 100;

    private static final String PRIME_GAME_GREETING = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        hexlet.code.Engine.startGame(PRIME_GAME_GREETING, getGameData());
    }

    public static String[][] getGameData() {
        String[][] arrGameData = new String[hexlet.code.Engine.GAME_QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int number = Utils.getRandomInt(1, MAX_PRIME_NUM);
            strQuestion = String.valueOf(number);
            strAnswer = isPrime(number) ? "yes" : "no";
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
        return arrGameData;
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
