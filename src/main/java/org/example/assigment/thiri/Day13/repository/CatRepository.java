package org.example.assigment.thiri.Day13.repository;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Pet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatRepository extends AbstractPetRepository<Cat> {

    @Override
    protected String getInsertSql() {
        return "INSERT INTO cats (name, age, color, is_indoor, fur_length) VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Cat cat) throws SQLException {
        preparedStatement.setString(1, cat.getName());
        preparedStatement.setInt(2, cat.getAge());
        preparedStatement.setString(3, cat.getColor());
        preparedStatement.setBoolean(4, cat.isIndoor());
        preparedStatement.setString(5, cat.getLength());
    }

    @Override
    protected void setGeneratedId(ResultSet rs, Cat cat) throws SQLException {
        cat.setId(rs.getInt(1));
    }


    @Override
    protected String getUpdateSql() {
        return "UPDATE cats SET name=?, age=?, color=?, is_indoor=?, fur_length=? WHERE id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Cat cat) throws SQLException {
        preparedStatement.setString(1, cat.getName());
        preparedStatement.setInt(2, cat.getAge());
        preparedStatement.setString(3, cat.getColor());
        preparedStatement.setBoolean(4, cat.isIndoor());
        preparedStatement.setString(5, cat.getLength());
        preparedStatement.setInt(6, cat.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from cats where id=?";
    }


    @Override
    protected String getFindAllSql() {
        return "SELECT id, name, age, color, is_indoor, fur_length FROM cats";
    }


    @Override
    protected Cat mapRow(ResultSet rs) throws SQLException {
        return new Cat(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("color"),
                Pet.PetType.CAT,
                rs.getBoolean("is_indoor"), // Ensure underscore
                rs.getString("fur_length")  // Ensure underscore
        );
    }
}