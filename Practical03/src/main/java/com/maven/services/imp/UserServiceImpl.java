package com.maven.services.imp;

import com.maven.entities.User;
import com.maven.repositeries.UserRepositories;
import com.maven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User createUser(User user) throws SQLException, ClassNotFoundException {
        return userRepositories.insertUser(user);
    }

    @Override
    public List<User> getAllUser(User user1) throws Exception {
        return userRepositories.selectUser(user1);
    }

    @Override
    public List<User> deletUser(Long id) throws Exception {
        return userRepositories.deletUser(id);
    }

    @Override
    public User updateUser(User user) throws Exception {
        return userRepositories.updateUser(user);
    }


}
