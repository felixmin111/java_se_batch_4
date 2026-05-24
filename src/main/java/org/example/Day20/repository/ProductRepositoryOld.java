package org.example.Day20.repository;

import org.example.Day20.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRepositoryOld extends AbstractRepository<Product> {
    @Override
    protected String getInsertSql() {
        return "insert into products(name,price,quantity) values(?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());

    }

    @Override
    protected void setGeneratedId(ResultSet rs, Product product) throws SQLException {
      product.setId(rs.getInt(1));
    }

    @Override
    protected String getFindAllSql() {
        return "select id,name,price,quantity from products order by id desc";
    }

    @Override
    protected String getUpdateSql() {
        return "update products set name=?,price=?,quantity=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setInt(4, product.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from products where id=?";
    }

    @Override
    protected Product mapRow(ResultSet rs) throws SQLException{
        return new Product(rs.getInt("id"),
                           rs.getString("name"),
                           rs.getDouble("price"),
                           rs.getInt("quantity"));
    }


}
