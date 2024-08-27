package hexlet.code.games;

import hexlet.code.games.GameData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCalc {

    public static String getGameGreeting() {
        return "What is the result of the expression?";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < 3; i++) {
            var gameData = new GameData();
            int value1 = random.nextInt(100) + 1;
            int value2 = random.nextInt(100) + 1;
            String sign = getRandomSign();
            gameData.question = value1 + " " + sign + " " + value2;

            switch (sign) {
                case "+":
                    gameData.answer = String.valueOf(value1 + value2);
                    break;
                case "-":
                    gameData.answer = String.valueOf(value1 - value2);
                    break;
                default:
                    gameData.answer = String.valueOf(value1 * value2);
                    break;}
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static String getRandomSign() {
        Random random = new Random();
        int value = random.nextInt(2) + 1;
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
