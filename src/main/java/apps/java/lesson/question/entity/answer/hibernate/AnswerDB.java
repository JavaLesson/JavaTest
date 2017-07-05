package apps.java.lesson.question.entity.answer.hibernate;

import apps.java.lesson.question.entity.answer.Answer;
import apps.java.lesson.question.entity.question.hibernate.QuestionDB;

import javax.persistence.*;

@Entity
@Table(schema = "mydb",name = "answer")
public class AnswerDB {
    @Id
    @GeneratedValue
    @Column(name = "answerId")
    private int answerId;

    @Column(name = "questionId")
    private int questionId;

    @Column(name = "answer")
    private String answer;

    @Column(name = "correct")
    private Boolean isCorrect;

    @ManyToOne
    @JoinTable(name = "question",joinColumns = @JoinColumn(name = "questionId"))
    private QuestionDB questionDB;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public QuestionDB getQuestionDB() {
        return questionDB;
    }

    public void setQuestionDB(QuestionDB questionDB) {
        this.questionDB = questionDB;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Answer getAnswers(){
        Answer answer = new Answer();
        answer.setAnswer(this.answer);
        answer.setAnswerId(answerId);
        return answer;
    }
}
