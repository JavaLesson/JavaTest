package apps.java.lesson.question.facade;

import apps.java.lesson.question.entity.client.answers.UserAnswersArray;
import apps.java.lesson.question.entity.question.QuestionsArray;
import apps.java.lesson.question.entity.topic.TopicsArray;

public interface QuestionFacadeInterface {
    TopicsArray getTopics();
    QuestionsArray getQuestions(int questionId);
    UserAnswersArray checkAnswers (UserAnswersArray userAnswersCheck);
}
