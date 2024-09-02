package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import hexlet.code.Engine;

public class GameEven {

    private static final int MAX_EVEN_NUM = 100;

    public static String getGameGreeting() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static List<GameData> getGameData() {
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            var gameData = new GameData();
            int value = Utils.getRandomInt(1, MAX_EVEN_NUM);
            gameData.setQuestion(String.valueOf(value));
            if (isEven(value)) {
                gameData.setAnswer("yes");
            } else {
                gameData.setAnswer("no");
            }
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
