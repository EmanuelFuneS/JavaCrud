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
        try (Connection myConn = DatabaseConnection.getInstance(); Statement myStmt = myConn.createStatement(); ResultSet myRes = myStmt.executeQuery("SELECT * FROM employees");) {
            Repository<Employee> repository = new EmployeeRepository();

            System.out.println("---LISTING-----");

            repository.findAll().forEach(System.out::println);

            System.out.println("---CREATING---");
            /*Employee employee = new Employee();


            employee.setFirst_name("Emanuel");
            employee.setPa_surname("Funes");
            employee.setMa_surname("Santucho");
            employee.setEmail("Emanuelfun@gmail.com");
            employee.setSalary(500F);
            repository.save(employee);*/




            System.out.println("---SEARCHING--BY--ID---");
            /*Employee user = repository.getById(8);

            user.setSalary((float)700);
            System.out.println(user);
            System.out.println("---UPDATE---");
            repository.save(user);*/

            System.out.println("---DELETE---");

            repository.delete(7);

            System.out.println(repository.findAll());


        }
    }
}