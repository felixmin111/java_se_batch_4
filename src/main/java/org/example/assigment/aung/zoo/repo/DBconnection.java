package org.example.assigment.aung.zoo.repo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/zoo";
    private static final String USER = "postgres";
    private static final String PASS = "root";

    public static Connection CheckConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASS);
        if (connection == null) {
            System.out.println("Unavailable DB!!");
            throw new SQLException();
        } else {
            System.out.println("Connection is available....!");
            return connection;
        }
    }
}
