package org.example.assigment.lapyae.day13Pet.repository;

import org.example.assigment.lapyae.day13Pet.model.Dog;
import org.example.assigment.lapyae.day13Pet.model.Pet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DogDBRepo extends AbstractpetRepository<Dog> {
    @Override
    protected String getInsertSql() {
        return "INSERT INTO dogs (name, age, type, color, breed, isTrained) VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement ps, Dog dog) throws SQLException {
        ps.setString(1, dog.getName());
        ps.setInt(2, dog.getAge());
        ps.setString(3, dog.getType().name());
        ps.setString(4, dog.getColor());
        ps.setString(5, dog.getBreed());
        ps.setBoolean(6, dog.isTrained());
    }

    @Override
    protected String getFindAllSql() {
        return "SELECT * FROM dogs";
    }

    @Override
    protected String getUpdateSql() {
        return "UPDATE dogs SET name=?, age=?, type=?, color=?, breed=?, isTrained=? WHERE id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement ps, Dog dog) throws SQLException {
        ps.setString(1, dog.getName());
        ps.setInt(2, dog.getAge());
        ps.setString(3, dog.getType().name());
        ps.setString(4, dog.getColor());
        ps.setString(5, dog.getBreed());
        ps.setBoolean(6, dog.isTrained());
        ps.setInt(7, Integer.parseInt(dog.getId()));
    }

    @Override
    protected String getDeleteSql() {
        return "DELETE FROM dogs WHERE id=?";
    }

    @Override
    protected Dog mapRow(ResultSet rs) throws SQLException {
        return new Dog(
                rs.getString("id"),
                rs.getString("name"),
                rs.getInt("age"),
                Pet.Type.valueOf(rs.getString("type")),
                rs.getString("color"),
                rs.getString("breed"),
                rs.getBoolean("isTrained"));
    }
}