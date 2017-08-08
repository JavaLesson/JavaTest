/*
package apps.java.lesson.user.repository.mysql;

import apps.java.lesson.user.entity.hibernate.UserDb;
import apps.java.lesson.user.repository.MySQL.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MySQLUserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUserTest(){
        UserDb userDb = userRepository.getUserData(2);
        System.out.println("/////////////////");
        System.out.println(userDb.getName());
        System.out.println(userDb.getLastName());
        System.out.println("/////////////////");
    }

}
*/
