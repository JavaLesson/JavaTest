package apps.java.lesson.user.controller;

import apps.java.lesson.user.entity.User;
import apps.java.lesson.user.entity.client.data.UserData;
import apps.java.lesson.user.entity.client.login.Login;
import apps.java.lesson.user.entity.client.login.Password;
import apps.java.lesson.user.facade.UserDataFacadeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController implements UserControllerInterface{

    private UserDataFacadeInterface userDataFacade;

    @Autowired
    UserController(UserDataFacadeInterface userDataFacade){
        this.userDataFacade = userDataFacade;
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public void update (@RequestBody()UserData userData){
        userDataFacade.update(userData);
    }

    @Override
    @RequestMapping( method = RequestMethod.POST)
    public void create(@RequestBody User user){
        userDataFacade.create(user);
    }

    @Override
    @RequestMapping(path = "/{login}",method = RequestMethod.GET)
    public UserData getUser(@PathVariable String login){
        return userDataFacade.getUser(login);
    }

    @Override
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id){
        userDataFacade.deleteUser(id);
    }

    @Override
    @RequestMapping(path = "/check/login",method = RequestMethod.POST)
    public boolean checkLogin(@RequestBody Login login){
        return userDataFacade.checkLogin(login);
    }

    @Override
    @RequestMapping(path = "/check/password",method = RequestMethod.POST)
    public boolean checkPassword(@RequestBody Password password){
        return userDataFacade.checkPassword(password);
    }

}
