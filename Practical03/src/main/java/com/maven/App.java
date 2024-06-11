package com.maven;

import com.maven.configruation.SpringConfig;
import com.maven.controllers.UserController;
import com.maven.entities.User;
import com.maven.repositeries.UserRepositories;
import com.maven.services.UserService;
import com.maven.services.imp.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);

        //Adding User
        //User user = userController.addUser();
        
        // Getting User
        //List<User> userList = userController.selectUser();
        //userList.forEach(System.out::println);

        //Getting selected User Only
        User user = userController.selectUser();
        System.out.println(user);

        //Deleting the user
        //List<User> userList = userController.deletUser();
        //userList.forEach(System.out::println);
        
        //Updating the user
        //User user = userController.updateUser();
        //System.out.println(user);
    }
}
