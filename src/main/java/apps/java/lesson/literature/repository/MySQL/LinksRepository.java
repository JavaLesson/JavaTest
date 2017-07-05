package apps.java.lesson.literature.repository.MySQL;

import apps.java.lesson.literature.entity.link.hibernate.LinkDB;
import apps.java.lesson.literature.repository.LinksRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LinksRepository {

    private LinksRepositoryInterface linksRepository;
    @Autowired
    LinksRepository(LinksRepositoryInterface linksRepository){
        this.linksRepository = linksRepository;
    }

    public List<LinkDB> getAllLinks(){
        List<LinkDB> links = new ArrayList<LinkDB>();
        for (LinkDB linkDb: linksRepository.findAll()) {
            links.add(linkDb);
        }
        return links;
    }

}
