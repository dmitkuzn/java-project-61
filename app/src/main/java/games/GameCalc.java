package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import hexlet.code.Engine;

public class GameCalc {

    private static final int CALC_MAX_VALUE = 100;

    public static String getGameGreeting() {
        return "What is the result of the expression?";
    }

    public static List<GameData> getGameData() {
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            var gameData = new GameData();
            int value1 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            int value2 = Utils.getRandomInt(1, CALC_MAX_VALUE);
            String sign = getRandomSign();
            gameData.setQuestion(value1 + " " + sign + " " + value2);

            switch (sign) {
                case "+":
                    gameData.setAnswer(String.valueOf(value1 + value2));
                    break;
                case "-":
                    gameData.setAnswer(String.valueOf(value1 - value2));
                    break;
                default:
                    gameData.setAnswer(String.valueOf(value1 * value2));
                    break;
            }
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static String getRandomSign() {
        Random random = new Random();
        int value = Utils.getRandomInt(0, 2);
        switch (value) {
            case 0:
                return "+";
            case 1:
                return "-";
            default:
                return "*";
        }
    }
}
