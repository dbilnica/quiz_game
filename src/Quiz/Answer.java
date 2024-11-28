package Quiz;

public class Answer {
    private final char charOption;
    private final String answer;
    private final boolean isCorrect;

    public Answer(char charOption, String answer, boolean isCorrect){
        this.charOption = charOption;
        this.answer = answer;
        this.isCorrect=isCorrect;
    }
    public char getCharOption() {return charOption;}

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
