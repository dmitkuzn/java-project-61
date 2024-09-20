package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import hexlet.code.Engine;

public class GameProgression {

    private static final int MAX_PROGRESSION_STEP = 9;
    private static final int PROGRESSION_FIRST_NUM = 100;
    private static final int PROGRESSION_MIN_SIZE = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;

    public static String getGameGreeting() {
        return "What number is missing in the progression?";
    }

    public static void getGameData(List<String> gameQuestions, List<String> gameAnswers) {
        for (int i = 0; i < Engine.GAME_QUESTIONS_COUNT; i++) {
            String strQuestion = "";
            String strAnswer = "";
            int progressionStep = Utils.getRandomInt(1, MAX_PROGRESSION_STEP);
            int progressionStart = Utils.getRandomInt(1, PROGRESSION_FIRST_NUM);
            int progressionCount = Utils.getRandomInt(PROGRESSION_MIN_SIZE, PROGRESSION_MAX_SIZE);
            List<String> progression = getProgression(progressionStart, progressionStep, progressionCount);
            //System.out.println(progression);
            int progressionNumHided = Utils.getRandomInt(0, progression.size() - 1);
            strAnswer = progression.get(progressionNumHided);
            progression.set(progressionNumHided, "..");
            strQuestion = String.join(" ", progression);
            gameQuestions.add(strQuestion);
            gameAnswers.add(strAnswer);
        }
    }

    public static List<String> getProgression(int start, int step, int count) {
        var progression = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            progression.add(String.valueOf(start + i * step));
        }
        return progression;
    }
}
