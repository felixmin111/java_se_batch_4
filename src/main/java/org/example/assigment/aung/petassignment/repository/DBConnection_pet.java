package org.example.assigment.aung.petassignment.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection_pet {
    private static final String URl="jdbc:postgresql://localhost:5432/animal_db";
    private static final String User="postgres";
    private static final String Pass="root";
    public static Connection getConnection() throws SQLException {
        Connection connection=DriverManager.getConnection(URl,User,Pass);
        if(connection==null){
            System.out.println("Connection is unavailable....!");
            throw new SQLException();
        }else{
            System.out.println("Connection is available....!");
            return connection;
        }
    }
}

