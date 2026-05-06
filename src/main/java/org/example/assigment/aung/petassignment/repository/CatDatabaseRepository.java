package org.example.assigment.aung.petassignment.repository;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Pet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatDatabaseRepository extends AbstractPetRepository<Cat> {

    @Override
    protected String getInsertSql() {
        return "insert into cats(id, name, age, type, color, isIndoor, furlength) values(?,?,?,?,?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Cat cat) throws SQLException {
        preparedStatement.setString(1, cat.getId());
        preparedStatement.setString(2, cat.getName());
        preparedStatement.setInt(3, cat.getAge());
        preparedStatement.setString(4, cat.getType().name());
        preparedStatement.setString(5, cat.getColor());
        preparedStatement.setBoolean(6, cat.isIndoor());
        preparedStatement.setString(7, cat.getFurlength().name());
    }

    @Override
    protected String getFindAllSql() {
        return "select id, name, age, type, color, isIndoor, furlength from cats";
    }

    @Override
    protected String getUpdateSql() {
        return "update cats set name=?, age=?, type=?, color=?, isIndoor=?, furlength=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Cat cat) throws SQLException {
        preparedStatement.setString(1, cat.getName());
        preparedStatement.setInt(2, cat.getAge());
        preparedStatement.setString(3, cat.getType().name());
        preparedStatement.setString(4, cat.getColor());
        preparedStatement.setBoolean(5, cat.isIndoor());
        preparedStatement.setString(6, cat.getFurlength().name());
        preparedStatement.setString(7, cat.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from cats where id=?";
    }

    @Override
    protected Cat mapRow(ResultSet rs) throws SQLException {
        return new Cat(
                rs.getString("id"),
                rs.getString("name"),
                rs.getInt("age"),
                Pet.Type.valueOf(rs.getString("type")),
                rs.getString("color"),
                rs.getBoolean("isIndoor"),
                Cat.Furlength.valueOf(rs.getString("furlength"))
        );
    }
}
