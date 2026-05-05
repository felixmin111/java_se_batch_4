package org.example.assigment.aung.petassignment.repository;

import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DogDatabaseRepository {
    public List<Dog> findAll(){
        List<Dog> dogs = new ArrayList<>();
        String sql = "select id, name, age, type, color, breed, isTrained from dogs";

        try (Connection conn = DBConnection_pet.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Dog dog = new Dog(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    Pet.Type.valueOf(rs.getString("type")),
                    rs.getString("color"),
                    rs.getString("breed"),
                    rs.getBoolean("isTrained")
                );
                dogs.add(dog);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return dogs;
    }
    

    public void save(Dog dog){
        String sql = "insert into dogs(id,name,age,type,color,breed,isTrained) values(?,?,?,?,?,?,?)";
        try(Connection conn = DBConnection_pet.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, dog.getId());
            ps.setString(2, dog.getName());
            ps.setInt(3, dog.getAge());
            ps.setString(4, dog.getType().name());
            ps.setString(5, dog.getColor());
            ps.setString(6, dog.getBreed());
            ps.setBoolean(7, dog.isTrained());

            ps.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Dog dog){
        String sql = "update dogs set name=?, age=?, type=?, color=?, breed=?, isTrained=? where id=?";
        try(Connection conn = DBConnection_pet.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, dog.getName());
            ps.setInt(2, dog.getAge());
            ps.setString(3, dog.getType().name());
            ps.setString(4, dog.getColor());
            ps.setString(5, dog.getBreed());
            ps.setBoolean(6, dog.isTrained());
            ps.setString(7, dog.getId());

            ps.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(String id) {
        String sql = "delete from dogs where id=?";
        try(Connection conn = DBConnection_pet.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, id);
            ps.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
