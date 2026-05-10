package org.example.assigment.lapyae.day13Pet.repository;

import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.model.Pet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatDBRepo extends AbstractpetRepository<Cat> {

    @Override
    protected String getInsertSql() {

        return "INSERT INTO cats (name, age, type, color, isIndoor, furLength) VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement ps, Cat cat) throws SQLException {

        ps.setString(1, cat.getName());
        ps.setInt(2, cat.getAge());
        ps.setString(3, cat.getType().name());
        ps.setString(4, cat.getColor());
        ps.setBoolean(5, cat.isIndoor());
        ps.setString(6, cat.getFurLength().name());
    }

    @Override
    protected String getFindAllSql() {
        return "SELECT * FROM cats";
    }

    @Override
    protected String getUpdateSql() {
        return "UPDATE cats SET name=?, age=?, type=?, color=?, isIndoor=?, furLength=? WHERE id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement ps, Cat cat) throws SQLException {
        ps.setString(1, cat.getName());
        ps.setInt(2, cat.getAge());
        ps.setString(3, cat.getType().name());
        ps.setString(4, cat.getColor());
        ps.setBoolean(5, cat.isIndoor());
        ps.setString(6, cat.getFurLength().name());
        ps.setInt(7, Integer.parseInt(cat.getId()));
    }

    @Override
    protected String getDeleteSql() {
        return "DELETE FROM cats WHERE id=?";
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
                Cat.FurLength.valueOf(rs.getString("furLength")));
    }
}
