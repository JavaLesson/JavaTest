package apps.java.lesson.user.controller;

import apps.java.lesson.user.entity.User;
import apps.java.lesson.user.entity.client.data.UserData;
import apps.java.lesson.user.entity.client.login.Login;
import apps.java.lesson.user.entity.client.login.Password;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public interface UserControllerInterface {
    void update (UserData userData);
    void create(User user);
    UserData getUser(String login);
    void deleteUser(int id);
    boolean checkLogin(Login login);
    boolean checkPassword(Password password);
}
