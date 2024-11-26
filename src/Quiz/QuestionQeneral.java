package Quiz;

import java.util.ArrayList;
import java.util.List;

public abstract class QuestionQeneral {
    private String questionText;
    private List<Answer> answers;

    public QuestionQeneral(String questionText, List<Answer> answers) {
        this.questionText = questionText;
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public abstract String getQuestionType();

    public abstract boolean isAnswerCorrect(List<Integer> answers);
}
