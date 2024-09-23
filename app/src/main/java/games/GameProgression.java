package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameProgression {

    private static final int MAX_PROGRESSION_STEP = 9;
    private static final int PROGRESSION_FIRST_NUM = 100;
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;

    public static String getGameGreeting() {
        return "What number is missing in the progression?";
    }

    public static void getGameData(String[][] arrGameData) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int progressionStep = Utils.getRandomInt(1, MAX_PROGRESSION_STEP);
            int progressionStart = Utils.getRandomInt(1, PROGRESSION_FIRST_NUM);
            int progressionCount = Utils.getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            var progression = getProgression(progressionStart, progressionStep, progressionCount);
            int progressionNumHided = Utils.getRandomInt(0, progressionCount - 1);
            strAnswer = progression[progressionNumHided];
            progression[progressionNumHided] = "..";
            strQuestion = String.join(" ", progression);
            arrGameData[i][0] = strQuestion;
            arrGameData[i][1] = strAnswer;
        }
    }

    public static String[] getProgression(int start, int step, int count) {
        String[] progression = new String[count];
        for (int i = 0; i < count; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
