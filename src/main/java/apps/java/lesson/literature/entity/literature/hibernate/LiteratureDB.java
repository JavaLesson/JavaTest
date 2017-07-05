package apps.java.lesson.literature.entity.literature.hibernate;

import apps.java.lesson.literature.entity.link.hibernate.LinkDB;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "literature")
public class LiteratureDB {
    @Id
    @GeneratedValue
    @Column(name = "literatureId")
    private int literatureId;

    @Column(name = "questionId")
    private int questionId;

    @Column(name = "linkId")
    private int linkId;

    @OneToMany
    @JoinColumn(name = "linkId")
    private Set<LinkDB> linkSet = new HashSet<LinkDB>();

    @Column(name = "description")
    private String description;

    public Set<LinkDB> getLinkSet() {
        return linkSet;
    }

    public void setLinkSet(Set<LinkDB> linkSet) {
        this.linkSet = linkSet;
    }

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
