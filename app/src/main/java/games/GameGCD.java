package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameGCD {

    public static String getGameGreeting() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < 3; i++) {
            var gameData = new GameData();
            int value1 = random.nextInt(100) + 1;
            int value2 = random.nextInt(100) + 1;
            gameData.question = value1 + " " + value2;
            if (value1 > value2) {
                gameData.answer = String.valueOf(getGCD(value1, value2));
            } else {
                gameData.answer = String.valueOf(getGCD(value2, value1));
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
