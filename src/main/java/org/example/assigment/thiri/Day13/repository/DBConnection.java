package org.example.assigment.thiri.Day13.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URl="jdbc:postgresql://localhost:5432/Pet";
    private static final String User="postgres";
    private static final String Password="root";

        public static java.sql.Connection getConnection() throws SQLException {
            Connection connection = DriverManager.getConnection(URl,User,Password);
            if(connection==null){
                System.out.println("Connection is unavailable....!");
                throw new java.sql.SQLException();
            }else{
                System.out.println("Connection is available....!");
                return connection;
            }
        }
}
