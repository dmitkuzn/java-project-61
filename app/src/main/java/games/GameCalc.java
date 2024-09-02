package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import hexlet.code.Engine;

public class GameCalc {

    private static final int CALC_MAX_VALUE = 100;
    private static final int CALC_SIGN_PLUS = 0;
    private static final int CALC_SIGN_MINUS = 1;
    private static final int CALC_SIGN_MULT = 2;

    public static String getGameGreeting() {
        return "What is the result of the expression?";
    }

    public static List<GameData> getGameData() {
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            int value1 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            int value2 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            int sign = Utils.getRandomInt(0, CALC_SIGN_MULT);
            var gameData = prepareGameData(value1, value2, sign);
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static GameData prepareGameData(int value1, int value2, int sign) {
        GameData gameData = new hexlet.code.games.GameData();
        switch (sign) {
            case CALC_SIGN_PLUS:
                gameData.setQuestion(value1 + " + " + value2);
                gameData.setAnswer(String.valueOf(value1 + value2));
            case CALC_SIGN_MINUS:
                gameData.setQuestion(value1 + " - " + value2);
                gameData.setAnswer(String.valueOf(value1 - value2));
            default:
                //CALC_SIGN_MULT
                gameData.setQuestion(value1 + " * " + value2);
                gameData.setAnswer(String.valueOf(value1 * value2));
        }
        return gameData;
    }
}
