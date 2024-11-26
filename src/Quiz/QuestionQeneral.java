package Quiz;

import java.util.ArrayList;
import java.util.List;

public abstract class QuestionQeneral extends Answer{
    private String questionText;
    private List<Answer> answers;

    public QuestionQeneral(String answer, boolean isCorrect,String questionText, List<Answer> answers) {
        super(answer, isCorrect);
        this.questionText = questionText;
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
