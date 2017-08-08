package apps.java.lesson.literature.entity.literature;

import apps.java.lesson.literature.entity.link.LinkModel;
import apps.java.lesson.literature.entity.literature.hibernate.Literature;

import java.util.ArrayList;
import java.util.List;

public class LiteratureModel {
    private List<LinkModel> linkModels = new ArrayList<LinkModel>();
    private String literatureDescription;

    public List<LinkModel> getLinkModels() {
        return linkModels;
    }

    public void setLinkModels(List<LinkModel> linkModels) {
        this.linkModels = linkModels;
    }

    public String getLiteratureDescription() {
        return literatureDescription;
    }

    public void setLiteratureDescription(String literatureDescription) {
        this.literatureDescription = literatureDescription;
    }

    public void setLiterature(Literature literature){
        literatureDescription = literature.getDescription();
    }

}
