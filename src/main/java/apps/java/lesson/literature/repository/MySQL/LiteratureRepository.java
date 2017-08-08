package apps.java.lesson.literature.repository.MySQL;

import apps.java.lesson.literature.entity.literature.hibernate.Literature;
import apps.java.lesson.literature.repository.LiteratureRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LiteratureRepository {
    private LiteratureRepositoryInterface literatureRepository;
    @Autowired
    LiteratureRepository(LiteratureRepositoryInterface literatureRepository){
        this.literatureRepository = literatureRepository;
    }

    public List<Literature> getAllLiterature(){
        List<Literature> literatureList = new ArrayList<Literature>();
        for (Literature literature: literatureRepository.findAll()) {
            literatureList.add(literature);
        }
        return literatureList;
    }

}
