package apps.java.lesson.question.repository;

import apps.java.lesson.question.entity.topic.hibernate.TopicDB;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepositoryInterface extends CrudRepository<TopicDB,String> {
}
