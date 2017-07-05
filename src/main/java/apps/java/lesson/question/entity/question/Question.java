package apps.java.lesson.question.entity.question;

import apps.java.lesson.question.entity.answer.Answer;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private int id;
    private List<Answer> answers = new ArrayList<Answer>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
