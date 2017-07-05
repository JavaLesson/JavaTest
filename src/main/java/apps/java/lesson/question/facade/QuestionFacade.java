package apps.java.lesson.question.facade;


import apps.java.lesson.question.entity.client.answers.AnswerId;
import apps.java.lesson.question.entity.client.answers.QuestionId;
import apps.java.lesson.question.entity.client.answers.UserAnswersArray;
import apps.java.lesson.question.entity.question.Question;
import apps.java.lesson.question.entity.question.QuestionsArray;
import apps.java.lesson.question.entity.question.hibernate.QuestionDB;
import apps.java.lesson.question.entity.topic.Topic;
import apps.java.lesson.question.entity.topic.TopicsArray;
import apps.java.lesson.question.entity.topic.hibernate.TopicDB;
import apps.java.lesson.question.repository.MySQL.MySQLAnswerRepository;
import apps.java.lesson.question.repository.MySQL.MySQLQuestionRepository;
import apps.java.lesson.question.repository.MySQL.MySQLTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionFacade {
    private MySQLAnswerRepository mySQLAnswerRepository;
    private MySQLTopicRepository mySQLTopicRepository;
    private MySQLQuestionRepository mySQLQuestionRepository;

    @Autowired
    QuestionFacade(MySQLAnswerRepository mySQLAnswerRepository, MySQLTopicRepository mySQLTopicRepository,
                      MySQLQuestionRepository mySQLQuestionRepository){
        this.mySQLAnswerRepository = mySQLAnswerRepository;
        this.mySQLTopicRepository = mySQLTopicRepository;
        this.mySQLQuestionRepository = mySQLQuestionRepository;
    }

    public TopicsArray getTopics(){
        TopicsArray topicArray = new TopicsArray();
        List<Topic> topics = new ArrayList<Topic>();
        Topic topic = new Topic();
        for (TopicDB topicDb: mySQLTopicRepository.getTopics()) {
            topic.setTopic(topicDb);
            topics.add(topic);
        }
        topicArray.setTopics(topics);
        return topicArray;
    }

    public QuestionsArray getQuestions(int questionId){
        QuestionsArray questionsArray = new QuestionsArray();
        List<Question> questionList = new ArrayList<Question>();
        for (QuestionDB questionDb: mySQLQuestionRepository.getQuestions()) {
            if (questionDb.getQuestionId() == questionId){
                questionList.add(questionDb.getQuestions());
            }
        }
        questionsArray.setQuestions(questionList);
        return questionsArray;
    }

    public UserAnswersArray checkAnswers (UserAnswersArray userAnswersCheck){
        UserAnswersArray userAnswers = new UserAnswersArray();
        List<QuestionId> questionIdList = new ArrayList<QuestionId>();
        QuestionId questionId = new QuestionId();
        for (QuestionId questionIdDb: userAnswersCheck.getUserAnswers()) {
            AnswerId answerId = new AnswerId();
            List<AnswerId> answerIdList = new ArrayList<AnswerId>();
            for (AnswerId answerIdDb: questionIdDb.getAnswerIds()) {
                if(mySQLAnswerRepository.getAnswer(answerIdDb.getAnswerId()).getCorrect() == false){
                    answerId.setAnswerId(answerIdDb.getAnswerId());
                    answerIdList.add(answerId);
                }
            }
            questionId.setAnswerIds(answerIdList);
            questionId.setQuestionId(questionIdDb.getQuestionId());
            questionIdList.add(questionId);
        }
        userAnswers.setUserAnswers(questionIdList);
        return userAnswers;
    }


}
