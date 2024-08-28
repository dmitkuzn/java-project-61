package hexlet.code.games;

public final class GameData {
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String newAnswer) {
        this.answer = newAnswer;
    }

    public void setQuestion(String newQuestion) {
        this.question = newQuestion;
    }

    public GameData() {
        question = "";
        answer = "";
    }
}
