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

    public void setAnswer(String new_answer) {
        this.answer = answer;
    }

    public void setQuestion(String new_question) {
        this.question = question;
    }

    public GameData() {
        question = "";
        answer = "";
    }
}
