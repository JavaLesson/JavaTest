package apps.java.lesson.literature.entity.literature;

import apps.java.lesson.literature.entity.link.Link;
import apps.java.lesson.literature.entity.literature.hibernate.LiteratureDB;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public class Literature {
    private List<Link> links = new ArrayList<Link>();
    private String literatureDescription;

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getLiteratureDescription() {
        return literatureDescription;
    }

    public void setLiteratureDescription(String literatureDescription) {
        this.literatureDescription = literatureDescription;
    }

    public void setLiterature(LiteratureDB literatureDB){
        literatureDescription = literatureDB.getDescription();
    }

}
