package apps.java.lesson.user.facade;

import apps.java.lesson.user.entity.User;
import apps.java.lesson.user.entity.client.data.UserData;
import apps.java.lesson.user.entity.client.login.Login;
import apps.java.lesson.user.entity.client.login.Password;
import apps.java.lesson.user.entity.hibernate.UserDb;
import apps.java.lesson.user.repository.MySQL.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataFacade implements UserDataFacadeInterface {
    private UserRepository userRepository;

    @Autowired
    UserDataFacade(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void update (UserData userData){
        User user = new User();
        user.setUserData(userData);
        UserDb userDb = new UserDb();
        userDb.setUser(user);
        userDb.setPassword(userRepository.getUserData(user.getUserId()).getPassword());
        userRepository.updateUser(userDb);
    }

    @Override
    public void create(User user){
        UserDb userDb = new UserDb();
        userDb.setUser(user);
        userRepository.createUserData(userDb);
    }

    @Override
    public UserData getUser(String login){
        UserData userData = new UserData();
        for (UserDb userDb: userRepository.getAllUsers()) {
            if(userDb.getEmail() == login){
                userData = userDb.getUser().getUserData();
            }
        }
        return userData;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUserData(id);
    }

    @Override
    public boolean checkLogin(Login login){
        for (UserDb userDb: userRepository.getAllUsers()) {
            if(userDb.getEmail() == login.getLogin()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkPassword(Password password){
        for (UserDb userDb: userRepository.getAllUsers()) {
            if(userDb.getPassword() == password.getPassword().hashCode()){
                return true;
            }
        }
        return false;
    }
}
