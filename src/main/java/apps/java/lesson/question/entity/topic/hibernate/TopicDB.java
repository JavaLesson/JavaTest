package apps.java.lesson.question.entity.topic.hibernate;

import apps.java.lesson.question.entity.question.hibernate.QuestionDB;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "topic", schema = "mydb")
public class TopicDB {
    @Id
    @Column(name = "topicId")
    private int topicId;
    @Column(name = "topic")
    private String topic;
    @OneToMany
    private Set<QuestionDB> questionDBSet = new HashSet<QuestionDB>();

    public Set<QuestionDB> getQuestionDBSet() {
        return questionDBSet;
    }

    public void setQuestionDBSet(Set<QuestionDB> questionDBSet) {
        this.questionDBSet = questionDBSet;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
