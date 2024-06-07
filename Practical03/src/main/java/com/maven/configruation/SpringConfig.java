package com.maven.configruation;

import com.maven.connection.DbConnection;
import com.maven.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = {"com.maven.entities","com.maven.repositeries"})
public class SpringConfig {

    @Autowired
    private User user;

//    @Bean
//    public User getUser(){
//        user.setUserId(1001L);
//        user.setUserName("Sanket Ilake");
//        user.setUserContact("7057891106");
//        user.setUserCity("Kolhapur");
//        user.setUserState("Maharashtra");
//        return user;
//    }

}
