package apps.java.lesson.question.entity.client.answers;

import java.util.ArrayList;
import java.util.List;

public class QuestionId {
    private int questionId;
    private List<AnswerId> answerIds = new ArrayList<AnswerId>();

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<AnswerId> getAnswerIds() {
        return answerIds;
    }

    public void setAnswerIds(List<AnswerId> answerIds) {
        this.answerIds = answerIds;
    }
}
