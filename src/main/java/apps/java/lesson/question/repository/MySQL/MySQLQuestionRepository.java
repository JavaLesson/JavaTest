package apps.java.lesson.question.repository.MySQL;


import apps.java.lesson.question.entity.question.hibernate.QuestionDB;
import apps.java.lesson.question.repository.QuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MySQLQuestionRepository {
    private QuestionRepositoryInterface questionRepository;

    @Autowired
    MySQLQuestionRepository(QuestionRepositoryInterface questionRepository){
        this.questionRepository = questionRepository;
    }

    public List<QuestionDB> getQuestions(){
        List<QuestionDB> questions = new ArrayList<QuestionDB>();
        for (QuestionDB questionDb: questionRepository.findAll()) {
            questions.add(questionDb);
        }
        return questions;
    }

}
