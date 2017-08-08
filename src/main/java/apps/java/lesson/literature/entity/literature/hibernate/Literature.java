package apps.java.lesson.literature.entity.literature.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "literature", schema = "mydb")
public class Literature {
    @Id
    @GeneratedValue
    @Column(name = "literatureId")
    private int literatureId;

    @Column(name = "questionId")
    private int questionId;

    @Column(name = "linkId")
    private int linkId;

    @Column(name = "description")
    private String description;



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
