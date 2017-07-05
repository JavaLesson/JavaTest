package apps.java.lesson.question.entity.client.answers;

import java.util.ArrayList;
import java.util.List;

public class UserAnswersArray {
    private List<QuestionId> userAnswers = new ArrayList<QuestionId>();

    public List<QuestionId> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<QuestionId> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
