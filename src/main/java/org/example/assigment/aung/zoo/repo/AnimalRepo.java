package org.example.assigment.aung.zoo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.assigment.aung.zoo.model.Animal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public List<Animal> getAllAnimals(){
        List<Animal> animals = new ArrayList<>();
        String sql = "select * from zoo";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String ownerName = rs.getString("owner_name");
                int weight = rs.getInt("weight");
                boolean tame = rs.getBoolean("tame");

                Animal animal = new Animal(id, name, age, ownerName, weight, tame);

                animals.add(animal);
            }



        }
        catch (SQLException e) {
            System.out.println("Failed to get all Animals");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return animals;
    }
}
