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
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws Exception {
        Scanner x = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);

        int ch;
        System.out.println("1.Add User");
        System.out.println("2.Select User");
        System.out.println("3.Delete User");
        System.out.println("4.Update User");
        System.out.println("Enter Your Choice");
        ch=x.nextInt();
            switch (ch) {
                case 1:
                    int i =0;
                    while (i==0){
                        User user = new User();
                        System.out.println("Enter User Id");
                        user.setUserId(x.nextLong());
                        x.nextLine();
                        System.out.println("Enter User name");
                        user.setUserName(x.nextLine());
                        System.out.println("Enter User Contact");
                        user.setUserContact(x.nextLine());
                        System.out.println("Enter User City");
                        user.setUserCity(x.nextLine());
                        System.out.println("Enter User State");
                        user.setUserState(x.nextLine());

                        boolean b = userController.isUserExist(user);
                        System.out.println(b);
                        if(b){
                            System.out.println("user exist");
                        }
                        else if(b==false){
                            User u = userController.addUser(user);
                            if(u!=null){
                                i=1;
                            }
                        }else{
                            break;
                        }
                    }
                    break;
                case 2:
                    List<User> userList = userController.selectUser();
                    userList.forEach(System.out::println);
                    break;
                case 3:
                    userList = userController.deletUser();
                    userList.forEach(System.out::println);
                    break;
                case 4:
                    User user1 = new User();
                    userController.updateUser(user1);
                    System.out.println(user1);
                default:
                    System.out.println("Invalid Choice");
            }
        //Adding User
        //User user = userController.addUser();

        // Getting User
        //List<User> userList = userController.selectUser();
        //userList.forEach(System.out::println);

        //Getting selected User Only
//        List<User> userList = userController.selectUser();
//        userList.forEach(System.out::println);

        //Select by Like Keyword
//        List<User> userList = userController.selectUser();
//        userList.forEach(System.out::println);


        //Deleting the user
        //List<User> userList = userController.deletUser();
        //userList.forEach(System.out::println);

        //Updating the user
        //User user = userController.updateUser();
        //System.out.println(user);
    }
}
