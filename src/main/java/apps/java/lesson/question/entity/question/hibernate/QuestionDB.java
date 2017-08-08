package apps.java.lesson.question.entity.question.hibernate;


import apps.java.lesson.literature.entity.literature.hibernate.Literature;
import apps.java.lesson.question.entity.answer.hibernate.AnswerDB;
import apps.java.lesson.question.entity.question.Question;
import apps.java.lesson.question.entity.topic.hibernate.TopicDB;
import apps.java.lesson.question.entity.userquestion.hibernate.UserQuestionDB;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "mydb",name = "question")
public class QuestionDB {
    @Id
    @Column(name = "questionId")
    private int questionId;

    @Column(name = "topicId")
    private int topicId;

    @Column(name = "question")
    private String question;

    @ManyToOne
    @JoinTable(name = "topic", joinColumns = @JoinColumn(name = "topicId"))
    private TopicDB topicDB;

    @OneToMany
    private Set<Literature> literatureSet = new HashSet<Literature>();

    @OneToMany
    private Set<AnswerDB> answerDBSet = new HashSet<AnswerDB>();

    @OneToMany
    private Set<UserQuestionDB> userQuestionDBSet = new HashSet<UserQuestionDB>();

    public Set<Literature> getLiteratureSet() {
        return literatureSet;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public void setLiteratureSet(Set<Literature> literatureSet) {
        this.literatureSet = literatureSet;
    }

    public Set<AnswerDB> getAnswerDBSet() {
        return answerDBSet;
    }

    public void setAnswerDBSet(Set<AnswerDB> answerDBSet) {
        this.answerDBSet = answerDBSet;
    }

    public Set<UserQuestionDB> getUserQuestionDBSet() {
        return userQuestionDBSet;
    }

    public void setUserQuestionDBSet(Set<UserQuestionDB> userQuestionDBSet) {
        this.userQuestionDBSet = userQuestionDBSet;
    }

    public TopicDB getTopicDB() {
        return topicDB;
    }

    public void setTopicDB(TopicDB topicDB) {
        this.topicDB = topicDB;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question getQuestions(){
        Question question = new Question();
        question.setId(questionId);
        question.setQuestion(this.question);
        return question;
    }
}
