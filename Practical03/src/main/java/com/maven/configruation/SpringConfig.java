package com.maven.configruation;

import com.maven.connection.DbConnection;
import com.maven.entities.User;
import com.maven.services.UserService;
import com.maven.services.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = {"com.maven"})
public class SpringConfig {
}
