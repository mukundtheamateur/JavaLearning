package org.service;

import org.model.User;

// its a contract which needs to be implemented by a implementation class
// Abstraction : We are hiding very complex code from someone..
public interface UserService {
    // add a user
    User addUser(User user);
    // get a user info
    User getUser(Integer id);
    // delete a user from database
    void deleteUser(Integer id);
    // update an user
    User updateUser(User user);

    // interface methods
    default User getSampleUser(){
        return new User(1, "zishan", "zishan@gmail.com");
    }


    // CRUD operation (create, read, update and delete)
}
