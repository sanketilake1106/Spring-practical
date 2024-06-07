package com.maven;

import com.maven.configruation.SpringConfig;
import com.maven.entities.User;
import com.maven.repositeries.UserRepositories;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class App
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserRepositories userRepositories = context.getBean("userRepositories", UserRepositories.class);
        User user = userRepositories.insertUser();
    }
}
