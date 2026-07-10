package org.example.Day18.repository;

import org.example.Day18.model.Category;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRepository extends AbstractRepository<Category> {
    @Override
    protected String getInsertSql() {
        return "insert into categories(name,description,code) values(?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Category pc) throws SQLException {
        preparedStatement.setString(1, pc.getName());
        preparedStatement.setString(2, pc.getDescription());
        preparedStatement.setString(3, pc.getCode());

    }

    @Override
    protected void setGeneratedId(ResultSet rs, Category productCategory) throws SQLException {
        productCategory.setId(rs.getInt(1));
    }

    @Override
    protected String getFindAllSql() {
        return """
           SELECT 
               id,
               name,
               description,
               code
           FROM categories
           ORDER BY id DESC
           """;
    }

    @Override
    protected String getUpdateSql() {
        return "update categories set name=?,description=?,code=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Category pc) throws SQLException {
        preparedStatement.setString(1, pc.getName());
        preparedStatement.setString(2, pc.getDescription());
        preparedStatement.setString(3, pc.getCode());
        preparedStatement.setInt(4, pc.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from categories where id=?";
    }

    @Override
    protected String getFindbyNameSql() {
        return """
           SELECT id, name, description, code
           FROM categories
           WHERE name = ?
           """;
    }

    @Override
    protected Category mapRow(ResultSet rs) throws SQLException{
        Category category = new Category(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getString("code")
        );
        return category;
    }


}
