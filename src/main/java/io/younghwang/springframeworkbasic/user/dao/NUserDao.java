package io.younghwang.springframeworkbasic.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDaoJdbc {
    public NUserDao() {
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/spring-framework-basic", "sa", "");
        return c;
    }
}
