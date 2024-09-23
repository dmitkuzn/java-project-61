package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrime {

    private static final int MAX_PRIME_NUM = 100;

    public static String getGameGreeting() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void getGameData(String[][] arrGameData) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int number = Utils.getRandomInt(1, MAX_PRIME_NUM);
            strQuestion = String.valueOf(number);
            strAnswer = isPrime(number) ? "yes" : "no";
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
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
