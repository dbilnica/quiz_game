package Quiz;

import java.util.List;

public class SingleQuestionType  extends  QuestionQeneral{
    public SingleQuestionType(String answer, boolean isCorrect, String questionText, List<Answer> answers) {
        super(answer, isCorrect, questionText, answers);
    }
}
