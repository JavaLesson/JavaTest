package apps.java.lesson.question.controller;

import apps.java.lesson.question.entity.client.answers.UserAnswersArray;
import apps.java.lesson.question.entity.question.QuestionsArray;
import apps.java.lesson.question.entity.topic.TopicsArray;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public interface QuestionControllerInterface {
    TopicsArray getQuestion ();

    QuestionsArray getQuestion (int topicId);

    UserAnswersArray check(UserAnswersArray answers);
}
