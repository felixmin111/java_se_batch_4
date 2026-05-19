package org.example.assigment.aung.zoo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.assigment.aung.zoo.model.Animal;

public class AnimalRepo {
    public void saveAnimal(Animal animal) {
        String sql = "insert into zoo (name, age, owner_name, weight, tame) values (?,?,?,?,?)";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, animal.getName());
            pstmt.setInt(2, animal.getAge());
            pstmt.setString(3, animal.getOwnerName());
            pstmt.setInt(4, animal.getWeight());
            pstmt.setBoolean(5, animal.isTame());

            pstmt.executeUpdate();

        }
        catch (SQLException e) {
            System.out.println("Failed to save Animal");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
