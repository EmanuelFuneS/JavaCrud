package org.example.view;


import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.repository.Repository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;


public class SwingApp extends JFrame {
    private final Repository<Employee>;
    private final JTable employeeTable;


    public SwingApp (){
        setTitle("Gestion de Empleados");
        setDefautlCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 230);

        employeeTable = new JTable();
        JScrollPane scrollPane = new JScrollPane((employeeTable));
        add(scrollPane, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar");
        JButton updateButton = new JButton("Actualizar");
        JButton deleteButton = new JButton("Eliminar");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        //styles


        //
        employeeRepository = new EmployeeRepository();

        refreshEmployyeTable();

        addButton.addActionListener(e ->{
            try {
                System.out.println();
            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
        });


    }


}
