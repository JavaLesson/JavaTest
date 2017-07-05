package apps.java.lesson.literature.entity.link.hibernate;

import apps.java.lesson.literature.entity.link.Link;
import apps.java.lesson.literature.entity.literature.hibernate.LiteratureDB;

import javax.persistence.*;

@Entity
@Table(schema = "mydb",name = "link")
public class LinkDB {

    @Id
    @GeneratedValue
    @Column(name = "linkId")
    private int linkID;

    @Column(name = "link")
    private String link;

    @Column(name = "literatureId")
    private int literatureId;

    @ManyToOne
    private LiteratureDB literatureDB;

    public void setLink(String link) {
        this.link = link;
    }

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public LiteratureDB getLiteratureDB() {
        return literatureDB;
    }

    public void setLiteratureDB(LiteratureDB literatureDB) {
        this.literatureDB = literatureDB;
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

    public Link getLink(){
        Link links = new Link();
        links.setLink(link);
        links.setLinksID(linkID);
        return links;
    }
}
