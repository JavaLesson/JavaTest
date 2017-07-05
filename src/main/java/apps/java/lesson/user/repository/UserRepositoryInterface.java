package apps.java.lesson.user.repository;

import apps.java.lesson.user.entity.hibernate.UserDb;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public interface UserRepositoryInterface extends CrudRepository<UserDb,Integer> {
}
