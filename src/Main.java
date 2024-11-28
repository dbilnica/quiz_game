import Quiz.Answer;
import Quiz.MultipleQuestionType;
import Quiz.QuestionQeneral;
import Quiz.SingleQuestionType;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there!");
        List<QuestionQeneral> questions = new ArrayList<>();
        questions.add(new SingleQuestionType("What's the capital of Czech Republic?", List.of(
                new Answer('a', "Berlin", false),
                new Answer('b', "Prague", true),
                new Answer('c', "Madrid", false),
                new Answer('d', "Rome", false))));
        questions.add(new MultipleQuestionType("Which one of the following are continents?", List.of(
                new Answer('a', "Africa", true),
                new Answer('b', "Europe", true),
                new Answer('c', "Russia", false),
                new Answer('d', "Antarctica", true))));
        questions.add(new SingleQuestionType("The Amazon River is the longest river in the world.", List.of(
                new Answer('a', "True", true),
                new Answer('b', "False", false))));

        System.out.println("Enter you answers (comma-separated-values only) e.q. a,b,c");
        for (int questionOder = 0; questionOder < questions.size(); questionOder++) {
            QuestionQeneral question = questions.get(questionOder);
            System.out.println("Question " + (questionOder + 1) + " - " + question.getQuestionType());
            System.out.println(question.getQuestionText());
            List<Answer> answers = question.getAnswers();
            for (int answer = 0; answer < answers.size(); answer++) {
                System.out.println((answers.get(answer).getCharOption() + ") " + answers.get(answer).getAnswer()));
            }

            boolean validFormat = false;
            while (!validFormat) {
                String userInput = scanner.nextLine();
                try {
                    String[] userInputString = userInput.toLowerCase().split(",");
                    List<Character> userAnswer = new ArrayList<>();
                    for (String answer : userInputString) {
                        if (!answer.matches("[a-z]")) {
                            throw new IllegalArgumentException("Invalid chars has been detected: " + answer);
                        }
                        userAnswer.add(answer.charAt(0));
                    }
                    if(question.isAnswerCorrect(userAnswer)){
                        System.out.println("Correct answer!");
                    } else{
                        System.out.println("Wrong answer!");
                    }

                    System.out.println("Your answer is: " + userAnswer);
                    validFormat = true;
                } catch (Exception e) {
                    System.out.println("Invalid input: " + e.getMessage());
                }
            }
        }
    }
}