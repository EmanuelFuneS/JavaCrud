package org.example;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.repository.Repository;
import org.example.util.DatabaseConnection;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection myConn = DatabaseConnection.getInstance(); Statement myStamt = myConn.createStatement(); ResultSet myRes = myStamt.executeQuery("SELECT * FROM employees");) {
            Repository<Employee> repository = new EmployeeRepository();

            repository.findAll().forEach(System.out::println);
        }
    }
}