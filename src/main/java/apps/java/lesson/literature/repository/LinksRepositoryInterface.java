package apps.java.lesson.literature.repository;

import apps.java.lesson.literature.entity.link.hibernate.LinkDB;
import org.springframework.data.repository.CrudRepository;

public interface LinksRepositoryInterface extends CrudRepository<LinkDB,Integer> {
}
