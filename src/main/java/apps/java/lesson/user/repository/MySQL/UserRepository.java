package apps.java.lesson.user.repository.MySQL;

import apps.java.lesson.user.entity.hibernate.UserDb;
import apps.java.lesson.user.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private UserRepositoryInterface userDataRepository;

    @Autowired
    UserRepository(UserRepositoryInterface userDataRepository){
        this.userDataRepository = userDataRepository;
    }

    public void updateUser(UserDb userDb){
        userDataRepository.save(userDb);
    }

    public void createUserData(UserDb userDb){
        userDataRepository.save(userDb);
    }

    public UserDb getUserData(int id){
        return userDataRepository.findOne(id);
    }

    public List<UserDb> getAllUsers(){
        List<UserDb> userDbList = new ArrayList<UserDb>();
        for (UserDb userDataDb: userDataRepository.findAll()) {
            userDbList.add(userDataDb);
        }
        return userDbList;
    }

    public void deleteUserData(int id){
        userDataRepository.delete(id);
    }
}


