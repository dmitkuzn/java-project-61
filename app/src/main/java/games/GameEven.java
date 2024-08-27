package hexlet.code.games;

import hexlet.code.games.GameData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameEven {

    public static String getGameGreeting() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < 3; i++) {
            var gameData = new GameData();
            int value = random.nextInt(100) + 1;
            gameData.question = String.valueOf(value);
            if (value % 2 == 0) {
                gameData.answer = "yes";
            } else {
                gameData.answer = "no";
            }
            gameDataList.add(gameData);
        }
        return gameDataList;
    }
}
