package hexlet.code.games;

import hexlet.code.Engine;

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
            switch (sign) {
                case CALC_SIGN_PLUS:
                    strQuestion = value1 + " + " + value2;
                    strAnswer = String.valueOf(value1 + value2);
                    break;
                case CALC_SIGN_MINUS:
                    strQuestion = value1 + " - " + value2;
                    strAnswer = String.valueOf(value1 - value2);
                    break;
                default:
                    strQuestion = value1 + " * " + value2;
                    strAnswer = String.valueOf(value1 * value2);
            }
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
    }
}
