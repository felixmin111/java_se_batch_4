package org.example.assigment.aung.petassignment.repository;

import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DogDatabaseRepository extends AbstractPetRepository<Dog> {

    @Override
    protected String getInsertSql() {
        return "insert into dogs(id, name, age, type, color, breed, isTrained) values(?,?,?,?,?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Dog dog) throws SQLException {
        preparedStatement.setString(1, dog.getId());
        preparedStatement.setString(2, dog.getName());
        preparedStatement.setInt(3, dog.getAge());
        preparedStatement.setString(4, dog.getType().name());
        preparedStatement.setString(5, dog.getColor());
        preparedStatement.setString(6, dog.getBreed());
        preparedStatement.setBoolean(7, dog.isTrained());
    }

    @Override
    protected String getFindAllSql() {
        return "select id, name, age, type, color, breed, isTrained from dogs";
    }

    @Override
    protected String getUpdateSql() {
        return "update dogs set name=?, age=?, type=?, color=?, breed=?, isTrained=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Dog dog) throws SQLException {
        preparedStatement.setString(1, dog.getName());
        preparedStatement.setInt(2, dog.getAge());
        preparedStatement.setString(3, dog.getType().name());
        preparedStatement.setString(4, dog.getColor());
        preparedStatement.setString(5, dog.getBreed());
        preparedStatement.setBoolean(6, dog.isTrained());
        preparedStatement.setString(7, dog.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from dogs where id=?";
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
                rs.getBoolean("isTrained")
        );
    }
}
