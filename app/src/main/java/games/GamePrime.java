package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import hexlet.code.Engine;

public class GamePrime {

    private static final int MAX_PRIME_NUM = 100;

    public static String getGameGreeting() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            var gameData = new GameData();
            int number = random.nextInt(MAX_PRIME_NUM) + 1;
            gameData.setQuestion(String.valueOf(number));
            gameData.setAnswer(isPrime(number));
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static String isPrime(int num) {
        if (num == 1) {
            return "no";
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
