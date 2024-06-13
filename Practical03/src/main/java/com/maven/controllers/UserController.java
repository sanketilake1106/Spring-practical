package com.maven.controllers;

import com.maven.entities.User;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

@Component
public class UserController {
    @Autowired
    private UserService userService;

    Scanner x = new Scanner(System.in);

    public User addUser(User user) throws Exception {
        userService.createUser(user);
        return user;
    }

    public List<User> selectUser() throws Exception {
        System.out.println("Enter user name to Search");
        return userService.getAllUser(x.nextLine());
    }


    public List<User> deletUser() throws Exception {
        System.out.println("Enter User Id to delete");
        return userService.deletUser(x.nextLong());
    }

    public User updateUser(User user) throws Exception {
        System.out.println("Search by user name to update");
        user.setUserName(x.nextLine());
        System.out.println("Enter updated user id");
        user.setUserId(x.nextLong());
        x.nextLine();
        System.out.println("Enter updated user state");
        user.setUserState(x.nextLine());
        return userService.updateUser(user);
    }

    public boolean isUserExist(User user) throws Exception {
        return userService.isUserExist(user);
    }

}
