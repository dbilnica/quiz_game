package Quiz;

import java.util.List;

public class SingleQuestionType  extends  QuestionQeneral{

    public SingleQuestionType(String questionText, List<Answer> answers) {
        super(questionText, answers);
    }

    @Override
    public String getQuestionType() {
        return "Single Option";
    }

    @Override
    public boolean isAnswerCorrect(List<Integer> answers) {
        if(answers.size() != 1){
            return false;
        }
        int getAnswerIndex = answers.get(0);
        Answer choosedAnswer = getAnswers().get(getAnswerIndex);
        return choosedAnswer.isCorrect();
    }
}
