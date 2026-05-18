package org.example.assigment.aung.zoo;

import org.example.assigment.aung.zoo.repo.DBconnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            DBconnection db = new DBconnection();
            db.CheckConnection();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            System.out.println(e.getMessage());
        }

    }
}
