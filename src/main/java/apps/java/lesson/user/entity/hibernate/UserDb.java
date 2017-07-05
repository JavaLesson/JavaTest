package apps.java.lesson.user.entity.hibernate;

import apps.java.lesson.question.entity.userquestion.hibernate.UserQuestionDB;
import apps.java.lesson.user.entity.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "mydb",name = "user")
public class UserDb {
    @Id
    @GeneratedValue
    @Column(name = "userId")
    private int userId;

    @Column(name = "mail")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "last name")
    private String lastName;

    @Column(name = "password")
    private int password;

    @OneToMany
    private java.util.Set<UserQuestionDB> userQuestionDBs = new HashSet<UserQuestionDB>();

    public Set<UserQuestionDB> getUserQuestionDBs() {
        return userQuestionDBs;
    }

    public void setUserQuestionDBs(Set<UserQuestionDB> userQuestionDBs) {
        this.userQuestionDBs = userQuestionDBs;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public User getUser(){
        User user = new User();
        user.setEmail(email);
        user.setLastName(lastName);
        user.setName(name);
        user.setUserId(userId);
        return user;
    }

    public void setUser(User user){
        userId = user.getUserId();
        name = user.getName();
        lastName = user.getLastName();
        password = user.getPassword().hashCode();
        email = user.getEmail();
    }

}
