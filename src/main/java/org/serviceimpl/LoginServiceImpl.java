package org.serviceimpl;

import org.model.User;
import org.service.LoginService;


public class LoginServiceImpl implements LoginService {

    public User login(User user) {
        return new User(3, "x", "x@gmail.com");
    }
}
