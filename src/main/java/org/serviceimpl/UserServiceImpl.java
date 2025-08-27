package org.serviceimpl;

import org.model.User;
import org.service.UserService;

// diamond problem-> java can't do multiple inheritance.. but we solve that problem by the use of interface
// java can not extend multiple classes(it can not inherit multiple classes) but it can implement
// multiple classes, so if it can implement it is solved now using interface


public class UserServiceImpl implements UserService {

    // override means that you are rewriting the specific code
    @Override
    public User addUser(User user) {
        User user1 = user;
        return user1;
    }

    @Override
    public User getUser(Integer id) {
        return getUser(id);
    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public User updateUser(User user) {
        return null;
    }

}
