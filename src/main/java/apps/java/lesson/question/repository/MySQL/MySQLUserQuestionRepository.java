package apps.java.lesson.question.repository.MySQL;

import apps.java.lesson.question.entity.userquestion.hibernate.UserQuestionDB;
import apps.java.lesson.question.repository.UserQuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MySQLUserQuestionRepository {
    private UserQuestionRepositoryInterface userQuestionRepositoryInterface;

    @Autowired
    MySQLUserQuestionRepository(UserQuestionRepositoryInterface userQuestionRepositoryInterface){
        this.userQuestionRepositoryInterface = userQuestionRepositoryInterface;
    }

    public List<UserQuestionDB> getUsersQuestions(){
        List<UserQuestionDB> userQuestions = new ArrayList<UserQuestionDB>();
        for (UserQuestionDB userQuestionDb: userQuestionRepositoryInterface.findAll()) {
            userQuestions.add(userQuestionDb);
        }
        return userQuestions;
    }
}
