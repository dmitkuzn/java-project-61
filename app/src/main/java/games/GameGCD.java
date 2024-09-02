package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import hexlet.code.Engine;

public class GameGCD {

    private static final int GCD_MAX_VALUE = 100;

    public static String getGameGreeting() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static List<GameData> getGameData() {
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            var gameData = new GameData();
            int value1 = Utils.getRandomInt(1, GCD_MAX_VALUE);
            int value2 = Utils.getRandomInt(1, GCD_MAX_VALUE);
            gameData.setQuestion(value1 + " " + value2);
            if (value1 > value2) {
                gameData.setAnswer(String.valueOf(getGCD(value1, value2)));
            } else {
                gameData.setAnswer(String.valueOf(getGCD(value2, value1)));
            }
            gameDataList.add(gameData);
        }
        return gameDataList;
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
