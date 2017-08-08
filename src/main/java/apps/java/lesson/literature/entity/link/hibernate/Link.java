package apps.java.lesson.literature.entity.link.hibernate;

import apps.java.lesson.literature.entity.link.LinkModel;
import apps.java.lesson.literature.entity.literature.hibernate.Literature;

import javax.persistence.*;

@Entity
@Table(schema = "mydb",name = "link")
public class Link {

    @Id
    @GeneratedValue
    @Column(name = "linkId")
    private int linkID;

    @Column(name = "link")
    private String link;

    @Column(name = "literatureId")
    private int literatureId;

    @ManyToOne
    private Literature literature;

    public void setLink(String link) {
        this.link = link;
    }

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public int getLinkID() {
        return linkID;
    }

    public void setLinkID(int linksID) {
        this.linkID = linksID;
    }

    public String getLinkData() {
        return link;
    }

    public void setLinkData(String link) {
        this.link = link;
    }

    public LinkModel getLink(){
        LinkModel links = new LinkModel();
        links.setLink(link);
        links.setLinksID(linkID);
        return links;
    }
}
