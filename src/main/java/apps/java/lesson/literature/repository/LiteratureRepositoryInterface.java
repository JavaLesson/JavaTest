package apps.java.lesson.literature.repository;

import apps.java.lesson.literature.entity.literature.hibernate.Literature;
import org.springframework.data.repository.CrudRepository;

public interface LiteratureRepositoryInterface extends CrudRepository<Literature,Integer> {
}
