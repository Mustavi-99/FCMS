package com.example.fcms;

import java.sql.*;

public class DBConnection {
    Statement statement;
    Connection connection;

    public DBConnection() {
        try {
            String url = "jdbc:sqlserver://MIDAS-S531FL\\SQLEXPRESS:1400;databaseName=FCMS";
            String user = "sa";
            String pass = "123456";
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }


}
