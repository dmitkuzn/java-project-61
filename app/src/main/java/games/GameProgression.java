package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameProgression {
    public static String getGameGreeting() {
        return "What number is missing in the progression?";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < 3; i++) {
            var gameData = new GameData();

            int progressionStep = random.nextInt(9) + 1;
            int progressionStart = random.nextInt(100) + 1;
            int progressionCount = random.nextInt(6) + 5;
            List<Integer> progression = getProgression(progressionStart, progressionStep, progressionCount);
            //System.out.println(progression);
            int progressionNumHided = random.nextInt(progression.size());
            gameData.question = "";
            gameData.answer = String.valueOf(progression.get(progressionNumHided));
            for (int j = 0; j < progression.size(); j++) {
                if (j != 0) {
                    gameData.question = gameData.question + " ";
                }
                if (j != progressionNumHided) {
                    gameData.question = gameData.question + String.valueOf(progression.get(j));
                } else {
                    gameData.question = gameData.question + "..";
                }
            }
            gameDataList.add(gameData);
        }
        return gameDataList;
    }

    public static List<Integer> getProgression(int start, int step, int count) {
        var progression = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            progression.add(start + i * step);
        }
        return progression;
    }
}
