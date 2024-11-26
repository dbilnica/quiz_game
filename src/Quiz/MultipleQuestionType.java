package Quiz;

import java.util.List;

public class MultipleQuestionType extends QuestionQeneral{

    public MultipleQuestionType(String answer, boolean isCorrect, String questionText, List<Answer> answers) {
        super(answer, isCorrect, questionText, answers);
    }
}
