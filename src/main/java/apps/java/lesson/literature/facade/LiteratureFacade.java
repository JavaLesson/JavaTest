package apps.java.lesson.literature.facade;

import apps.java.lesson.literature.entity.client.LiteratureArray;
import apps.java.lesson.literature.entity.link.LinkModel;
import apps.java.lesson.literature.entity.link.hibernate.Link;
import apps.java.lesson.literature.entity.literature.LiteratureModel;
import apps.java.lesson.literature.entity.literature.hibernate.Literature;
import apps.java.lesson.literature.repository.MySQL.LinksRepository;
import apps.java.lesson.literature.repository.MySQL.LiteratureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiteratureFacade implements LiteratureFacadeInterface{
    private LinksRepository linksRepository;
    private LiteratureRepository literatureRepository;

    @Autowired
    LiteratureFacade(LinksRepository linksRepository, LiteratureRepository literatureRepository){
        this.linksRepository = linksRepository;
        this.literatureRepository = literatureRepository;
    }

    @Override
    public LiteratureArray getLiterature(int questionId){
        LiteratureArray literatureArray = new LiteratureArray();
        LiteratureModel literatureModel = new LiteratureModel();
        List<LiteratureModel> literatureModelList = new ArrayList<LiteratureModel>();
        List<LinkModel> linkModelList = new ArrayList<LinkModel>();
        for (Literature literature : literatureRepository.getAllLiterature()) {
            if (literature.getQuestionId() == questionId){
                for (Link link : linksRepository.getAllLinks()) {
                    if (link.getLinkID() == literature.getLinkId()){
                        linkModelList.add(link.getLink());
                    }
                }
                literatureModel.setLiterature(literature);
                literatureModel.setLinkModels(linkModelList);
                literatureModelList.add(literatureModel);

                linkModelList = null;
            }
        }
        literatureArray.setLiteratureModelList(literatureModelList);
        return literatureArray;
    }
}
