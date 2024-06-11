package com.maven.services;

import com.maven.entities.User;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface UserService {
    User createUser(User user) throws SQLException, ClassNotFoundException;
    List<User> getAllUser(User user1) throws Exception;
    List<User> deletUser(Long id) throws Exception;

    User updateUser(User user) throws Exception;
}
