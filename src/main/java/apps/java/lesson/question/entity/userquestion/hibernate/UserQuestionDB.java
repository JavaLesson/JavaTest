package apps.java.lesson.question.entity.userquestion.hibernate;

import apps.java.lesson.question.entity.question.hibernate.QuestionDB;
import apps.java.lesson.user.entity.hibernate.UserDb;

import javax.persistence.*;

@Entity
@Table(name = "UserQuestions")
public class UserQuestionDB {
    @Id
    @GeneratedValue
    @Column(name = "userQuestionId")
    private int userQuestionId;

    @Column(name = "questionId")
    private int questionId;

    @Column(name = "userId")
    private int userId;

    @ManyToOne
    @JoinTable(name = "question", joinColumns = @JoinColumn(name = "questionId"))
    private QuestionDB questionDB;

    @Column(name = "statistics")
    private int statistic;

    @ManyToOne
    @JoinTable(name = "user", joinColumns = @JoinColumn(name = "userId"))
    private UserDb userDb;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public QuestionDB getQuestionDB() {
        return questionDB;
    }

    public void setQuestionDB(QuestionDB questionDB) {
        this.questionDB = questionDB;
    }

    public UserDb getUserDb() {
        return userDb;
    }

    public void setUserDb(UserDb userDb) {
        this.userDb = userDb;
    }

    public int getStatistic() {
        return statistic;
    }

    public void setStatistic(int statistic) {
        this.statistic = statistic;
    }

    public int getUserQuestionId() {
        return userQuestionId;
    }

    public void setUserQuestionId(int userQuestionId) {
        this.userQuestionId = userQuestionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

}
