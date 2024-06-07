package com.maven.repositeries;

import com.maven.connection.DbConnection;
import com.maven.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class UserRepositories {

    public User insertUser() throws SQLException, ClassNotFoundException {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.getConnection();
        String sql = "insert into user (userId, userName, userContact, userCity, userState) values (?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,1);
        ps.setString(2,"Tushar Yadhav");
        ps.setString(3, "9595143472");
        ps.setString(4, "Kolhapur");
        ps.setString(5, "Maharashtra");
        ps.execute();
        connection.close();
        return new User();
    }
}
