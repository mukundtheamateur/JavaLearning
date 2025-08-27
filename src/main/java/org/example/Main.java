package org.example;

import org.model.User;
import org.service.LoginService;
import org.service.UserService;
import org.serviceimpl.LoginServiceImpl;
import org.serviceimpl.UserServiceImpl;

public class Main implements UserService, LoginService {
    public static void main(String... args)  {
        UserService user = new UserServiceImpl();
        LoginService login = new LoginServiceImpl();
        System.out.println(login.login(new User(1, "c", "c.gmail")));

        Main main = new Main();
        System.out.println(main.getSampleUser());
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public User updateUser(User user) {
        return null;
    }


    // to resolve that conflict it asks u to override getSampleUser.
    // at this point our main class is confused that which getSampleUser() to call ..

    // and in this override example we are saying that we are suppsoed to call from our UserService.
    @Override
    public User getSampleUser() {
        return LoginService.super.getSampleUser();
    }

    @Override
    public User login(User user) {
        return null;
    }


}


