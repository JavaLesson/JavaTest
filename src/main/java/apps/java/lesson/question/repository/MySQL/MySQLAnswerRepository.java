package apps.java.lesson.question.repository.MySQL;

import apps.java.lesson.question.entity.answer.Answer;
import apps.java.lesson.question.entity.answer.hibernate.AnswerDB;
import apps.java.lesson.question.repository.AnswerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MySQLAnswerRepository {
    private AnswerRepositoryInterface answerRepository;

    @Autowired
    MySQLAnswerRepository(AnswerRepositoryInterface answerRepository){
        this.answerRepository = answerRepository;
    }

    public AnswerDB getAnswer(int id){
        return answerRepository.findOne(id);
    }

    public List<Answer> getAnswers(int questionId){
        List<Answer> answers = new ArrayList<Answer>();
        for (AnswerDB answerDb:answerRepository.findAll()) {
            answers.add(answerDb.getAnswers());
        }
        return answers;
    }
}
