package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

public class CatRepository extends AbstractRepository<Cat>{
    @Override
    protected String getInsertSql() {
        return "insert into cats(name,age,color,is_indoor,fur_length) values(?,?,?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement ps, Cat cat) throws SQLException {
        ps.setString(1, cat.getName());
        ps.setInt(2, cat.getAge());
        ps.setString(3, cat.getColor());
        ps.setBoolean(4, cat.isIndoor());
        ps.setDouble(5, cat.getFurLength());
    }

    @Override

    protected void setGeneratedId(ResultSet rs, Cat cat) throws SQLException {
        cat.setId(rs.getInt(1));
    }

    @Override
    protected String getFindAllSql() {
        return " select * from cats order by id desc ";
    }

    @Override
    protected String getUpdateSql() {
        return " update cats set name=?, age=?, color=?, is_indoor=?, fur_length=? where id=? ";
    }

    @Override

    protected void setUpdateParam(PreparedStatement ps, Cat cat) throws SQLException {
        ps.setString(1, cat.getName());
        ps.setInt(2, cat.getAge());
        ps.setString(3, cat.getColor());
        ps.setBoolean(4, cat.isIndoor());
        ps.setDouble(5, cat.getFurLength());
        ps.setInt(6, cat.getId());

    }

    @Override
    protected String getDeleteSql() {
        return "delete from cats where id=?";
    }

    @Override
    protected Cat mapRow(ResultSet rs) throws SQLException {
        return new Cat(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("color"),
                rs.getBoolean("is_indoor"),
                rs.getDouble("fur_length")

        );

    }

}
