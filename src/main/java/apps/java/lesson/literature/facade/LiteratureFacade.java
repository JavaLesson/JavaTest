package apps.java.lesson.literature.facade;

import apps.java.lesson.literature.entity.client.LiteratureArray;
import apps.java.lesson.literature.entity.link.Link;
import apps.java.lesson.literature.entity.link.hibernate.LinkDB;
import apps.java.lesson.literature.entity.literature.Literature;
import apps.java.lesson.literature.entity.literature.hibernate.LiteratureDB;
import apps.java.lesson.literature.repository.MySQL.LinksRepository;
import apps.java.lesson.literature.repository.MySQL.LiteratureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiteratureFacade {
    private LinksRepository linksRepository;
    private LiteratureRepository literatureRepository;

    @Autowired
    LiteratureFacade(LinksRepository linksRepository, LiteratureRepository literatureRepository){
        this.linksRepository = linksRepository;
        this.literatureRepository = literatureRepository;
    }

    public LiteratureArray getLiterature(int questionId){
        LiteratureArray literatureArray = new LiteratureArray();
        Literature literature = new Literature();
        List<Literature> literatureList = new ArrayList<Literature>();
        List<Link> linkList = new ArrayList<Link>();
        for (LiteratureDB literatureDb: literatureRepository.getAllLiterature()) {
            if (literatureDb.getQuestionId() == questionId){
                for (LinkDB linkDb: linksRepository.getAllLinks()) {
                    if (linkDb.getLinkID() == literatureDb.getLinkId()){
                        linkList.add(linkDb.getLink());
                    }
                }
                literature.setLiterature(literatureDb);
                literature.setLinks(linkList);
                literatureList.add(literature);

                linkList = null;
            }
        }
        literatureArray.setLiteratureList(literatureList);
        return literatureArray;
    }
}
