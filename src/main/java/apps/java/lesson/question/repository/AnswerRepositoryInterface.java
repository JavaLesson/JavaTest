package apps.java.lesson.question.repository;

import apps.java.lesson.question.entity.answer.hibernate.AnswerDB;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepositoryInterface extends CrudRepository<AnswerDB,Integer> {
}
