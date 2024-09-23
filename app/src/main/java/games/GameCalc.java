package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameCalc {

    private static final int CALC_MAX_VALUE = 100;
    private static final int CALC_SIGN_PLUS = 0;
    private static final int CALC_SIGN_MINUS = 1;
    private static final int CALC_SIGN_MULT = 2;

    public static String getGameGreeting() {
        return "What is the result of the expression?";
    }

    public static void getGameData(String[][] arrGameData) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int value1 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            int value2 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            int sign = Utils.getRandomInt(0, CALC_SIGN_MULT);
            arrGameData[i][0] = getCalcQuestion(value1, value2, sign);
            arrGameData[i][1] = String.valueOf(getCalcResult(value1, value2, sign));
        }
    }

    public static int getCalcResult(int value1, int value2, int sign) {
        switch (sign) {
            case CALC_SIGN_PLUS:
                return value1 + value2;
            case CALC_SIGN_MINUS:
                return value1 - value2;
            default:
                return value1 * value2;
        }
    }

    public static String getCalcQuestion(int value1, int value2, int sign) {
        switch (sign) {
            case CALC_SIGN_PLUS:
                return value1 + " + " + value2;
            case CALC_SIGN_MINUS:
                return value1 + " - " + value2;
            default:
                return value1 + " * " + value2;
        }
    }
}
