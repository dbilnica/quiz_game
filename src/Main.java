import Quiz.Answer;
import Quiz.QuestionQeneral;
import Quiz.SingleQuestionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<QuestionQeneral> questions = new ArrayList<>();
        questions.add(new SingleQuestionType("What's the capital of France?", List.of(new Answer("Prague", false),
                new Answer("Rome", false))));

    }
}