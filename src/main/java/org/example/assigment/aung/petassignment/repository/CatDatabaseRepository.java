package org.example.assigment.aung.petassignment.repository;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Pet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatDatabaseRepository {
    public List<Cat> findAll() {
        List<Cat> cats = new ArrayList<>();
        String sql = "select id, name, age, type, color, isIndoor, furlength from cats";

        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cat cat = new Cat(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        Pet.Type.valueOf(rs.getString("type")),
                        rs.getString("color"),
                        rs.getBoolean("isIndoor"),
                        Cat.Furlength.valueOf(rs.getString("furlength"))
                );
                cats.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cats;
    }

    public void save(Cat cat) {
        String sql = "insert into cats (id, name, age, type, color, isIndoor, furlength) values (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cat.getId());
            ps.setString(2, cat.getName());
            ps.setInt(3, cat.getAge());
            ps.setString(4, cat.getType().name());
            ps.setString(5, cat.getColor());
            ps.setBoolean(6, cat.isIndoor());
            ps.setString(7, cat.getFurlength().name());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Cat cat) {
        String sql = "update cats set name=?, age=?, type=?, color=?, isIndoor=?, furlength=? where id=?";

        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cat.getName());
            ps.setInt(2, cat.getAge());
            ps.setString(3, cat.getType().name());
            ps.setString(4, cat.getColor());
            ps.setBoolean(5, cat.isIndoor());
            ps.setString(6, cat.getFurlength().name());
            ps.setString(7, cat.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(String id) {
        String sql = "delete from cats where id=?";

        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
