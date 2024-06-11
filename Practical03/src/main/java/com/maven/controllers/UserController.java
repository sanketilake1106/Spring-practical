package com.maven.controllers;

import com.maven.entities.User;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class UserController {
    @Autowired
    private UserService userService;

    public User addUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        user.setUserId(4L);
        user.setUserName("Omkar");
        user.setUserContact("9850415263");
        user.setUserCity("Kolhapur");
        user.setUserState("Maharashtra");
        userService.createUser(user);
        return user;
    }

    public User selectUser() throws Exception {
        User user = new User();
        user.setUserName("Sanket Ilake");
        return userService.getAllUser(user);
    }

    public List<User> deletUser() throws Exception {
        return userService.deletUser(3L);
    }

    public User updateUser() throws Exception {
        User user = new User();
        user.setUserId(23L);
        user.setUserName("Tushar Yadhav");
        user.setUserState("Karnatak");
        return userService.updateUser(user);
    }
}
