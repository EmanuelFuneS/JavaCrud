package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/projects";
    private static final String user = "root";
    private static final String password = "localhost";

    private static Connection myConn;

    public static Connection getInstance() throws SQLException {
        if(myConn == null){
            myConn = DriverManager.getConnection(url, user, password);
        }
        return myConn;
    }
}
