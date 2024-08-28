package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import hexlet.code.Engine;

public class GameProgression {

    private static final int MAX_PROGRESSION_STEP = 9;
    private static final int PROGRESSION_FIRST_NUM = 100;
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_DELTA_SIZE = 6;

    public static String getGameGreeting() {
        return "What number is missing in the progression?";
    }

    public static List<GameData> getGameData() {
        Random random = new Random();
        List<GameData> gameDataList = new ArrayList<GameData>();
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            var gameData = new GameData();

            int progressionStep = random.nextInt(MAX_PROGRESSION_STEP) + 1;
            int progressionStart = random.nextInt(PROGRESSION_FIRST_NUM) + 1;
            int progressionCount = PROGRESSION_MIN_SIZE + random.nextInt(PROGRESSION_DELTA_SIZE);
            List<Integer> progression = getProgression(progressionStart, progressionStep, progressionCount);
            //System.out.println(progression);
            int progressionNumHided = random.nextInt(progression.size());
            gameData.setAnswer(String.valueOf(progression.get(progressionNumHided)));
            for (int j = 0; j < progression.size(); j++) {
                if (j != 0) {
                    gameData.setQuestion(gameData.getQuestion() + " ");
                }
                if (j != progressionNumHided) {
                    gameData.setQuestion(gameData.getQuestion() + String.valueOf(progression.get(j)));
                } else {
                    gameData.setQuestion(gameData.getQuestion() + "..");
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
