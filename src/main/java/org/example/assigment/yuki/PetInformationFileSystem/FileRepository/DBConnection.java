package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URl="jdbc:postgresql://localhost:5432/pet_db";
    private static final String User="postgres";
    private static final String Pass="yuki312";
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
