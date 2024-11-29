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
    public boolean isAnswerCorrect(List<Character> answers) {
        if(answers.isEmpty()){
            return false;
        }
        int correctAnswersCount = (int)getAnswers().stream().filter(Answer::isCorrect).count();
        if(answers.size() != correctAnswersCount) {
            return false;
        }
        boolean allCoorect = true;
        for(char selectedOption: answers) {
            for (Answer answer : getAnswers()) {
                if(answer.getCharOption() == (selectedOption)){
                    if(!answer.isCorrect()){
                        allCoorect = false;
                    }
                }
            }
        }
        return allCoorect;
    }
}
