package com.maven.repositeries;

import com.maven.connection.DbConnection;
import com.maven.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositories {
    @Autowired
    private DbConnection connection;

    public User insertUser(User user) throws SQLException, ClassNotFoundException {
        Connection con = connection.getConnection();
        String sql = "insert into user (userId, userName, userContact, userCity, userState) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1,user.getUserId());
        ps.setString(2,user.getUserName());
        ps.setString(3, user.getUserContact());
        ps.setString(4, user.getUserCity());
        ps.setString(5, user.getUserState());
        ps.execute();
        con.close();
        return user;
    }

    public List<User> selectUser(User user1) throws SQLException, ClassNotFoundException {
        Connection connection1 = connection.getConnection();
        PreparedStatement ps = connection1.prepareStatement("SELECT * FROM user WHERE userName = ?");
        ps.setString(1, user1.getUserName());
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        List<User> userList = new ArrayList<>();
        while (resultSet.next()){
            User user = new User();
            user.setUserId(resultSet.getLong(1));
            user.setUserName(resultSet.getString(2));
            user.setUserContact(resultSet.getString(3));
            user.setUserCity(resultSet.getString(4));
            user.setUserState(resultSet.getString(5));
            userList.add(user);
        }
        return userList;
    }

    public List<User> deletUser(Long id) throws SQLException, ClassNotFoundException {
        Connection connection2 = connection.getConnection();
        PreparedStatement ps = connection2.prepareStatement("DELETE FROM user WHERE userId = ?");
        ps.setLong(1,id);
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        List<User> userList = new ArrayList<>();
        return userList;
    }

    public User updateUser(User user) throws Exception{
        Connection connection1 = connection.getConnection();
        PreparedStatement ps = connection1.prepareStatement("UPDATE user SET userState = ?, userId= ? WHERE userName = ?");
        ps.setString(1, user.getUserState());
        ps.setLong(2, user.getUserId());
        ps.setString(3, user.getUserName());
        ps.execute();
        return user;
    }
}
