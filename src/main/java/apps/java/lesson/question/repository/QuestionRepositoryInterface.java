package apps.java.lesson.question.repository;

import apps.java.lesson.question.entity.question.hibernate.QuestionDB;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepositoryInterface extends CrudRepository<QuestionDB,Integer> {
}
