package org.example.Day23.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL="jdbc:postgresql://localhost:5432/bank_db";
    private static final String USERNAME="postgres";
    private static final String PASSWORD="root";
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        return connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
