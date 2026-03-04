package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String url = System.getenv("DB_URL");
    private static final String user = System.getenv("DB_USER");
    private static final String password = System.getenv("DB_PASSWORD");

    private static Connection myConn;

    public static Connection getInstance() throws SQLException {
        if(myConn == null){
            myConn = DriverManager.getConnection(url, user, password);
        }
        return myConn;
    }
}
