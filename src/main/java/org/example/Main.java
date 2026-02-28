package org.example;

import org.example.util.DatabaseConnection;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (Connection myConn = DatabaseConnection.getInstance(); Statement myStamt = myConn.createStatement(); ResultSet myRes = myStamt.executeQuery("SELECT * FROM employees");) {
            System.out.println("Connection Success");

            while (myRes.next()) {

                System.out.println(myRes.getString("first_name") + " , " + myRes.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            throw new RuntimeException(e);
        }
    }
}