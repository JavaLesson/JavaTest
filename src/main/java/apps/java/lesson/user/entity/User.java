package apps.java.lesson.user.entity;

import apps.java.lesson.user.entity.client.data.UserData;

public class User {
    private int userId;
    private String email;
    private String name;
    private String lastName;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserData(UserData userData){
        userId = userData.getUserId();
        email = userData.getEmail();
        name = userData.getName();
        lastName = userData.getLastName();
    }

    public UserData getUserData(){
        UserData userData = new UserData();
        userData.setUserId(userId);
        userData.setName(name);
        userData.setLastName(lastName);
        userData.setEmail(email);
        return userData;
    }
}
