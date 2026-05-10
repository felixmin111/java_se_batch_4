package org.example.assigment.thiri.Day13.repository;

import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DogRepository extends AbstractPetRepository<Dog>{

    @Override
    protected String getInsertSql() {
        return "INSERT INTO dogs (name, age, color, breed, is_trained) VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement ps, Dog dog) throws SQLException {
        ps.setString(1, dog.getName());
        ps.setInt(2, dog.getAge());
        ps.setString(3, dog.getColor());
        ps.setString(4, dog.getBreed());
        ps.setBoolean(5, dog.isTrained());
    }
    @Override
    protected void setGeneratedId(ResultSet rs, Dog dog) throws SQLException {
        dog.setId(rs.getInt(1));
    }

    @Override
    protected String getFindAllSql() {

        return "SELECT id, name, age, color, breed, is_trained FROM dogs";
    }


    @Override
    protected String getUpdateSql() {
        // 5 columns to change + 1 ID for the WHERE clause = 6 total parameters
        return "UPDATE dogs SET name=?, age=?, color=?, breed=?, is_trained=? WHERE id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement ps, Dog dog) throws SQLException {
        ps.setString(1, dog.getName());
        ps.setInt(2, dog.getAge());
        ps.setString(3, dog.getColor());
        ps.setString(4, dog.getBreed());
        ps.setBoolean(5, dog.isTrained());
        ps.setInt(6, dog.getId()); // This is parameter index 6
    }

    @Override
    protected String getDeleteSql() {
        return "delete from dogs where id=?;";
    }

    @Override
    protected Dog mapRow(ResultSet rs) throws SQLException {
        return new Dog(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("color"),
                Pet.PetType.DOG,
                rs.getString("breed"),
                rs.getBoolean("is_trained") // Changed from isTrained to match SQL
        );
    }

}
