package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DogRepository extends AbstractRepository<Dog>{

    @Override
    protected String getInsertSql() {
        return " insert into dogs(name,age,color,breed,is_trained) values(?,?,?,?,?)";
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
        return "select * from dogs order by id desc";
    }

    @Override
    protected String getUpdateSql() {
        return " update dogs set name=?, age=?, color=?, breed=?, is_trained=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement ps, Dog dog) throws SQLException {
        ps.setString(1, dog.getName());
        ps.setInt(2, dog.getAge());
        ps.setString(3, dog.getColor());
        ps.setString(4, dog.getBreed());
        ps.setBoolean(5, dog.isTrained());
        ps.setInt(6, dog.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from dogs where id=?";
    }

    @Override
    protected Dog mapRow(ResultSet rs) throws SQLException {
        return new Dog(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("color"),
                rs.getString("breed"),
                rs.getBoolean("is_trained")
        );
    }
}