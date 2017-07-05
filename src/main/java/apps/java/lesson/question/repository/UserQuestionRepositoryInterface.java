package apps.java.lesson.question.repository;

import apps.java.lesson.question.entity.userquestion.hibernate.UserQuestionDB;
import org.springframework.data.repository.CrudRepository;


public interface UserQuestionRepositoryInterface extends CrudRepository<UserQuestionDB,String> {
}
