package org.service;

import org.model.User;

@Deprecated
public interface LoginService {

    static final String username = "ADMIN";
//    User login(User user);

    default  User getSampleUser(){
        return new User(2, "mukund", "mukund@gmail.com");
    }

    User login(User user);
}
