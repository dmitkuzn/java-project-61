package hexlet.code.games;

import hexlet.code.Engine;

public class GameGCD {

    private static final int GCD_MAX_VALUE = 100;

    public static String getGameGreeting() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void getGameData(String[][] arrGameData) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int value1 = Utils.getRandomInt(1, GCD_MAX_VALUE);
            int value2 = Utils.getRandomInt(1, GCD_MAX_VALUE);
            strQuestion = value1 + " " + value2;
            if (value1 > value2) {
                strAnswer = String.valueOf(getGCD(value1, value2));
            } else {
                strAnswer = String.valueOf(getGCD(value2, value1));
            }
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
    }

    public static int getGCD(int maxValue, int minValue) {
        if (maxValue == minValue) {
            return minValue;
        }
        if (maxValue == 1 || minValue == 1) {
            return 1;
        }
        int ostatok = maxValue % minValue;
        if (ostatok == 0) {
            return minValue;
        }
        return getGCD(minValue, ostatok);
    }
}
