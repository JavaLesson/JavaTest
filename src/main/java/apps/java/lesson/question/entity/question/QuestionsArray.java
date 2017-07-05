package apps.java.lesson.question.entity.question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public class QuestionsArray {
    private List<Question> questions = new ArrayList<Question>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
