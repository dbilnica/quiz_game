package Quiz;

import java.util.List;

public class MultipleQuestionType extends QuestionQeneral{

    public MultipleQuestionType(String questionText, List<Answer> answers) {
        super(questionText, answers);
    }

    @Override
    public String getQuestionType() {
        return "Multiple Option";
    }

    @Override
    public boolean isAnswerCorrect(List<Integer> answers) {
        if(answers.isEmpty()){
            return false;
        }
        for(int answer: answers){
            Answer choosedAnswer = getAnswers().get(answer);
            return choosedAnswer.isCorrect();
        }
        return  false;
    }
}
