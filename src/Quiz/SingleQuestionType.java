package Quiz;

import java.util.Arrays;
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
    public boolean isAnswerCorrect(List<Character> answers) {
        if(answers.size() != 1){
            return false;
        }
        Character selectedOption =  answers.get(0);
        for(Answer answer : getAnswers()){
            if (answer.getCharOption() == (selectedOption)){
                return answer.isCorrect();
            }
        }
        return false;
    }
}
